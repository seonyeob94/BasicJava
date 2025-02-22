package kr.or.ddit.homework06;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public void method1() {
		// 스캐너를 이용해서 구구단 한단만 출력하시오 .
		// ex )  2 
		//       2*1 =2
		//       2*2 =4 
		//       .
		//       .
		//       2*9 = 18
		System.out.println("2~9중 수 하나를 입력하시오");
		int dd = sc.nextInt();
		
	
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d*%d=%d",dan,j,dan*j);
//				System.out.println();
//			}
		
		
		
	}
	
	public void method2() {
		// 구구단 
		// 2*1=2  3*1=3  4*1=4 ....  9*1=9
		// 2*2=2  3*2=3  4*2=4 ....  9*2=18
		// 2*3=2  3*3=3  4*3=4 ....  9*3=27
		//
		//
		// 2*9=2  3*9=3  4*9=4 ....  9*9=81
		System.out.println("구구단");
		for(int dan=1;dan<=9;dan++) {
			for(int i=2;i<=9;i++) {
				System.out.printf("%d*%d=%d\t",i,dan,dan*i);
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	public void method3() {
		// 스캐너를 이용해서 특정 단을 뺀 구구단을 출력하시오.
		// ex ) 3
		// 2*1=2   4*1=4 ....  9*1=9
		// 2*2=2   4*2=4 ....  9*2=18
		// 2*3=2   4*3=4 ....  9*3=27
		//
		//
		// 2*9=2   4*9=4 ....  9*9=81
		

		System.out.println("2~9중 수 하나를 입력하시오");
		int next = sc.nextInt();
		
		System.out.println("구구단");
		for(int dan=1;dan<=9;dan++) {
			
			for(int i=2;i<=9;i++) {
				if(i==next) continue;
				System.out.printf("%d*%d=%d\t",i,dan,dan*i);
			}
			
			System.out.println();
		}
	}
	
	public void method4() {
		// 홀수를 입력하면 홀수의 합 
		// 짝수를 입력하면 짝수제곱의 합을 구하시오.
		// ex) 5 -> 1+3+5 
		//     6 -> 2*2 +4*4+6*6
		

		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		int sum=0;
		String grade = "";
		
		if(num%2==1) {
			for(int i=1;i<=num;i+=2) {
				sum+=i;
				if(i!=num) grade+=i+"+";
				
				else grade+=i+"=";
			}
		
		}
		
		else {
			for(int j=2;j<=num;j+=2) {
				sum+=j*j;
				if(j!=num) grade+="("+j+"*"+j+")"+"+";
				
				else grade+="("+j+"*"+j+")"+"=";
			}
		}
		
		System.out.print(grade);
		System.out.println(sum);
		
	}
	
	
}
