package kr.or.ddit.study07.game;

import java.util.Random;

import kr.or.ddit.util.ScanUtil;

public class GameB extends Game {

	@Override
	public int playGame() {

		// B 가위바위보        (지불 :3000 상금 : 10000)
		
		int ran = new Random().nextInt(3);
		System.out.println("1. 가위 2. 바위 3. 보");
		int sel = ScanUtil.select();
		
		String com="";
		if(ran==1) com="가위";
		if(ran==2) com="바위";
		if(ran==3) com="보";
		System.out.println("컴퓨터 : "+ com);
		
		if(sel == ran) {
			System.out.println("비겼습니다.");
			return 0;
		}
		else if( (sel==1 && ran==3)||(sel==2&& ran==1)
				||(sel==3&& ran==2)) {
			System.out.println("이겼습니다");
			return 10000;
		}
		else 
			System.out.println("졌습니다.");
			return 0;
		
		
		
	}

	@Override
	public int payMoney() {
		// TODO Auto-generated method stub
		return 3000;
	}

}
