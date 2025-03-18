package kr.or.ddit.study14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Date;

public class F10BufferStream {
	public static void main(String[] args) throws IOException {
		// BufferInputStream
		// 하드디스크에 자주 접촉하는것은 물지적 손상을 일으킬 수 있으며
		// 속도가 느리다.
		// 따라서 한번 접촉할때 많은 값을 가져오는 것이 속도, 물리적으로 유리하다.
		// 기본적으로 8192 바이트 크기를 가지며 버퍼 사이즈를 수정 할 수도 있다
		// 보조스트림이라고 불린다
		
		FileInputStream fis = new FileInputStream("out3.txt");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		Date d1 = new Date();
		
		int data =0;
		while( (data = bis.read()) !=-1) {
			
		}
		
		Date d2 = new Date();
		
		System.out.println(d2.getTime() - d1.getTime());
	}
}
