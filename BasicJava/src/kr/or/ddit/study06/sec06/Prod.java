package kr.or.ddit.study06.sec06;

public class Prod {
			//상품번호, 이름, 가격, 타입
	//필드 생성후 ProdMain 만들고
	//prod 객체 생성 및 값 출력
	
	private int prodNO;
	private String name;
	private int price;
	private String type;
	@Override
	public String toString() {
		return "Prod [prodNO=" + prodNO + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	

	public int getProdNO() {
		return prodNO;
	}

	public void setProdNO(int prodNO) {
		this.prodNO = prodNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		price=20;
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
