package kr.or.ddit.study06.sec03;

public class Constructor03 {
	public Constructor03() {
		this("test");
		System.out.println("기본생성자");
	}
	
	public Constructor03(String a) {
		this(a,"test2");
		System.out.println("생성자 String a");
		System.out.println(a);
	}
	
	public Constructor03(String a, String b) {
		System.out.println("생성자 String a, String b");
		System.out.println(a+", "+b);
		
	}
}
