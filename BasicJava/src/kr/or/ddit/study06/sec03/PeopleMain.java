package kr.or.ddit.study06.sec03;

public class PeopleMain {
	public static void main(String[] args) {
//		String nation;
//		String name;
//		String room;
//		int age;
		
		// 일본 402호 일본인, 20
		People p1 = new People("일본","402호","일본인",20);
		System.out.println(p1);
		
		// 401호, 성윤정, 20
		People p2 = new People("401호","성윤정",20);
		System.out.println(p2);
		
		// 405호 주대현, 20
		People p3 = new People("주대현",20);
		System.out.println(p3);
		
		// 405호 김석원, 20
		People p4 = new People("김석원",20);
		System.out.println(p4);
	}
}
