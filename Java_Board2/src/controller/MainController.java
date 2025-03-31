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
import service.MemberService;
import util.ScanUtil;
import util.View;
import vo.BoardVo;
import vo.CodeVo;
import vo.MemberVo;

public class MainController {
	static public Map<String, Object> sessionStorage = new HashMap<>();
	
	BoardService boardService = BoardService.getInstance();
	MemberService memberService= MemberService.getInstance();
	
	public static void main(String[] args) {
		MainController mc= new MainController();
		mc.process();
	}
	
	public void process() {
//		sessionStorage.put("memNo", 2);
		View view = View.HOME;
		while(true) {
			if(view==View.HOME) view = home();
			if(view==View.LIST) view = list();
			if(view==View.INSERT) view = insert();
			if(view==View.DETAIL) view = detail();
			if(view==View.UPDATE) view = update();
			if(view==View.DELETE) view = delete();
			if(view==View.LOGIN) view = login();
		}
	}
	
	public View login() {
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("pw : ");
		
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		
		MemberVo member = memberService.login(param);
		if(member == null) {
			System.out.println("로그인 실패");
			return View.LOGIN;
		}
		
		sessionStorage.put("memNo", member.getMem_no());
		
		
		View view =(View)sessionStorage.get("view");
		if(view==null) return View.HOME;
		return view;
	}
	
	public View delete() {
		int boardNo = (int) sessionStorage.get("boardNo");
		List<Object> param = new ArrayList();
		param.add(boardNo);
		boardService.delete(param);
		
		
		return View.LIST;
	}
	
	public View update() {
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");
		int boardNo = (int)sessionStorage.get("boardNo");
		
		System.out.println("업데이트");
		
		List<Object> param = new ArrayList();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		boardService.update(param);
		
		return View.DETAIL;
	}
	
	public View detail() {
		int boardNo = (int)sessionStorage.get("boardNo");
		List<Object> param = new ArrayList();
		param.add(boardNo);
		BoardVo board = boardService.detail(param);
		
		String title = board.getTitle();
		String content = board.getContent();
		String name = board.getName();
		String regDate= board.getReg_date();
		int cnt = board.getCnt();
		
		int memNoB= board.getMem_no();
		int memNo = 0;
		
		if(sessionStorage.containsKey("memNo")) {
			memNo=(int) sessionStorage.get("memNo");
		}
		
		
		System.out.println(boardNo+"\t"+title+"\t"+content+"\t"+name+"\t"+regDate+"\t"+cnt);
		
		System.out.println("1. 리스트");
		if(memNo==memNoB) {
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			
		}
		
		int sel = ScanUtil.select();
		if(sel==1) return View.LIST;

		if(memNo==memNoB) {
			if(sel==2) return View.UPDATE;
			if(sel==3) return View.DELETE;
			
		}
		
		
		return View.DETAIL;
	}
	
	public View insert() {
		
		if(!sessionStorage.containsKey("memNo")) {
			sessionStorage.put("view", View.INSERT);
			return View.LOGIN;
		}
			System.out.println("게시글 작성");
		int memNo = (int)sessionStorage.get("memNo");
		int codeNo = (int)sessionStorage.get("codeNo");
		
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");
		
		List<Object> param = new ArrayList();
		param.add(title);
		param.add(content);
		param.add(memNo);
		param.add(codeNo);
		
		boardService.insert(param);
		
		return View.LIST;
	}
	
	public View list() {
		
		
		
		int codeNo = (int) sessionStorage.get("codeNo");
		
		List<Object> param = new ArrayList();
		param.add(codeNo);
		List<BoardVo> boardList = null;
		
		if(sessionStorage.containsKey("search")) {
			String search = (String)sessionStorage.remove("search");
			param.add(search);
			boardList = boardService.boardListSearch(param);
		
			
			
		}
		else {
			
			 boardList = boardService.boardList(param);
			
			
		}
		
		if(boardList.size()!=0) {
			BoardVo b = boardList.get(0);
			System.out.println("====="+b.getCode_name()+"=========");
			
		}
		for(BoardVo board : boardList) {
//			System.out.println(board);
			int boardNo = board.getBoard_no();
			String title = board.getTitle();
			String content = board.getContent();
			String name = board.getName();
			String regDate= board.getReg_date();
			int cnt = board.getCnt();
			
			System.out.println(boardNo+"\t"+title+"\t"+content+"\t"+name+"\t"+regDate+"\t"+cnt);
		}
		
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 상세보기");
		System.out.println("3. 홈");
		System.out.println("4. 검색");
		
		int sel = ScanUtil.select();
		if(sel ==1) return View.INSERT;
		if(sel ==2) {
			int boardNo = ScanUtil.nextInt("게시글 번호 : ");
			sessionStorage.put("boardNo", boardNo);
			return View.DETAIL;
		}
		if(sel==4) {
			String search = ScanUtil.nextLine("검색어 : ");
			
			sessionStorage.put("search", search);
			
			return View.LIST;
		}
		
		return View.HOME;
	}
	
	
	
	
	public View home() {
		List<CodeVo> codeList = boardService.codeList();
		for(CodeVo code : codeList) {
			System.out.println(code.getCode_no()+". "+code.getCode_name());
		}
		
		int sel = ScanUtil.select();
		sessionStorage.put("codeNo", sel);
		
		return View.LIST;
		
		
	}
	
	


}
