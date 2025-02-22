package kr.or.ddit.study06.sec02;

public class FoodMain {
	public static void main(String[] args) {
		
		//fname price ex
		//라면   2500  면요리
		//백숙   12000 고기요리
		
		Food f1 = new Food();
		f1.fname="라면";
		f1.price=2500;
		f1.ex="면요리";
		

		Food f2 = new Food();
		f2.fname="백숙";
		f2.price=12000;
		f2.ex="고기요리";
		
		System.out.println(f1);
		System.out.println(f2);
	}
}
