package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class CastExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CastExample01 obj = new CastExample01();
		obj.process();

	}

	public void process() {
		System.out.println("test");
//		
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method7() {
		
		//a 다섯번째 뒤에 문자를 출력하시오
//		char ch = 'a';
//		int i = ch+5;
//		char result = (char)i;
		
		char ch = 'a';
		
		char result = (char)(ch+5);
		
		System.out.println(result);
		
	}
	
	public void method6() {
		
		// 소수점 첫째까지만 출력
		double d = 10.4123;
		
//		double result = (double)((int)(d*10))/10;
//		
//		System.out.println(result);
	
		
		int i = (int)(d*10);
		double result = i/10.0;
//		double result = (double)i/10;
		System.out.println(result);
	}
	
	public void method5() {
		//
		int salt=120;
		int water = 200;
		
		int per = 100*salt/(salt+water);
//		int per = 100*salt/(salt+water);
		System.out.println(per+"%");
		
	}
	
	
	
	public void method4() {
		// 3명 중에 2명을 뽑을 때 확률을 %로 나타내시오.
		
//		int i1= 2/3*100;
		
//		int per = (int)(2.0/3*100);
//		int per = (int)((double)(2/3*100));
		int per = 100*2/3;
		
		
		System.out.println(per+"%");
		
		
	}
	
	
	public void method3() {
		
		// 1. char-> int
		
		char c1 = 116;
		int i1 = c1;
		System.out.println("c1 = "+c1);
		System.out.println("i1 = "+i1);
		
		// 2. int-> char
		
		int i2 = 111;
		char c2 = (char)i2;
		System.out.println("i2 = "+i2);
		System.out.println("c2 = "+c2);
		
		
		// 3. char-> byte
		
		char c3 = 'a';
		byte b3 = (byte)c3;
		System.out.println("c3 = "+c3);
		System.out.println("b3 = "+b3);
		
		// 4. byte -> char
		
		byte b4 = 33;
		char c4 = (char)b3;
		System.out.println("b4 = "+b4);
		System.out.println("c4 = "+c4);
		
		
		// 5. char -> short
		
		char c5 = '가';
		short s5= (short)c5;
		System.out.println("c5 = "+c5);
		System.out.println("s5 = "+s5);
		
		// 6. short -> char
		
		short s6= 33;
		char c6= (char)s6;
		System.out.println("s6 = "+s6);
		System.out.println("c6 = "+c6);
		
		
	}
	
	public void method2() {
		
		// 1. int-> long
		
		int i1 = 300;
		long l1 = i1;
		System.out.println("i1 = "+i1);
		System.out.println("l1 = "+l1);
		
		// 2. long-> int
		
		long l2 = 500;
		int i2 = (int)l2;
		System.out.println("l2 = "+l2);
		System.out.println("i2 = "+i2);
		
		// 3. double-> int
		
		double d3 = 10.4;
		int i3 = (int)d3;
		System.out.println("d3 = "+d3);
		System.out.println("i3 = "+i3);
		
		// 4. int-> double
		
		int i4 = 10;
		double d4 = i4;
		System.out.println("i4 = "+i4);
		System.out.println("d4 = "+d4);
		
		//
		
	}
	
	public void method1() {
		// byte < short < int < long < float < double
//		          char  <
		
		// 자동 캐스팅
		// 작은 값을 큰값에 넣을 때 자동으로 형 변환됨.
		
		byte b1 = 10;
		short s1 = b1;
		
		// int -> long
		int i2 = 1000;
		long l2 = i2;
		System.out.println("i2 : "+i2);
		System.out.println("l2 : "+l2);
		
		// 강제 캐스팅
		//큰 값을 작은 타입에 넣을 경우
		// type1 = (type1)typ2
		
		int i3 = 10;
		short s3 = (short)i3;
		

		System.out.println("i3 : "+i3);
		System.out.println("s3 : "+s3);
		
	}

}
