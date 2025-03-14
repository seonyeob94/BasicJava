package kr.or.ddit.study14;

import java.io.File;

public class F01FileTest {
	public static void main(String[] args) {
		//File 객체 만들기
		
		//1. new File(String 파일 또는 경로명)
		// => 디렉토리와 디렉토리 사이 또는 디렉토리 파일의 구분자는
		// '\', 사용되거나 '/'를 사용할 수 있다.
		
		File file = new File("file/f01");
		
		System.out.println("파일 명 : "+file.getName());
		System.out.println("파일 여부 : "+ file.isFile());
		System.out.println("폴더 여부 : "+ file.isDirectory());
		
		//절대 경로, 상대 경로
		
		File test = new File("D:/FileTest/test1.txt");
		
		System.out.println("부모(폴더) 이름 :"+ test.getParent());
		System.out.println("파일 크기 : "+test.length());
		
		// 디렉토리 만들기
		// 1. mkdir -> File 객체의 경로중 마지막 위치의 디렉토리를 만든다ㅏ
		//             중간 경로가 모두 미리 만들어져 있어야 한다.
		// 2. mkdirs-> 중간경로가 없으면 중간 경로도 새롭게 만든 후 마지막 위치의
        //              디렉토리를 만들어준다
		
		File f01 = new File("D:/FileTest/f01/folder");
		
		if(!f01.exists()) {
			
			boolean b = f01.mkdir();
			if(b) System.out.println(f01.getName()+"폴더가 생성되었습니다");
			if(!b) System.out.println(f01.getName()+"폴더가 생성 실패");
		}
		
		else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		
		
		File f02 = new File(file, "test");
		
			f02.mkdirs();
			
		
		
		
		
		
	}
}
