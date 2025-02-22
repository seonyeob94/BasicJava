package kr.or.ddit.util;

import java.util.Scanner;

public class ScanUtil {
	static Scanner sc = new Scanner(System.in);
	//Scanner sc 필드
	
	public static String next(String message) {
		System.out.println(message);


		
		return sc.next();
	}
	
	public static String next() {
		return sc.next();

	}
	
	
	public static int nextInt(String message) {
		System.out.println(message);
		return nextInt();
		
	}
	
	
	private static int nextInt() {
		int num = 0;
		while(true) {
			String str = sc.next();
			try {
				num=Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력하세요.");
			}
			
		}
		
		
		return num;
	}
	
	
}
