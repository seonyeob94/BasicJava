package kr.or.ddit.study14;

import java.io.File;
import java.io.IOException;

public class F02FileTest {
	public static void main(String[] args) {
		F02FileTest obj = new F02FileTest();
		obj.process();
	}
	
	public void process() {
//		File f1 = new File("file/f01/test.txt");
//		
//		try {
//			if(!f1.exists()) {
//				
//				boolean b =f1.createNewFile();
//				if(b) System.out.println(f1+"파일이 생성되었습니다.");
//				if(!b) System.out.println(f1+"파일이 생성 실패");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	    String path = "file/f01/f02/test.txt";
//		createFolderAndFile(path);
	
		File path = new File("\\\\192.168.145.44\\공유폴더\\JAVA");
		findFile(path);
	
	}
	
	public void findFile(File f) {
		if(f.isDirectory()) {
			
			File[] files = f.listFiles();
			for(File file : files) {
				if(file.isDirectory()) {
					System.out.println("Folder : "+file);
					findFile(file);
				}else {
					String name = file.getName();
					if(!name.endsWith(".java")) continue;
					if(!name.startsWith("Home")) continue;
					System.out.println("File : "+ file);
				}
			}
		}
		
	}
	public boolean createFolderAndFile(String path) {
		
		File file= new File(path);
		File folder= file.getParentFile();
		if(!folder.exists()) folder.mkdirs();
		if(!file.exists()) {
			
			try {
				file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		  return true;	
		
		}
		
		
		return false;
	}
	
}
