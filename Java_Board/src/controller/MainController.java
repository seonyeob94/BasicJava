package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.crypto.MacSpi;
import javax.net.ssl.SSLContext;

import service.BoardService;
import util.ScanUtil;
import util.View;

public class MainController {
	static public Map<String, Object> sessionStorage = new HashMap<>();
	
	BoardService boardService = BoardService.getInstance();
	
	public static void main(String[] args) {
		MainController mc= new MainController();
		mc.process();
	}
	
	public void process() {
		sessionStorage.put("memNo", 1);
		View view = View.HOME;
		while(true) {
			if(view==view.HOME) view=home();
			if(view==view.LIST) view=list();
			if(view==view.INSERT) view=insert();
			if(view==view.DETAIL) view=detail();
			if(view==view.UPDATE) view=update();
			if(view==view.DELETE) view=delete();
		}
	}
	
	
	public View delete() {
		

		int boardNo = (int) sessionStorage.get("boardNo");
		List<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		boardService.delete(param);
		
		return View.DETAIL;
	}
	
	
	public View update() {
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");

		int boardNo = (int) sessionStorage.get("boardNo");
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		boardService.update(param);
		
		return View.DETAIL;
	}
	
	public View detail() {
		// 값 출력 후, 수정 삭제
		System.out.println("상세 페이지");
		int boardNo = (int) sessionStorage.get("boardNo");
		Map<String, Object> map = boardService.detail(boardNo);
		String title = (String)map.get("TITLE");
		String content = (String)map.get("CONTENT");
		String regDate = (String)map.get("REG_DATE");
		String name = (String)map.get("NAME");
		String delyn = (String)map.get("DELYN");
		BigDecimal cnt = (BigDecimal)map.get("CNT");
		BigDecimal memNoB = (BigDecimal)map.get("MEM_NO");
		
		int memNo = (int)sessionStorage.get("memNo");
		
		System.out.println(boardNo+"\t"+title+"\t"+content+"\t"+regDate+"\t"+name+"\t"+cnt+"\t"+delyn);
		
		
		System.out.println("1. 리스트");
		if(memNo == memNoB.intValue()) {
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
		}
		
		int sel = ScanUtil.select();
		if(sel==1) return View.LIST;
		
		if(memNo == memNoB.intValue()) {
			if(sel==2) return View.UPDATE;
			if(sel==3) return View.DELETE;			
		}
		
		return View.LIST;
	}
	
	public View insert() {
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");
		
		int memNo =(int)sessionStorage.get("memNo");
		int codeNo =(int)sessionStorage.get("code");
		List<Object> param = new ArrayList();
		param.add(title);
		param.add(content);
		param.add(memNo);
		param.add(codeNo);
		
		
		boardService.insert(param);
		
		return View.LIST;
		
	}
	
	public View list() {
		System.out.println("===게시판 리스트===");
		int code = (int)sessionStorage.get("code");
		
		List<Object> param = new ArrayList<Object>();
		param.add(code);
		
		List<Map<String, Object>> list = boardService.list(param);
		Map<String, Object> m =list.get(0);
		String codeName = (String)m.get("CODE_NAME");
		System.out.println("======"+codeName+"========");
		for(Map<String, Object> map : list) {
//			System.out.println(map);
			BigDecimal boardNo = (BigDecimal)map.get("BOARD_NO");
			String title = (String)map.get("TITLE");
			String content = (String)map.get("CONTENT");
			String regDate = (String)map.get("REG_DATE");
			String name = (String)map.get("NAME");
			String delyn = (String)map.get("DELYN");
			BigDecimal cnt = (BigDecimal)map.get("CNT");
			if(!delyn.equals("Y"))	{System.out.println(boardNo+"\t"+title+"\t"+content+"\t"+regDate+"\t"+name+"\t"+cnt+"\t"+delyn);}
		}
		
		System.out.println("1. 게시판 등록");
		System.out.println("2. 게시판 상세 조회");
		System.out.println("3. 홈");
		int sel = ScanUtil.select();
		if(sel==1) return View.INSERT;
		if(sel==2) {
			int boardNo = ScanUtil.nextInt("게시글 번호 : ");
			sessionStorage.put("boardNo", boardNo);
			
			return View.DETAIL;
		}
		if(sel==3) return View.HOME;
		
		
		return View.HOME;
	}
		
	public View home() {
		System.out.println("1. 자유게시판");
		System.out.println("2. Q&A게시판");
		
		int sel = ScanUtil.nextInt("선택 : ");
		sessionStorage.put("code", sel);
		return View.LIST;
	}
	


}
