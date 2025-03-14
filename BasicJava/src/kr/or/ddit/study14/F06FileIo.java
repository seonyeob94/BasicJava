package kr.or.ddit.study14;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import oracle.jdbc.driver.parser.util.Array;

public class F06FileIo {
	public static void main(String[] args) {
		
		byte[] inSrc = {97, 98, 99, 100};
		File outFile = new File("out2.txt");
		
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		int data = 0;
		String fileStr = "";
		while((data = bais.read()) !=-1) {
			try {
				fos.write(data);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
			
		
	}
}
