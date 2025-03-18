package kr.or.ddit.study14;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class F12Reader {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("file/writer.txt");
		
		int data =0;
		while((data = reader.read()) !=-1) {
			System.out.println((char)data);
		}
	}
}
