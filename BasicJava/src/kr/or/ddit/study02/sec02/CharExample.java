package kr.or.ddit.study02.sec02;

public class CharExample {
	public static void main(String[] args) {
		// char : 부호 없는 2byte 정수(0~65535)
		// 		  문자 표현을 위한 정수
		// 문자 하나하나와 매칭이 되어 있다
		
		char c1 = 97;
		
		System.out.println(c1);
		
		char c2 = 66;
		System.out.println(c2);
		
		char c3 = '가';
		
		String c4="안녕하세요";
		
		
		int i3 = c3 + 0;
		
		System.out.println(i3);
		
		
		System.out.println("안녕"+c3);
	
	}
}
