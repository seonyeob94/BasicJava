package kr.or.ddit.study14;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import oracle.jdbc.driver.parser.util.Array;

public class F04FileIo {
	public static void main(String[] args) {
		
		byte[] inSrc = {97, 98, 99, 100, 49, 50, 51, 52, 101, 114, 119, 114, 119, 101, 51, 114, 119};
		byte[] outSrc = null;
		
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = bais.read()) !=-1) {
			System.out.println(data);
			baos.write(data);
		}
			
		outSrc = baos.toByteArray();
		
		System.out.println(Arrays.toString(outSrc));
	}
}
