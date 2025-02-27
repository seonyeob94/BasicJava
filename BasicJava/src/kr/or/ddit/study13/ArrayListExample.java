package kr.or.ddit.study13;

import java.util.ArrayList;

import kr.or.ddit.util.ScanUtil;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayListExample obj = new ArrayListExample();
		obj.process();
	}
	
	
	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		ArrayList<Member> list = new ArrayList<Member>();
		Member member = new Member();
		member.setName("홍길동");
		member.setAge(20);

		Member member2 = new Member();
		member2.setName("강감찬");
		member2.setAge(20);
		
		//회원을 list에 추가하고
		// 출력하시오
		list.add(member);
		list.add(member2);
		
		for(int i=0;i<list.size();i++) {
			Member m = list.get(i);
			System.out.println(m.getName()+", "+m.getAge());
		}
		
		
		//번호를 입력해서 삭제하고 전체 리스트 출력하기
		
		int sel = ScanUtil.nextInt("삭제할 번호 : ");
		
		Member remove = list.remove(sel);
		System.out.println(remove.getName()+"이 삭제되었습니다.");
		
		for(int i=0;i<list.size();i++) {
			Member m =list.get(i);
			System.out.println(m.getName()+", "+m.getAge());
		}
		
		
	}
	
	public void method4() {
		
		// 제네닉 <String>
		// 컬렉션의 타입을 지정 함   
		ArrayList<Integer> list = new ArrayList();
		
		list.add(1);
		
		int i = list.get(0);
	}
	
	public void method3(){
		
		ArrayList list = new ArrayList();
		
		
		list.add("abc");
		list.add(1.7);
		list.add(10);
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		int i= (int)list.get(2);
		System.out.println(i);
		
	}
	
	public void method2() {
		
		int[] numArray = {5, 6, 17, 12};
		
		//3의 배수 값만 저장한 배열을 만드시오.
		//				  ArrayList
		
		
		int cnt=0;
		for ( int num:numArray) {
			if(num%3==0) cnt++;
		}
		
		
		int[] array = new int[cnt];
		cnt=0;
		for ( int num:numArray) {
			if(num%3==0) array[cnt++]=num;
		}
		
		ArrayList list = new ArrayList();
		for(int num:numArray) {
			 list.add(num);
		}
		
		
	}
	
	public void method1() {
		ArrayList list = new ArrayList();
		
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("0번째 값"+list.get(0));
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
