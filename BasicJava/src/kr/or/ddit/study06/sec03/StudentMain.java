package kr.or.ddit.study06.sec03;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name= "김승준";
		s1.age=20;
		
		Student s2= new Student("이지은",20);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
