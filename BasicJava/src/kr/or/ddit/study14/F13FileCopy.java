package kr.or.ddit.study14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F13FileCopy {
	public static void main(String[] args) throws IOException {
		//파일 복사
//		Reader reder =new FileReader("file/writer.txt");
//		
//		String str = "";
//		int data = 0;
//		
//		while((data = reder.read()) != -1) {
//			str+=(char)data;
//		}
//		
//		Writer writer =new FileWriter("file/copy.txt");
//		writer.write(str);
//		writer.flush();
		
//		Files.copy(Paths.get("file/writer.txt"), Paths.get("file/copy2.txt"));
		
//	    String str =Files.readString(Paths.get("file/writer.txt"));
//		System.out.println(str);
		
		String str = "test";
		Files.write(Paths.get("file/aa.txt"), str.getBytes());
	}
}
