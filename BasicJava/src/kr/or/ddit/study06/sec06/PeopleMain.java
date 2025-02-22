package kr.or.ddit.study06.sec06;

public class PeopleMain {
	public static void main(String[] args) {
//DTO, VO
		People p1 = new People();
		p1.setName("이효재");
		p1.setAge(20);
		
		String name = p1.getName();
		int age = p1.getAge();
		
		System.out.println("name : "+name+", age : "+age);
	}
}
