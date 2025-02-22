package kr.or.ddit.study06.sec04;

public class Method02 {
	public static void main(String[] args) {
		// 숫자 10
		Method02 in = new Method02();
		in.method1(10);
		
		//test
		in.method2("test");
		
		
		//test1 test2
		in.method3("test1","test2");
		
	}
	
	public void method1(int a) {
		System.out.println("외부에서 준 파라미터 값 : "+a);
	}
	
	public void method2(String str) {
		System.out.println("외부에서 준 파라미터 값 : "+str);
	}
	
	public void method3(String str, String str2) {
		System.out.println("외부에서 준 파라미터 값 : "+str+", "+str2);
	}
}
