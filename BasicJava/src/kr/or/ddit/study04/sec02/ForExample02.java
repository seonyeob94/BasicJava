package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
//		method6();
//		method7();
		
	}
	

	
	public void method7() {
		A ://라벨
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i+", "+j+"\t");
				if(j==7) {
					break A;
				}
			}
			System.err.println();
			
		
		}
	}
	

	
	public void method6() {
		
		for(int i=1;i<=10;i++) {
		    boolean chk=false;
			for(int j=1;j<=10;j++) {
				System.out.print(i+", "+j+"\t");
				if(i*j>50) {
					chk= true;
					break;
				}
			}
			System.out.println();
			if(chk) break;
		
		}
		
		
	}
	
	
	public void method5() {
		//입력한 단까지 출력

		System.out.println("2~9의 정수 중 하나만 입력하시오");
		int blank = sc.nextInt();
		
		for(int dan=2;dan<=9;dan++) {
			
			for(int i=1;i<=9;i++) {
				if(i!=dan) {
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				}
			}
			
			if(blank==dan) break;
		}
		
		
	}
	
	
	
	public void method4() {
		//1-10까지 출력
		//입력한 숫자까지만 출력

		System.out.println("1~10의 정수 중 하나만 입력하시오");
		int end= sc.nextInt();
		for(int i=1;i<=10;i++) {
			
//			if(i<=next) System.out.print(i);
			
			System.out.print(i);
			if(i==end) break;
				
			
			
		}
	
		
	}
	
	
	public void method3() {
		// 구구단 출력
		//입력한 단은 출력 X
		// i j k
		

		System.out.println("2~9의 정수 중 하나만 입력하시오");
		int blank = sc.nextInt();
		
		for(int dan=2;dan<=9;dan++) {
			if(dan==blank) continue;
			System.out.println(dan+"단");
			for(int i=1;i<=9;i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
				System.out.printf("%d*%d+%d\n",dan,i,dan*i);
			}
		}
		
	}
	
	public void method2() {
		//1-10까지 출력
		//next랑 같은값일 경우 넘길것.
		System.out.println("1~10의 정수 중 하나만 입력하시오");
		int next = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
//			if(i != next) System.out.print(i);
			if(i==next) continue;//해당 루프를 종료하고 다음 루프로 이동
			System.out.print(i);
		}
		
		
		
		
	}
	
	public void method1() {
		//구구단 출력하기
		//2단
		//2*1=2
		//2*2
		
		//9단
		//9*1=9
		//9*9=81
		
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			
			
		}
		
	}

}
