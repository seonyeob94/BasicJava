package kr.or.ddit.homework11;

public class Deck {
	Card[] cardList;
	
	Deck(){
		int cnt = 0; 
		cardList = new Card[52];
		String[] types = {"♠","◇","♡","♣" };
		for(String type : types) {
			for(int i=1;i<=13;i++) {
				Card card = new Card(i,type);
				cardList[cnt++]=card;
			}
		}
	}
	
	public void printCardList() {
		for(int i=0; i<cardList.length; i++) {
			System.out.println(cardList[i]);
		}
	}
	
	
	public void shuffle() {
		// 카드 섞기
		
//		for(int i=0;i<10000;i++) {
//			int ran =(int)(Math.random()*cardList.length)
//
//			Card temp=cardList[0];
//			cardList[0]=cardList[ran];
//			cardList[ran]=temp;
//		
//		}
		
		for(int i=0;i<10000;i++) {
			int ran = (int)(Math.random()*52);
			Card temp=cardList[0];
			cardList[0]=cardList[ran];
			cardList[ran]=temp;
		}

	
	}
	
	public Card getCard(int num) {
		return cardList[num];
	}
	
	
}
