package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class Cal03 {
	//더하기 빼기 나누기 곱하기 메소드 만들고
	// 입력하는 연산자에 따라 다른 메소드를 호출하시오
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cal03 cal02 = new Cal03();
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.println("연산자 : ");
		String op = sc.next();
		
		Cal03 c3 = new Cal03();
		
		int result =0;
	    if(op.equals("+")) result =c3.add(a, b);
	    if(op.equals("-")) result =c3.sub(a, b);
	    if(op.equals("/")) result =c3.div(a, b);
	    if(op.equals("*")) result =c3.mul(a, b);
	    
	    System.out.println("결과 값 : "+result);
	    
		
		sc.close();
	}

	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
}
