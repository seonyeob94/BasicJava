package kr.or.ddit.study14;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class F05FileIo {
	public static void main(String[] args) {
	
		try {
			FileInputStream fis = new FileInputStream("file/f01/f02/test.txt");
			byte[] outSrc = null;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			int data =0;
			while ( (data = fis.read()) !=-1) {
				System.out.print((char)data);
				baos.write(data);
			}
			
			outSrc = baos.toByteArray();
			System.out.println(Arrays.toString(outSrc));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
