package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	public void method3() {
		//월을 입력받고 겨울 여름 가을 봄을 출력하시오
		
		System.out.println("월을 입력하시오");
		int month = sc.nextInt();
		
		switch (month) {
		case 12:case 1:case 2:
			System.out.println("겨울");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄");
			break;
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("여름");
			break;
		case 8:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:
			System.out.println("가을");
			break;

		default:
			break;
		}
				
		
		
	}
	
	public void method2() {
		// 국가를 약자로 입력 했을때 한국말로 출력
		// KOR -> 한국
		// jPN -> 일본
		// CHN -> 중국
		// 그외 -> 등록되지 않은 약자
		System.out.println("국가 약자 입력");
		String str = sc.nextLine();
		
		switch (str) {
		case "KOR":
			System.out.println("한국");
			break;
		case "jPN":
			System.out.println("일본");
			break;
		case "CHN":
			System.out.println("중국");
			break;

		default:
			System.out.println("등록되지 않은 약자");
			break;
		}
	}
	
	public void method1() {
		
		int num=5;
		switch (num) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default://if문의 else 와 같다
			System.out.println("그 외 값.");
			break;
		}
	}
}
