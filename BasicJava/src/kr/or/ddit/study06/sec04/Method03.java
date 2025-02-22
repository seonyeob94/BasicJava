package kr.or.ddit.study06.sec04;

public class Method03 {
	public static void main(String[] args) {
		Method03 m3 = new Method03();
		int method2 = m3.method2();
		String method3 = m3.method3();
		
		System.out.println("method2 리턴값 : "+method2);
		System.out.println("method3 리턴값 : "+method3);
	
	}
	// public void   method1(int a)
	// 접근제한자 리턴타임 메소드명  파라미커/매개변수
	
	
	
	
	public void method1() {
		
		int a =10;
		
		System.out.println("a");
		if(a<10) return;
		System.out.println("b");
	}
	
	public int method2() {
		System.out.println("method2");
		
		int a = 10;
		if(a<10) return 0;
		else return 10;
		//if(a==10) return 10;은 에러 반드시 리턴값이 있어야한다
	}

	
	public String method3() {
		return "abc";
	}


}
