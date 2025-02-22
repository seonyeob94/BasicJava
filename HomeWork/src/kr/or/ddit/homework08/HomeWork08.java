package kr.or.ddit.homework08;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	public void process() {
		// 국 영 수 총점 평균 등수
		int[][] scores = 
			{ {90, 80, 70, 0, 0, 1}, 
			  {84, 72, 65, 0, 0, 1},	
			  {87, 99, 42, 0, 0, 1},	
			  {77, 61, 81, 0, 0, 1},	
			  {80, 77, 92, 0, 0, 1}};
		
		// 총점 /평균 구하기.
		
//		for(int i=0;i<scores.length;i++) {
//			
//			for(int j=0;j<scores[i].length-3;j++) {
//				scores[i][3]+=scores[i][j];
//			}
//			scores[i][4]=scores[i][3]/(scores[i].length-3);
//		}
		
		for(int i=0; i<scores.length;i++) {
			scores[i][3] =scores[i][0]+scores[i][1]+scores[i][2];
			scores[i][4] =scores[i][3]/3;
		}

		
		// 등수 구하기
		
		for(int i=0;i<scores.length;i++) {
			int rank=1;
			for(int j=0; j<scores.length;j++) {
				if(scores[i][3]<scores[j][3]) {
					
					rank++;
				}
			}
			scores[i][5]=rank;
		}
					
		
		
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("==========================================");
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
			
		}
		System.out.println("==========================================");
		
		// 등수 별로 정렬하기.
		
		
		
		
		
		
//		for (int i = 0; i < scores.length - 1; i++) {
//
//			for (int j = 0; j < scores.length - 1; j++) {
//				if (scores[j][5] > scores[j + 1][5]) {
//
//					for (int k = 0; k < scores[j].length; k++) {
//
//						int aa = scores[j][k];
//						scores[j][k] = scores[j + 1][k];
//						scores[j + 1][k] = aa;
//					}
//
//				}
//			}
//
//		}
		
		for(int i=0;i<scores.length-1;i++) {
			for(int j=0;j<scores.length-1;j++) {
				if(scores[j][5]>scores[j+1][5]) {
				int[] temp = new int[scores.length];
					temp=scores[j];
					scores[j]=scores[j+1];
					scores[j+1]=temp;
					
				}
			}
		}
		
		
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("==========================================");
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================================");
		
		
		
		
		
	}
}
