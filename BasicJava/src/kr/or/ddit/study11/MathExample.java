package kr.or.ddit.study11;

import java.util.Scanner;

public class MathExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MathExample obj = new MathExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
		
	}
	
	public void method4() {
		double d = Math.sqrt(10);
		System.out.println(d);
		
		
		
	}
	
	public void method3() {
		double d =Math.pow(10, 12);
		double b =Math.pow(2, 30);
		
		System.out.println(d/b+"GB");
		
		//K M G T P

		double tera =Math.pow(1024, 4);
		double terab =Math.pow(1000, 4);
		
		System.out.println(tera/terab*100);
		
		
	}
	
	public void method2() {
		double a= 10.65;
		
		double floor = Math.floor(10.65);
		System.out.println(floor);
		
		double round = Math.round(a);
		System.out.println(round);
		
		double ceil = Math.ceil(a);
		System.out.println(ceil);
		
	}
	
	public double round2(double d, int num) {
		//d = 숫자
		//num = 반올림 자리수
		// 10.231 , 2
		// 10.23
		
		long gop =1;
//		for(int i=0;i<num;i++) gop*=10;
		gop = (long) Math.pow(10, num);
		d*=gop;
		d=Math.round(d)/gop;
		return d;
		
		
	}
	
	public void method1() {
		//절대값
		int result = Math.abs(-10);
		
		double result2 = Math.abs(-10.4);
		System.out.println(result);
		System.out.println(result2);
		
		int a = -10;
		if(a<0) a=-a;
		
		
		
		
	}
	
//	public double abs(double a) {
//		if(a<0) retern -a;
//		return a;
//		
//		
//	}
//	
//	public int abs(int a) {
//		if(a<0) retern -a;
//		return a;
//	}
	
}
