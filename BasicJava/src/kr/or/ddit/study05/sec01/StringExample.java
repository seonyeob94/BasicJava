package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class StringExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringExample obj = new StringExample();
		obj.process();

	}

	public void process() {
		//==은 스택영역에서 비교
		//String비교할때 ==은 좋은 비교법이 아니다
		//String비교할때 무조건 equals사용
		
//		String a= "강감찬";
//		String b= "강감찬";
//		String c= "이순신";
//		String d= new String("이순신");//new키워드가 나오면 힙에 들어감
//		String e= new String("이순신");
//		
//		System.out.println(a==b);
//		System.out.println(c==d);
//		System.out.println(d==e);
		
//		System.out.println(c.equals(d));
//		System.out.println(d.equals(e));
		
		//연결이 안된게 null, 연결은 되었지만 값이 없는게""
		String a = null;
		
		if(a==null||a.equals("")) {
			System.out.println("값이 비었음");
		}
		//a.equals("")는 실행되지 않는다
		//객체가 없으면 메소드를 실행할 수 없다
		//a==null이 참이니까 뒤의 조건을 실행하지 않는다
		
//		if(a.equals("")||a==null) {
//			System.out.println("값이 비었음");
//		}
	}
}
