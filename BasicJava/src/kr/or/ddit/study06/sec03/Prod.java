package kr.or.ddit.study06.sec03;

public class Prod {

	// 상품번호, 이름, 가격, 타입,
	// 생성자 만들것
	// 필드생성 후 ProdMain 만들고
	// Prod 객체 생성 및 값 출력
	String pid;
	String pname;
	int price;

	/**
	 * @param pid : 상품번호
	 * @param pname : 상품이름
	 * @param price : 가격
	 * @param type : 타입
	 * 
	 * 
	 * 
	 */
	String type;
	
	public Prod (String pid, String pname, int price, String type) {
		this.pid=pid;
		this.pname=pname;
		this.price=price;
		this.type=type;
		
	}

	@Override
	public String toString() {
		return "Prod [pid=" + pid + ", pname=" + pname + ", price=" + price + ", type=" + type + "]";
	}
	
}
