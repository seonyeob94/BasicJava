package kr.or.ddit.study06.sec04;

public class Method04Main {

	public static void main(String[] args) {
		Method04 m1 = new Method04();
		m1.a= 10;
		
		Method04 m2 =new Method04();
		m2.a = 20;
		
		m1.method1();
		m2.method1();
		
		m1.method2();
		m1.method3(m2);
	}
}
