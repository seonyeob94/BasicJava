package kr.or.ddit.homework04;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();

	}

	public void process() {
		//가위(0)바위(1)보(2)
		//컴퓨터(랜덤한 0~2)
		//출력
		//나 :가위, 컴퓨터:보 
		//결과: 이겼다
		
        // 나의 가위바위보 추출
		System.out.println("0:가위, 1:바위, 2:보");
		int ranme = sc.nextInt();
		String me = "";
		if(ranme==0) {
			me+= "가위, ";
		}
		else if(ranme==1) {
			me+= "바위, ";
		}
		else if(ranme==2) {
			me+= "보, ";
		}
		else {
			me+= "안냈다, ";
		}
		
		
		// 컴퓨터 가위바위보 추출
		int rancom = (int)(Math.random()*3);
		String com = "";
		if(rancom==0) {
			com+= "가위";
		}
		else if(rancom==1) {
			com+= "바위";
		}
		if(rancom==2) {
			com+= "보";
		}
		
		//승패 결정
		String result = "";
		if(ranme==rancom) {
			result+="비겼다";
		}
		else if(rancom-ranme==1||ranme==2&&rancom==0||ranme>=3) {
			result+="졌다";
		}
		else {
			result+="이겼다";
		}
		
		
//		if(score==0){
//			if(ran==0) {
//				c+="비겼다";
//			}
//			else if(ran==1) {
//				c+="졌다";
//			}
//			else if(ran==2) {
//				c+="이겼다";
//			}
//		}
//		
//		if(score==1){
//			if(ran==0) {
//				c+="이겼다";
//			}
//			else if(ran==1) {
//				c+="비겼다";
//			}
//			else if(ran==2) {
//				c+="졌다";
//			}
//		}
//		
//		if(score==2){
//			if(ran==0) {
//				c+="졌다";
//			}
//			else if(ran==1) {
//				c+="이겼다";
//			}
//			else if(ran==2) {
//				c+="비겼다";
//			}
//		}
		
		
		System.out.println("나: "+me+"컴퓨터: "+com+"\n"+"결과: "+result);
		

	}
}
