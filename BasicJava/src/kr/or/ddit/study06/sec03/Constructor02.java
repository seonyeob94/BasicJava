package kr.or.ddit.study06.sec03;

public class Constructor02 {
	//생성자 오버로딩
	//파라미터 값에 따라 호출되는 생성자가 다르다
	
	public Constructor02() {
		System.out.println("기본생성자");
	}
	
	public Constructor02(String a) {
		System.out.println("생성자 String a");
	}

	public Constructor02(String a, String b) {
		System.out.println("생성자 String a, String b");
	}

	public Constructor02(String a, int b) {
		System.out.println("생성자 String a, int b");
	}

	public Constructor02(int b, String a ) {
		System.out.println("생성자 int b, String a");
	}
}
