package kr.or.ddit.homework02;

import java.util.Scanner;

public class HomeWork2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork2 obj = new HomeWork2();
//		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
		obj.mehtod4();
//		obj.mehtod5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 버림  
		 *  ex ) 12.23123 - > 12.23
		 */
		System.out.println("실수 를 입력해주세요.");
		String str = sc.nextLine();
		
//		double a1 = Double.parseDouble(str);
//		int b1 = (int)(a1*100);
//		double result = b1/100.0;
//		
//		System.out.println(result);
		
		
		double num = Double.parseDouble(str);
		
		int i = (int)(num*100);
		
		double result = i/100.0;
		
		System.out.println(result);
		
	}
	
	public void mehtod2() {
		/* 0-48
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 +32
		 *  ex) A-> a  
		 */
		System.out.println("대문자를 입력 해주세요.");
		String s = sc.nextLine();
		//문자열에서 문자 하나만 가져오는것 .charAt()
		char ch = s.charAt(0);
		
//		char result=(char)(ch+32);
//		
//		
//				
//		System.out.println(result);
		
		ch = (char)(ch+ 32);
		
		System.out.println(ch);
		
	}
	public void mehtod3() {
		/*
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 -32
		 *  ex) f-> F  
		 */
		System.out.println("소문자를 입력 해주세요.");
		String s = sc.nextLine();
		
		char ch = s.charAt(0);
		
//		char result=(char)(ch-32);
//		
//		
//				
//		System.out.println(result);
//	
		 ch =(char)(ch-32);
		
		System.out.println(ch);
	}
	
	public void mehtod4() { 
		/*
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
		 *  ex) 123 -> 1+2+3
		 *  100*a+10*b+1*c
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String s = sc.nextLine();
		

//		char ch = s.charAt(0);
//		char ch1 = s.charAt(1);
//		char ch2 = s.charAt(2);
//		
//		int a4 = (int)ch-48;
//		int b4 = (int)ch1-48;
//		int c4 = (int)ch2-48;
//
//		int result=a4+b4+c4;
//				
//		System.out.println(result);
		
		
//		char ch1= s.charAt(0);
//		char ch2= s.charAt(1);
//		char ch3= s.charAt(2);
//		
//		int result= ch1-'0'+ch2-'0'+ch3-'0';
		
		int i = Integer.parseInt(s);
		
		int i1 = i/100;
		i%=100;
		
		int i2 = i/10;
		i= i-i2*10;
		
		int i3 = i;
		
		int result= i1+i2+i3;
		
		System.out.println(result);
		
				
	
		
		
		
	}
	
	public void mehtod5() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 반올림  
		 *  ex ) 12.2623 - > 12.3
		 */
		
		System.out.println("실수 를 입력해주세요.");
		String s = sc.nextLine();

		
//		double a5 = Double.parseDouble(s);
//		int b5 = (int)((a5+0.05)*10);
//		double c5 = b5/10.0;
//		
//		
//		System.out.println(c5);
		
		double d = Double.parseDouble(s);
		
		d+=0.05;
		
		int i = (int)(d*10);
		double result = i/10.0;
		
		System.out.println(result);
		
		
	}
	
	
}
