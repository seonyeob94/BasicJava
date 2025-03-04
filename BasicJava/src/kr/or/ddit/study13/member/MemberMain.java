package kr.or.ddit.study13.member;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.util.ScanUtil;

public class MemberMain {
	public static void main(String[] args) {
		MemberMain obj = new MemberMain();
		obj.process();
	}
	List<MemberVo> memberList;
	public void process() {
		
		memberList = new ArrayList<MemberVo>();
		MemberVo m1 = new MemberVo();
		m1.setId("a001");
		m1.setName("회원1");
		m1.setAge(20);
		
		MemberVo m2 = new MemberVo();
		m2.setId("a002");
		m2.setName("회원2");
		m2.setAge(20);
		
		MemberVo m3 = new MemberVo();
		m3.setId("a003");
		m3.setName("회원3");
		m3.setAge(20);
		
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		
		//회원 crud
		while(true) {
			// 1. 회원 전체 출력
			// 2. 회원 가입
			// 3. 회원 삭제
			// 4. 회원 수정
			System.out.println("1. 회원 전체 출력");
			System.out.println("2. 회원 가입");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 수정");
			
			int sel = ScanUtil.select();
			
			if(sel==1) printAll();
			if(sel==2) memberJoin();
			if(sel==3) memberDelete();
			if(sel==4) memberUpdate();
		}
	}
	
	
	
	public void printAll() {
		// 전체 회원 출력하기
		
		System.out.println("번호\t아이디\t이름\t나이");
		for(int i=0;i<memberList.size();i++) {
			MemberVo member = memberList.get(i);
			System.out.println((i+1)+".\t"+member.getId()+"\t"+member.getName()+"\t"+member.getAge());
		}
		
		
		
	}
	
	public void memberJoin() {
		String id = ScanUtil.next("아이디 : ");
		String name = ScanUtil.next("이름 : ");
		int age = ScanUtil.nextInt("나이 : ");
		
		MemberVo mm = new MemberVo();
		mm.setId(id);
		mm.setName(name);
		mm.setAge(age);
		// memberList.add(1, mm); 일정 자리에 mm을 저장
		memberList.add(mm);
		
		
		System.out.println("회원가입이 완료되었습니다.");
		
		printAll();
	}
	
	public void memberDelete() {
		printAll();
		//회원 번호 입력후 삭제
		
		int sel = ScanUtil.nextInt("회원 삭제 : ")-1;
		MemberVo member = memberList.remove(sel);
		System.out.println(member.getName()+"님이 삭제 되었습니다");
		printAll();
	}

	
	public void memberUpdate() {
		printAll();
		//회원 번호 입력후 수정
		// 이름, 나이만 수정
		
		int sel =ScanUtil.nextInt("수정할 회원번호 : ")-1;
		MemberVo member = memberList.get(sel);
		
		String name = ScanUtil.next("이름 : ");
		int age = ScanUtil.nextInt("나이 : ");
		member.setName(name);
		member.setAge(age);
		
//		memberList.set(sel, member);
		printAll();
	}
}
