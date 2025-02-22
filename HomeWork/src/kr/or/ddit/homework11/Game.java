package kr.or.ddit.homework11;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Game obj = new Game();
		obj.process();
		
	}

	public void process() {
		Deck deck = new Deck();
	//	deck.printCardList(); // shuffle 확인후 주석 처리
		deck.shuffle();
	//	deck.printCardList(); // shuffle 확인후 주석 처리
		
		// 내카드는 0 번째 카드

		Card my = deck.getCard(0);
		
		// 컴퓨터 카드는 랜덤 으로 가져올것.
		int ran = (int)(Math.random()*51)+1;
		
		Card com = deck.getCard(ran);
        
//		 승패 출력 
//		System.out.println(my);
//		System.out.println(com);
		// 내카드 숫자가 높다면           win 
		//           같거나 낮다면 lose
		// ex)  내카드 : ◆5   컴카드 :♥10
		//      lose 
		int my1 = my.num;
		int com1 = com.num;
		
		String result ="";
		if(my1>com1) {
			result+= "win";
		}
		else result+= "lose";
		
		System.out.println("내 카드 : "+my+", 컴 카드 : "+com+"\n결과는 : "+result);
        
        
		
	}
	
	
	
}
