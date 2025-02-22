package kr.or.ddit.study11;

import java.util.Date;

public class StringTest {
	public static void main(String[] args) {
		StringTest st  = new StringTest();
		st.process();
	}
	
	
	public void method2 (int length) {
		//객체가 하나 만들어지기 때문에 빠르다
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<length; i++) {
			sb.append("a");
		}
	}
	
	
	public void process() {
		Date d1 = new Date();
		
		method2(10000000);
		
//		for(int i=0; i<1000000; i++) {
//			
//		}
		Date d2 = new Date();
		long time = d2.getTime() - d1.getTime()	;
		System.out.println(time+"ms");
	}
	
	public void method1(int length) {
		//백만개의 스트링을 만든 것과 같다.
		String str = "";
		for(int i=0;i<length; i++) {
			str+="a";
		}
		
	}
	
	
	
}
