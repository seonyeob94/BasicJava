package kr.or.ddit.study03;

public class StaticExample02 {
	
	int a=5;
	static int b=1;
	
	public void method01() {
		a++;
	}
	
	public static void method02(StaticExample02 se) {
		se.method01();
	}
	
	public static void method03() {
		b++;
	}

	
	public void method04() {
		b++;
	}
	
}
