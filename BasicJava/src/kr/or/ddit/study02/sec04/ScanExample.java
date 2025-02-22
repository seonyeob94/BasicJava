package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScanExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScanExample obj = new ScanExample();
		obj.process();
	}

	public void process() {
//		String str = sc.nextLine();
//				
//		int i = Integer.parseInt(str);
		
		System.out.print("숫자 : "); // 스캐너 사용때는 설명해놓기
//		int i = sc.nextInt();
//		System.out.println(i);
//		
		double d = sc.nextDouble();
		
		System.out.println(d);
		
	
	}
}
