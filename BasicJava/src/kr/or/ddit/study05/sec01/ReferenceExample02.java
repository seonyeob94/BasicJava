package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceExample02 obj = new ReferenceExample02();
		obj.process();

	}

	public void process() {
		int a = 10;
		
		if(a==10) {
			int b = 15;
			
			String str1= "abc";
			String str2= new String("abc");
			
			if(str1==str2) {
				int c= 20;
				
				String str3= "def";
				
			}
			else {
				String str4= "test";
			}
			String str5= "def";
			
			int d= 30;
			
		}
		int e= 50;
		
		String str6= "test";
	}

}
