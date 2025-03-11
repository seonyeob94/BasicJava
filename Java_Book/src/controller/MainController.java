package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import service.BookService;
import util.ScanUtil;
import util.View;
import vo.BookVo;
import vo.StockVo;


public class MainController {
	static public Map<String, Object> sessionStorage = new HashMap<>();

	BookService bookService = BookService.getInstance();
	
	public static void main(String[] args) {
		MainController mc= new MainController();
		mc.process();
	}
	
	public void process() {
		
		
		View view = View.HOME;
		while(true) {
			if(view==View.HOME) view = home();
			if(view==View.BOOK_LIST) view = booklist();
			if(view==View.BOOK_INSERT) view = bookInsert();
			if(view==View.BOOK_DETAIL) view = bookDetail();
			if(view==View.BOOK_DELETE) view = bookDelete();
			if(view==View.BOOK_UPDATE) view = bookUpdate();
			
			
		}
	}
	
	public View bookUpdate() {
		
		String name = ScanUtil.nextLine("제목 : ");
		String cont = ScanUtil.nextLine("내용 : ");
		String writer = ScanUtil.nextLine("작가 : ");
		String type = ScanUtil.nextLine("분류 : ");
		int bookNo=(int) sessionStorage.get("bookNo");
		List<Object> param = new ArrayList();
		param.add(name);
		param.add(cont);
		param.add(writer);
		param.add(type);
		param.add(bookNo);
		bookService.bookUpdate(param);
		
		return View.BOOK_LIST;
	}
	
	public View bookDelete() {
		
		int bookNo=(int) sessionStorage.get("bookNo");
		List<Object> param = new ArrayList();
		param.add(bookNo);
		bookService.bookDelete(param);
		
		return View.BOOK_LIST;
	}
	
	public View bookDetail() {
		
		int bookNo =(int) sessionStorage.get("bookNo");
		
		List<Object> param = new ArrayList();
		param.add(bookNo);
		
		BookVo book = bookService.bookDetail(param);
		
		System.out.println("책번호\t제목\t\t내용\t저자\t분류\t출판일");
		System.out.println("============================================================");
		
		System.out.println(book);
		
		System.out.println("1. 삭제");
		System.out.println("2. 수정");
		System.out.println("3. 목록");
		System.out.println("4. 홈");
		
		int sel = ScanUtil.select();
		if(sel==1) return View.BOOK_DELETE;
		if(sel==2) return View.BOOK_UPDATE;
		if(sel==3) return View.BOOK_LIST;
		if(sel==4) return View.HOME;
		
		return View.BOOK_DETAIL;
	}
	public View bookInsert() {
		int bookNo = bookService.getBookNo();
		List<Object> param = new ArrayList<Object>();
		
		param.add(bookNo);
//		String name = ScanUtil.nextLine("제목");
//		List<Object> param = new ArrayList<Object>();
		param.add(ScanUtil.nextLine("제목 : "));
		param.add(ScanUtil.nextLine("내용 : "));
		param.add(ScanUtil.nextLine("저자 : "));
		param.add(ScanUtil.nextLine("분류 : "));
//		param.add(ScanUtil.nextLine("출판사 : "));
		param.add(ScanUtil.nextLine("출판일(2025.3.11) : "));
		
		bookService.bookInsert(param);
		
		sessionStorage.put("bookNo", bookNo);
		
		return View.BOOK_DETAIL;
	}
	
	public View booklist() {
		int pageNo = 1;
		
		if(sessionStorage.containsKey("pageNo")) {
			pageNo= (int) sessionStorage.remove("pageNo");
		}
		int blockSize = 3;
		if(sessionStorage.containsKey("blockSize")) {
			blockSize = (int) sessionStorage.get("blockSize");
		}
		
		int startNo = 1+ (pageNo-1)*blockSize;
		int endNo = pageNo*blockSize;
		int cnt = bookService.getBookNo();
		
		List<Object> param = new ArrayList();
		param.add(startNo);
		param.add(endNo);
		
		List<BookVo> bookList = bookService.bookList(param);
		
		System.out.println("책번호\t제목\t\t내용\t저자\t분류\t출판일");
		for(BookVo bookVo : bookList) {
			System.out.println(bookVo);
		}
		
		System.out.println("<이전 페이지  다음페이지> ");
		System.out.println("1. 책 등록");
		System.out.println("2. 상세조회");
		System.out.println("3. 블록사이즈 변경");
		String sel = ScanUtil.nextLine("선택 : ");
		if(sel.equals("1")) return View.BOOK_INSERT;

		if(sel.equals("2")) {
			int bookNo = ScanUtil.nextInt("책 번호 : ");
			sessionStorage.put("bookNo", bookNo);
			return View.BOOK_DETAIL;
		}
		
		
		if(sel.equals("3")) {
			blockSize = ScanUtil.nextInt("변경값 : ");
			sessionStorage.put("blockSize", blockSize);
				return View.BOOK_LIST;
			}
			
		if(sel.equals("<")) {
			if(pageNo==1) {
				System.out.println("처음 페이지 입니다");
				return View.BOOK_LIST;
			}
			sessionStorage.put("pageNo", --pageNo);
			return View.BOOK_LIST;
		}
		
		
		if(sel.equals(">")) {
			//cnt
			if((cnt+blockSize-1)/blockSize==pageNo) {
				System.out.println("마지막 페이지 입니다");
				return View.BOOK_LIST;
				
			}
			sessionStorage.put("pageNo", ++pageNo);
			return View.BOOK_LIST;
		}
		
		
		
		return View.HOME;
	}
	
	
	
	public View home() {
		System.out.println("====홈======");
		/*
		 * 1. 책 리스트
		 * 
		 */
		System.out.println("1. 책 관리");
		System.out.println("2. 보유 책 관리");
		int sel =ScanUtil.select();
		if(sel == 1) return View.BOOK_LIST;
		
		return View.HOME;
		
		
	}
	


}
