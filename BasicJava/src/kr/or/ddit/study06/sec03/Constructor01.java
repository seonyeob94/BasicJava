package kr.or.ddit.study06.sec03;

public class Constructor01 {
	
	String field1;
	int field2;
	
	//기본 생성자
	//기본 생성자는 생성자가 없다면 자동으로 만들어지지만
	// 다른 생성자가 있다면 자동으로 만들어지지 않음
	public Constructor01() {
		System.out.println("기본생성자");
	}
	
	public Constructor01(String field1, int field2) {
		System.out.println("파라미터 있는 생성자");
		System.out.println(field1+", "+field2);
		this.field1 = field1;
		this.field2 = field2;
	}
	
	
}
