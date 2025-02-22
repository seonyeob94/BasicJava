package kr.or.ddit.study03;

import java.util.Scanner;

public class BinarOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinarOperator obj = new BinarOperator();
		obj.process();
	}

	public void process() {
		// 이항연상자 : 대부분의연상자
		// 산술연상자, 관계연상자, 논리연상자, 비트연상자, 대입연상자
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	
	public void method6() {
		// 비트 연산자
		// >> <<		
		
		int a = 32;
		System.out.println(a>>3);
		System.out.println(a<<3);

	}

	public void method5() {
		// 중요하지 않음
		int a = 45;
		int b = 24;
		
		System.out.println(a|b);
		System.out.println(a&b);
	}
	
	
	public void method4() {
		// 논리 연산자
		// &&, ||, !
		
		// A && B A, B 중 하나라도 거짓이면 거짓
		// A || B A, B 중 하나라도 참이면 참
		
		// A	B	%%	||
		// 0	0	0	0
		// 1	0	0	1
		// 0	1	0	1
		// 1	1	1	1
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(!(a&&b));
		System.out.println(a&&b);
		System.out.println(a&&!b);
		System.out.println(a||b);
		
		int num = sc.nextInt();
		boolean result = 1<num&&num<10;
		System.out.println("num : "+num+" 결과 : "+result);
		
		// 10보다 작거나 50보다 큰 경우 참
		
		boolean result2 = num<10||num>50;
		System.out.println("num : "+num+" 결과 : "+result2);
		
		
		
	}

	public void method3() {
		// 관계연산자
		// >, <, ==, >=, <=, != 
		//'==' -> 같다 '!=' -> 같지 않다
		// 참과 거짓이 나온다

		int a = 10;
		int b = 17;

		if (a > b) {
			System.out.println("a가 b보다 크다");
		}

		if (a < b) {
			System.out.println("a가 b보다 작다");
		}
		if (a >= b) {
			System.out.println("a가 b보다 크거나 같다");
		}
		if (a <= b) {
			System.out.println("a가 b보다 작거나 같다");
		}
		if (a != b) {
			System.out.println("a와 b가 다르다");
		}
	}

	public void method2() {
		// 대입연산자
		// =: '=' 오른쪽값을 '=' 왼쪽에 저장 우선순위가 가장 늦다
		// '=' 과 다른 연산자가 결합

		int a = 10;
		int b = 4;

		System.out.println("a=a+b =>a +=b=> " + (a += b));
		System.out.println(a);
		System.out.println("a=a-b =>a -=b=> " + (a -= b));
		System.out.println(a);
		System.out.println("a=a*b =>a *=b=> " + (a *= b));
		System.out.println(a);
		System.out.println("a=a/b =>a /=b=> " + (a /= b));
		System.out.println(a);
		System.out.println("a=a%b =>a %=b=> " + (a %= b));
		System.out.println(a);

	}

	public void method1() {
		// 산술연산자
		// +, -, /, *, %

		int a = 5;
		int b = 3;

		// 5-> 3*1 + 2
		// 7-> 3*2 + 1

		System.out.println("덧셈 : " + (a + b));
		System.out.println("뺄셈 : " + (a - b));
		System.out.println("곳셈 : " + (a * b));
		System.out.println("나눗셈 : " + (a / b));
		System.out.println("나머지 : " + (a % b));
	}

}
