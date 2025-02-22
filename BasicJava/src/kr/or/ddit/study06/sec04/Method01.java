package kr.or.ddit.study06.sec04;

public class Method01 {
	public static void main(String[] args) {
		Method01 m1 = new Method01();
		m1.method1();		
		m1.method1(10,15);		
	}
	// 메소드에도 오버로딩이 적용된다.
	
	
	public void method1() {
		System.out.println("public void method1()");
	}
	

	public void method1(int a, int b) {
		System.out.println("public void method1(int a, int b)");
		System.out.println("a : "+ a+", b : " +b);
	}
	
	
}
