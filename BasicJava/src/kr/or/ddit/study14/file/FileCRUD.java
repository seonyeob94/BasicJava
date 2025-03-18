package kr.or.ddit.study14.file;

import java.io.File;

import kr.or.ddit.util.ScanUtil;

public class FileCRUD {
	public static void main(String[] args) {
		FileCRUD obj = new FileCRUD();
		obj.process();
	}
	
	public void process() {
		curent = new File("crud");
		root = curent.getAbsolutePath();
		while(true) {
			System.out.println("1. 파일 리스트 출력");
			System.out.println("2. 이동");
			System.out.println("3. 폴더 생성");
//			System.out.println("4. 상위 폴더 이동");
			System.out.println("5. 삭제");
			System.out.println("6. 수정");
			int sel = ScanUtil.select();
			if(sel==1)  printList();
			if(sel==2)  moveFolder();
			if(sel==3)  createFolder();
			if(sel==4)  moveParent();
			if(sel==5)  deleteFile();
			if(sel==6)  renameFile();
		}
	}
	String root;
	File curent;
	
	public void renameFile() {
		
		String org = ScanUtil.next("바꿀 파일 : ");
		String change = ScanUtil.next("변경된 이름 : ");
		
		File orgFile = new File(curent, org);
		File chgFile = new File(curent, change);
		
		orgFile.renameTo(chgFile);
	}
	
	public void deleteFile() {
		printList();
		
		String name = ScanUtil.next("삭제할 파일명 : ");
		
		File delete = new File(curent, name);
		
		delete.delete();
		printList();
	}
	
	public void moveParent() {
		File parent = curent.getParentFile();
		if(curent.getAbsolutePath().equals(root)){
			System.out.println("최상위 경로입니다");
			return;
		}
		curent=parent;
		printList();
	}
	
	public void moveFolder() {
		printList();
		String name = ScanUtil.next("이동할 폴더 입력 : ");
		
		// ..
		if(name.equals("..")) {
			moveParent();
			return;
		}
		
		File folder = new File(curent, name);
		if(!folder.exists()) {
			System.out.println("해당 파일은 존재하지 않습니다.");
			return;
		}
		if(folder.isDirectory()) {
			curent = folder;
		}
		else System.out.println("해당 파일은 폴더가 아닙니다.");
		
	}
	public void createFolder() {
		// crud 폴더 밑에 폴더 생성
		// 파일이 없으면 만들고 있다면 이미 있습니다 출력
		String name = ScanUtil.next("폴더이름 : ");
		File folder = new File(curent, name);
//	    folder.mkdirs();
		
		if(folder.exists()) System.out.println("이미 있습니다");
		else {
			folder.mkdir();
			printList();
		}
	}
	
	public void printList() {
		// crud 폴더 밑에 파일 리스트 출력하기
		
		
		for(File f : curent.listFiles()) {
			// file        (F) 
			// directory   (D)
			// 이름만 출력
			String name = f.getName();
			if(f.isDirectory()) {
				System.out.println("D : "+name);
			}
			
			
		}
		for(File f : curent.listFiles()) {
			//file         (f)
			String name = f.getName();
			if(f.isFile()) {
				System.out.println("F : " +name);
			}
		}
	}
}
