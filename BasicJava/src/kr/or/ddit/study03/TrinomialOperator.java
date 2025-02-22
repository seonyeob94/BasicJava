package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public void method4() {
		// 테니스 공이 한상자에 10개 들어갈수 있을 때
		// 필요한 상자의 갯수를 출력하시오
		// 17 -> 2상자
		// 10 -> 1상자
		
		System.out.print("집어넣을 공의 수 : ");
		int ball = sc.nextInt();
		
		int box = ball % 10 == 0 ? ball/10 : ball/10+1;
		
//		int box = (ball+9)/10;
		
		System.out.println(box);
			
		
		
		
	}
	
	public void method3() {
		
		//입력 받은 숫자가 짝수라면 *10 홀수라면 *20
		// 11%2 -> 1
		
		int num = sc.nextInt();
		
		
		int result = num%2 == 0 ? num*10 : num*20;
		
		System.out.println(result);
	}
	
	public void method2() {
		// 나이를 입력받고 18세 이상이면 성인 미만이면 미성년 출력
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result = age >= 18 ? "성년" :"미성년";
		
		System.out.println(result);
		
	}
	public void method1() {
		// 삼항연산자	: 3개의 피연산자를 필요로 하는 연산
		//			  삼항연산자는 ?앞의 조건식의 결과에 따라 콜론 앞뒤의
		//			  피연산자가 선택 조건 연삭식이라고도 함.
		//			  조건식 ? (참) 값 또는 연산식:	(거짓)값 또는 연산식
		
		
		String str = false ? "참" : "거짓";
		
		System.out.println(str);
		
	}
}
