package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class ifExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ifExample02 obj = new ifExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	public void method3() {
		// 점수를 입력하고 학점을 출력하시오
		// 끝자리가 0-2 -
		//		 3-6 0
		//		 7-9 +
		//	88->B+
		//  100->A+

		System.out.println("점수 : ");
		int score = sc.nextInt();
		
		
//		if (score >= 90) {
//			System.out.println("학점 : A");
//		}
//
//		else if (score >= 80) {
//			System.out.println("학점 : B");
//		}
//
//		else if (score >= 70) {
//			System.out.println("학점 : C");
//		}
//
//		else if (score >= 60) {
//			System.out.println("학점 : D");
//		}
//
//		else {
//			System.out.println("학점 : F");
//		}
//		int a= score/=10;
//		score-=a;
//		
//		if(score<3) {
//			System.out.println("-");
//		}
//		else if (score < 7) {
//			System.out.println("0");
//		}
		
		String grade = "";
		{
		if(score==100) grade = "A+";
		else if(score>=90) {
			grade="A";
		}
		else if(score>=80) {
			grade="B";
		}
		else if(score>=70) {
			grade="C";
		}
		else if(score>=60) {
			grade="D";
		}
		else  {
			grade="F";
			
		}
		
		if(score!=100&&score>60) {
			if(score%10<=2) {
				grade+="-";
			}
			else if(score%10<=6){
				grade+="0";
			}
			else {
				grade+="+";
			}

			
			
		}System.out.println(grade);
		}
		
//		else if(score>=90) {
//			grade="A";
//			if(score%10<=2) {
//				grade+="-";
//			}
//			else if(score%10<=6) {
//				grade +="0";
//			}
//			else {
//				grade +="+";
//			}
//		}
		
	}
	
	public void method2() {
		// 숫자 a,b 중 큰숫자부터 출력하시오
		
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		
		// a < b
		// a,b 값 바꾸기
		// 한번에 바꿀 수가 없으니 임시로 바꿀 매체를 만든다
		if(a<b) {
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a+", "+b);
		
	}
	
	public void method1() {
		//숫자a,b 중에 큰수를 출력하시오
		
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		
		//if 실행문(세미클론(;)을 기준으로) 하나일때{}생략가능
		if(a>b) 
			System.out.println(a);
		
		else {	
			System.out.println(b);
		}
		//else는 한줄일때 {}생략가능
		
	}
}
