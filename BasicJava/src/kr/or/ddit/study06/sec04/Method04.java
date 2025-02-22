package kr.or.ddit.study06.sec04;

public class Method04 {
	//필드값에 접근하기위해 메소드는 객체를 만듦(int a=10)
	
	int a;
	
	public void method1() {
		
		System.out.println("a : "+a);
	}
	
	
	public void method2() {
		System.out.println("method2");
		method1();
	}
	
	public void method3(Method04 m) {
		m.method1();
		System.out.println(m.a);
	}

}
