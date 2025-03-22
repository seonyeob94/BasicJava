package kr.or.ddit.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import lombok.Data;
import util.ScanUtil;

public class JsonMember {
	public static void main(String[] args) {
		JsonMember obj = new JsonMember();
		obj.init();
		obj.process();
	}

	private final String FILE_PATH = "json/member.json";
	private List<Member> memberList;

	public void process() {
		while (true) {
			System.out.println("1. 회원리스트 출력");
			System.out.println("2. 회원 가입");
			System.out.println("3. 회원 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 종료");

			int sel = ScanUtil.select();
			if (sel == 1) printMember(memberList);
			if (sel == 2) regisJson();
			if (sel == 3) memberUpdate(memberList);
			if (sel == 4) memberDel(memberList);
			else if (sel == 5)
				break;
		}
	}
	
	public void memberUpdate(List<Member> memberList) {
		printMember(memberList);
		
		int sel = ScanUtil.nextInt("수정할 회원번호 : ");
		Member member = null;
		for(Member m : memberList) {
			if(m.getNo()==sel) member=m;
		}
		if(member==null) System.out.println("해당 회원번호는 없습니다.");
		else {
			String name = ScanUtil.nextLine("회원명 : ");
			int age = ScanUtil.nextInt("나이 : ");
			member.setName(name);
			member.setAge(age);

			printMember(memberList);
		}
		
		saveJson();
		
	}
	
	public void memberDel(List<Member> memberList) {
		printMember(memberList);

		int sel = ScanUtil.nextInt("삭제할 회원번호 : ");
		
		for(int i=0; i<memberList.size();i++) {
			if(memberList.get(i).getNo()==sel) memberList.remove(i);
		}

		printMember(memberList);
		
	}

	public void init() {
		File memberFile = new File(FILE_PATH);
		if (!memberFile.exists() || memberFile.length() == 0) {
			memberList = new ArrayList<>();
			try (FileWriter fw = new FileWriter(memberFile)) {
				fw.write("[]");
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			memberList = loadMembers();
		}
	}

	public void regisJson() {
	    Member m = new Member();
	    int nextNo = 1;
	    for (Member member : memberList) {
	        if (member.getNo() >= nextNo) {
	            nextNo = member.getNo() + 1;
	        }
	    }
	    m.setNo(nextNo);
	    m.setName(ScanUtil.nextLine("회원명 : "));
	    m.setAge(ScanUtil.nextInt("나이 : "));
	    addMember(m); 
	    System.out.println("회원 가입 완료");
		printMember(memberList);
	}

	private void addMember(Member newMember) {
		memberList.add(newMember);
		saveJson();
	}

	public void saveJson() {
		JSONArray jArr = new JSONArray();
		// memberList의 모든 회원 정보를 JSON 객체로 변환하여 jArr에 추가
		for (Member m : memberList) {
			JSONObject jsonMember = new JSONObject();
			jsonMember.put("no", m.getNo());
			jsonMember.put("name", m.getName());
			jsonMember.put("age", m.getAge());
			jArr.add(jsonMember);
		}

		try (FileWriter fw = new FileWriter(FILE_PATH)) {
			fw.write(jArr.toJSONString());
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private List<Member> loadMembers() {
		List<Member> list = new ArrayList<>();
		JSONParser parser = new JSONParser();

		try (FileReader reader = new FileReader(FILE_PATH)) {
			JSONArray jsonArr = (JSONArray) parser.parse(reader);
			for (Object obj : jsonArr) {
				JSONObject jsonMember = (JSONObject) obj;
				Member m = new Member();
				m.setNo(( (Long) jsonMember.get("no")).intValue()); // JSON의 숫자는 Long 타입으로 읽힘
				m.setName((String) jsonMember.get("name"));
				m.setAge(((Long) jsonMember.get("age")).intValue());
				list.add(m);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

//	public void addMember(List<Member> memberList) {
////		JSONObject jobj = new JSONObject();
////		JSONArray jArr = new JSONArray();
//		memberList = loadMembers();
//		int no = 0;
//		for (Member member : memberList) {
//			if (no < member.getNo())
//				no = member.getNo();
//		}
//		no++;
//		String name = ScanUtil.nextLine("이름 : ");
//		int age = ScanUtil.nextInt("나이 : ");
//
//		Member member = new Member();
//		member.setNo(no);
//		member.setName(name);
//		member.setAge(age);
//		memberList.add(member);
//
////		try {
////			FileWriter fw = new FileWriter(FILE_PATH);
////			fw.write(jobj.toJSONString());
////			fw.flush();
////			fw.close();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//
//	}

	public void printMember(List<Member> memberList) {
		if (memberList == null || memberList.isEmpty()) {
			System.out.println("회원이 존재하지 않습니다.");
			return;
		}
		System.out.println("회원번호\t회원명\t나이");
		for (Member member : memberList) {
			System.out.println(member.getNo() + "\t" + member.getName() + "\t" + member.getAge());
		}

	}

}

@Data
class Member {
	private int no;
	private String name;
	private int age;
}
