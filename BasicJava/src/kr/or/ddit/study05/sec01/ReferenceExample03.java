package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceExample03 obj = new ReferenceExample03();
		obj.process();

	}

	public void process() {
		int a= 10;
		
		if(a==10) {
			
			int sum=0;
			
			for(int i=1;i<=3;i++) {
				String str= new String("abc");//루프가 한번 끝날때 str이 사라짐
				sum+=i;
				
				
			}
			
			int b=20;
			
			String str= "abc";
			
			
		}
		int sum=0;
		int i=2;
		
		for(;i<3;i++) {
			sum+=i;
		}
		
		
		
		
	}
}
