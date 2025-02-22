package kr.or.ddit.study06.sec02;

public class Membermain {
	public static void main(String[] args) {
		
		//id pass name age
		//a001 1234 강경모 20
		//a002 1234 강보람 20
		Member m1= new Member();
		
		m1.id="a001";
		m1.pass="1234";
		m1.name="강경모";
		m1.age=20;
		
		Member m2= new Member();
		
		m2.id="a002";
		m2.pass="1234";
		m2.name="강보람";
		m2.age=20;
		
		System.out.println("아이디\t패스워드\t이름\t나이");
		System.out.println(m1.id+"\t"+m1.pass+"\t"+m1.name+"\t"+m1.age);
		System.out.println(m2.id+"\t"+m2.pass+"\t"+m2.name+"\t"+m2.age);
		
		System.out.println(m1);
		System.out.println(m2);
		
		
		
	}
}
