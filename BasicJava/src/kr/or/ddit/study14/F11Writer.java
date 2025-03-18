package kr.or.ddit.study14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class F11Writer {
	public static void main(String[] args) throws IOException {
		Writer writer= new FileWriter("file/writer.txt");
		
		writer.write("테스트");
		writer.write("입니다");
		
		writer.flush();
	}
}
