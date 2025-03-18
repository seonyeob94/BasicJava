package kr.or.ddit.study14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F09FileIo {
	public static void main(String[] args) throws IOException {
		
		String str = "가나다라";
		
//		FileOutputStream fos = new FileOutputStream("out4.txt");
//		
//		fos.write(str.getBytes());
		
		FileInputStream fis = new FileInputStream("out4.txt");
		
		int data =0;
		while( (data=fis.read()) !=-1) {
//			System.out.print((char)data);
			System.out.println(data);
		}
	}
}
