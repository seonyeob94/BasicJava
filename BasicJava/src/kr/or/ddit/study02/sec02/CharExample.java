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
		int a=11;
		String c4="안녕하세요";
		c4+=(char)(89+a);
		System.out.println(c4);
		
		int i3 = c3 + 0;
		
		System.out.println(i3);
		
		
		System.out.println("안녕"+c3);
		
		String c5 = "abcAsDe";
		String c6="가";
//		for(int i=0;i<c5.length();i++) {
//			if(c5.charAt(i)>='a'&&c5.charAt(i)<='z') {
//			c6+= (char)(c5.charAt(i)-32);
//		}
//		else if(c5.charAt(i)>='A'&&c5.charAt(i)<='Z') {
//			c6+= (char)(c5.charAt(i)+32);
//		}
//
//	}
		char c8;
		c8=c3;
		c6+=c8+1;
		System.out.println(c6);
		
		System.out.println();
		
	}
}
