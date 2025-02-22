package kr.or.ddit.study06.sec02;

public class Prod {
	// 상품번호, 이름, 가격, 타입,
	// 필드생성 후 ProdMain 만들고
	// Prod 객체 생성 및 값 출력
	
	String pid;
	String pname;
	int price;
	String type;
	@Override
	public String toString() {
		return "Prod [pid=" + pid + ", pname=" + pname + ", price=" + price + ", type=" + type + "]";
	}
	
	
}
