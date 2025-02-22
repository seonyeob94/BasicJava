package kr.or.ddit.homework12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HomeWork12 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork12 obj = new HomeWork12();
		obj.process();
	}

	public void process() {
		int money = 100000; 
		while(money>0) {
			System.out.println("보유 금액 : "+ money);
			System.out.print("구매할 로또 금액 : ");
			int pay = sc.nextInt();
//			
//			Lotto l1 = new Lotto();
			
		
			
			// 구매 금액 보다 크게 입력 x
			
			//0 입력시 종료
			
			
			// 당첨 번호 한줄 생성 할것 .			
			//45줄을 8줄로 만들기
			// 로또 번들 에서  당첨 번호랑 같은 값이 있다면 
			// 상금 3만원 
			int[] l1 = gernerateLotto();
			System.out.println("당첨번호 : "+Arrays.toString(l1));
		System.out.println("-----------------");
			
			int[][][] bundle=lottoBundle(pay);
//			bundlePrint(bundle);
			if(money>=pay) {
			
			for(int[][] paper : bundle) {
				for(int[] lotto : paper) {

					System.out.println(Arrays.toString(lotto));
					Arrays.toString(l1).equals(Arrays.toString(lotto));

					if(Arrays.equals(lotto,l1)) {
						money+=30000;
						System.out.println("담청되었습니다. 축하드려요");
					
					}
				}
			}
			}
			else {
				System.out.println("보유금액이 적습니다 금액을 낮춰주세요");
				continue;
			}
			
			
			if(money==0) {
				System.out.println("돈이 바닥났습니다 다음 기회를 노리세요");
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
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
	

	public int[][] lottoPaper() {
		
		
		return lottoPaper(5);
		
	}
	

	public int[][] lottoPaper(int line) {
		int[][] paper = new int[line][6];
		
		for(int i=0;i<paper.length;i++) {
			
			paper[i]=gernerateLotto();
		}
		
		
		return paper;
		
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
		
		return lotto;
	}
	
	
}
