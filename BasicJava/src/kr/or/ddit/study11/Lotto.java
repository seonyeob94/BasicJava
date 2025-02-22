package kr.or.ddit.study11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto obj = new Lotto();
		obj.process();

	}

	public void process() {
//		int[] lotto = gernerateLotto();
//		System.out.println(Arrays.toString(lotto));
//	    System.out.println(array2String(lotto));
		
//		int[][] paper =lottoPaper();
//		
//		for(int i=0; i<paper.length;i++) {
//			int[] lotto = paper[i];
//			System.out.println(Arrays.toString(lotto));
//		}
//		
//		int[][][] bundle=lottoBundle(18000);
//		bundlePrint(bundle);
		

		
		
		
	}	
	
	
	public void bundlePrint(int[][][] bundle) {
		
		for(int[][] paper : bundle) {
			System.out.println("-----------------");
			for(int[] lotto : paper) {
				System.out.println(Arrays.toString(lotto));
			}
			System.out.println("-----------------");
		}
		
		
	}
	
	
	
	public int[][][] lottoBundle(int money) {
			int papers = money/5000;
			if(money%5000 !=0) papers++;
			
			int [][][] bundle = new int[papers][5][6];
			for(int i=0; i<bundle.length;i++) {
				bundle[i]= lottoPaper();
			}

			if(money%5000 !=0) {
				int line = (money%5000)/1000;
				bundle[papers-1] = lottoPaper(line);
			}
			
			
			return bundle;
		}
	

	
	public int[][] lottoPaper(int line) {
		int[][] paper = new int[line][6];
		
		for(int i=0;i<paper.length;i++) {
			
			paper[i]=gernerateLotto();
		}
		
		
		return paper;
		
	}
	
		
		
		
	
	
	public int[][] lottoPaper() {
		
		
		return lottoPaper(5);
		
	}
	
	
	
	
	public int[] gernerateLotto() {
		int[] lotto = new int[6];
		
		
		for(int i=0; i<lotto.length; i++) {
			int ran = new Random().nextInt(8)+1;
			lotto[i]=ran;
			for (int j =0; j<i;j++) {
				if(lotto[j]==ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		//메소드는 기본적으로 얕은 복사를 한다
		
		return lotto;
	}
	
	
	public String array2String(int[] array) {
	//   [5,14,20,37,40,41]	
		String str="(";
		
		for(int i=0;i<array.length;i++) {
			str+=array[i];
			if(i == array.length-1) str+=")";
			else str+=", ";
		}
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	
}
