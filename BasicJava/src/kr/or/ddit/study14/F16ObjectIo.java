package kr.or.ddit.study14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.util.ScanUtil;

public class F16ObjectIo {
	public static void main(String[] args) {
		F16ObjectIo obj = new F16ObjectIo();
		obj.process();
	}
	
	
	public void process() {
		readBoard();
		writeBoard();
	}
	
	List<Board> list = new ArrayList();
	
	public void readBoard() {
		try {
			FileInputStream fis = new FileInputStream("board.list");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<Board>) ois.readObject();
			
			for(Board b : list) {
				System.out.println(b.boardNo+"\t"+b.name+"\t"+b.content);
			}
			
			fis.close();
			ois.close();
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeBoard() {
		Board board = new Board();
		
		board.boardNo = ScanUtil.nextInt("게시글 번호 : ");
		board.name = ScanUtil.next("게시글 제목");
		board.content = ScanUtil.next("게시글 내용");
		
		list.add(board);
		
		try {
			FileOutputStream fos = new FileOutputStream("board.list");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void read() {
		try {
			FileInputStream fis;
			fis = new FileInputStream("board");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Board board =(Board) ois.readObject();
			
			System.out.println(board.boardNo);
			System.out.println(board.name);
			System.out.println(board.content);
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	
	public void write() {
		
		Board board = new Board();
		board.boardNo =1;
		board.name = "게시글1";
		board.content = "내용1";
				
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("board");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(board);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Board implements Serializable{
	int boardNo;
	String name;
	String content;
}

