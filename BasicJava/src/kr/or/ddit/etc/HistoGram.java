package kr.or.ddit.etc;

import java.util.Random;

import kr.or.ddit.util.ScanUtil;

public class HistoGram {
	public static void main(String[] args) {
		HistoGram hg = new HistoGram();
		hg.process();
		
	}
	public void process() {
		
		//히스토그램 그리기
		//주사위 2개의 눈금 합을 히스토 그램으로 나타내시오
		/*  1000-> 2 : 10 ■
		/*  1000-> 3 : 50 ■ ■ ■ ■ ■
		/*  1000-> 3 : 43 ■ ■ ■ ■
		 *    2 : ■ ■
		 *    3 : ■ ■ ■
		 *    4 : ■ ■ ■ ■
		 *    .
		 *    .
		 *    10: ■ ■ ■ ■
		 *    11: ■ ■ ■
		 *    12: ■ ■
		 */
		
		int n = 10000;
		int[] roll=roll(n);
		printHistoGram(roll, n);
		
	
//		
//		int dice=ScanUtil.nextInt("횟수");
//		int n =ScanUtil.nextInt("원하는 합(2-11)");
//		String result="";
//		String result1="";
//		for(int a = 0;a<dice;a++) {
//		
//		int dice1 = new Random().nextInt(6)+1;
//		int dice2 = new Random().nextInt(6)+1;
//		int sum = dice1+dice2;
		
//		int[] num= new int [13];
//		
//		for(int i=1;i<=sum;i++) {
//			result+="■ ";
//			}
//		num[sum-1]++;
//
//
//		for(int i=1;i<=num[sum-1]/dice*100;i++) {
//			result1+="■ ";
//			}
//
//		
//		}
//
//		System.out.println(n+" "+result1);
	
		
	
	}
	
	public int oneDice() {
		return new Random().nextInt(6)+1;
	}
	
	
	public int twoDice() {
		return oneDice()+oneDice();
	}
	
	
	public int[] roll(int n) {
		int[] result =new int[13];
		for(int i=0;i<n;i++) {
			int dice= twoDice();
			result[dice]++;
		}
		return result;
	}
	
	
	public void printHistoGram(int[] roll, int n) {
		
		for(int i=2;i<12;i++) {
			System.out.println(i+"("+roll[i]+"):\t");
			for(int j=0;j<100*roll[i]/n;j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
}


