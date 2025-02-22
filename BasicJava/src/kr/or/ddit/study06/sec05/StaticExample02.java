package kr.or.ddit.study06.sec05;

public class StaticExample02 {

	int a = 5;
	static int b = 1;
	
	public void method1() {
		a++;
	}
	public static void method2(StaticExample02 se) {
		
		se.method1();
	}
	
	public static void method3() {
		b++;
	}
	
	public void method4() {
		
		b++;
	}
	
	
}
