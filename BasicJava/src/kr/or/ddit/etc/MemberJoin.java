package kr.or.ddit.etc;

import kr.or.ddit.util.ScanUtil;

public class MemberJoin {
	public static void main(String[] args) {
		MemberJoin mj = new MemberJoin();
		mj.process();
	}
	
	static int cnt;
	static Member[] memList = new Member[50];
	public void process() {
		
		while(true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 정보 수정");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 전체 출력");
			System.out.println("5. 프로그램 종료");
			int sel = ScanUtil.select();
			
			if(sel == 1) memberJoin();
			if(sel == 2) memberUpdate();
			if(sel == 3) memberDelete();
			if(sel == 4) printAll();
			if(sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}

			
		}
		
	}
	
	
	public void memberJoin() {

		String id=ScanUtil.next("ID를 정해주세요 : ");
		String name=ScanUtil.next("이름를 적어주세요 : ");
		int age=ScanUtil.nextInt("나이를 적어주세요 : ");
		
		Member member = new Member();
		member.setId(id);
		member.setName(name);
		member.setAge(age);
		memList[cnt++]=member;
		printAll();
	}
	

	public void memberUpdate() {
		//전체 정보 출력 후 회원 선택 -> 수정
		printAll();
		int sel = ScanUtil.nextInt("회원 선택 : ")-1;
		Member member = memList[sel];
		
		String id=ScanUtil.next("ID를 정해주세요 : ");
		String name=ScanUtil.next("이름를 적어주세요 : ");
		int age=ScanUtil.nextInt("나이를 적어주세요 : ");
		
		member.setId(id);
		member.setName(name);
		member.setAge(age);
		
	}
	
	public void memberDelete() {
		//전체 정보 출력 후 회원 선택 -> 삭제
		//삭제시 배열 앞으로 땡기기
		printAll();
		int sel =ScanUtil.nextInt("삭제할 회원 ")-1;
		
		for(int i=sel;i<cnt;i++) {
			if(i==memList.length-1) {
				memList[i]=null;
			}
			else {
				memList[i]=memList[i+1];
			}
		}
		cnt--;
		printAll();
		
		
	}

	public void printAll() {
		System.out.println("아이디\t이름\t나이");
		System.out.println("=================");
		for(int i=0;i<cnt;i++) {
			System.out.println(memList[i]);
		}
		System.out.println("=================");
	}
	
}

class Member{
	//아이디 이름 나이
	private String id;
	private String name;
	private int age;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return  "id= "+id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}