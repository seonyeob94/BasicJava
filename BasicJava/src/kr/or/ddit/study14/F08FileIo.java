package kr.or.ddit.study14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F08FileIo {
	public static void main(String[] args) {
		// out3.txt -> out3Copy.tex
		
		File inSrc = new File("out3.txt");
		
		File outSrc = new File("out3Copy.txt");
		FileInputStream fis =null;
		FileOutputStream fos = null;
		
		try {
			fos= new FileOutputStream(outSrc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 fis = new FileInputStream(inSrc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int data =0;
		
		try {
			while((data = fis.read()) !=-1){
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
