package kr.or.ddit.study14;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import kr.or.ddit.util.ScanUtil;

public class F07FileIo {
	public static void main(String[] args) {
		String str = ScanUtil.next("텍스트 입력 : ");
		byte[] inSrc= str.getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		
		//out3.txt
		File f = new File("out3.txt");
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int data =0;
		
		while((data = bais.read()) != -1 ){
			try {
				fos.write(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
