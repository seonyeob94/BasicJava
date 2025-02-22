package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		// 문자와 문자열
		// 문자(char) : 한 글자 데이터로 ' '로 묶어 선언
		// 문자열(String) : 복수개의 글자로 구성된 자료(기본 타입 아님)
		//				  ""로 묶어 선언
		
		String s1 = "abc";
		// ㄱ ㅏ ㅇ - 조합형, 강 - 완성형
		char c1 = '강';
		int a = 20;
		int b = 25;
		
		String year = ""+ a + b;
		
		System.out.println(year);
		System.out.println(""+a+b);
		
		
		//  \n : 개행 문자
		//  \r : 개행 문자
		// \r\n : 개행 문자.
		// \t : 수평탭 스크린 커서를 다음 탭으로 옮김
		// \\ : 역슬래시 문자를 출력
		// \" : 큰 따음표를 출력할때 사용
		// \' : 작은 따음표를 출력할때 사용
		
		
		String name1 = "강감찬";
		String name2 = "이순신";
		
		System.out.println(name1+"\n"+name2);
		System.out.println(name1+"\r"+name2);
		System.out.println(name1+"\n\r"+name2);
		
		System.out.println(name1+"\t"+name2);
		System.out.println(name1+"    "+name2);
		
		System.out.println(name1+"\\"+name2);
		System.out.println(name1+"\\\\"+name2);
		// "감강찬"탭만큼 뛸것"이순신
		System.out.println("\""+name1+"\""+"\t"+"\""+name2+"\"");

	 
			
		
	}
}
