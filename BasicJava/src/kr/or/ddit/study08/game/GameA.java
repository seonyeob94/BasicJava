package kr.or.ddit.study08.game;

import java.util.Random;

import kr.or.ddit.util.ScanUtil;

public class GameA implements Game {

	@Override
	public int playGame() {

		// A 홀짝게임         (지불 :2000 상금 : 4500)
		int ran = new Random().nextInt(2)+1;
		System.out.println("1. 홀, 2. 짝");
		int sel = ScanUtil.select();
		System.out.println(ran);
		if((sel==1&& ran%2==1)||(sel==2&& ran%2==0)) {
		System.out.println("승리");
		return 4500;
		}
//		int input = ScanUtil.nextInt("1이나 2의 숫자를 입력하시오");
//		if(input==ran) {
//			System.out.println("승리");
//			
//		}
//		else {
//			System.out.println("패배");
//		}
		else{
			System.out.println("패배");
		return 0;
		}
	}

	@Override
	public int payMoney() {
		return 2000;
	}

}
