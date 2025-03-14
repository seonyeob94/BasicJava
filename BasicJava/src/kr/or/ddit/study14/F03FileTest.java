package kr.or.ddit.study14;

import java.io.File;

public class F03FileTest {
	public static void main(String[] args) {
		
		File f = new File("file");
		File f2 = new File(f.getAbsolutePath());
		
		System.out.println(f2);
	}
}
