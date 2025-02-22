package kr.or.ddit.study06.sec02;

public class ProdMain {
	
	public static void main(String[] args) {
		 //pid pname price pgu
		 //a0001  사과  1000  과일
		 //a0002  커피  2000  음료
		// 상품번호 이름 가격 타입
		
		Prod p1= new Prod();
		p1.pid="a0001";
		p1.pname="사과";
		p1.price=1000;
		p1.type="과일";
		
		Prod p2= new Prod();
		p2.pid="a0002";
		p2.pname="커피";
		p2.price=2000;
		p2.type="음료";
		
		System.out.println(p1);
		System.out.println("상품번호\t이름\t가격\t타입");
		System.out.println(p1.pid+"\t"+p1.pname+"\t"+p1.price+"\t"+p1.type);
		System.out.println(p2.pid+"\t"+p2.pname+"\t"+p2.price+"\t"+p2.type);
				
	}
	
	
}
