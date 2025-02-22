package kr.or.ddit.homework11;

public class Card {
	int num;
	String type;

	public Card(int num, String type) {
		this.num = num;
		this.type = type;
	}
	
	@Override
	public String toString() {
		// A 2345678910 jqk
		String n =num+"";
		if(num==1)  n = "A";
		if(num==11) n = "J";
		if(num==12) n = "Q";
		if(num==13) n = "K";
		String result = type+n;
		
		return result;
	}

	public char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
