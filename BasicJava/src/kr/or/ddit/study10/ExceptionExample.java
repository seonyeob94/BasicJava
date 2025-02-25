package kr.or.ddit.study10;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		ExceptionExample e = new ExceptionExample();
		e.process();
	}
	
	public void process() {
		method1();
//		method2();
//		method3();
//		method4();
	}
	
	public void method4() {
		
		String str = null;
		if(str==null|| str.equals("")) {
			System.out.println("빈 값");
		}
		
	}
	
	public void method3() {
		// 실행 예외
		// 컴파일 과정에서 체크하지 않음
		// 실행시 예측할 수 없이 갑자기 발생
		
		
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자만 입력해 주세요");
		}
		
	}
	
	public void method2(){
		// 일반예외
		// 컴파일러 체크예외
		// 자바 소스 컴파일 과정에서 해당 예외 처리가 있는지 검사됨
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void method1() {
		int[]num = new int[5];
		System.out.println("실행1");
		try {
			System.out.println("실행2");
			for(int i=-1; i<num.length;i++) {
				num[i]=i;
			}
				System.out.println("실행3");
		} catch (Exception e) {
			System.out.println("실행4");
			System.out.println("인덱스 에러");
		}
		System.out.println("실행5");
		
		
		}
		
		
	}

	
	

