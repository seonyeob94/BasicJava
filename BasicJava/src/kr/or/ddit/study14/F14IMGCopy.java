package kr.or.ddit.study14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class F14IMGCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("file/초롱이.png");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("file/copy.png");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int data =0;
		
		while( (data = fis.read()) !=-1) {
			bos.write(data);
		}
		
	}
}
