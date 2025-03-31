package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.MemberService;
import service.MemberServiceImpl;
import util.JDBCUtil;
import util.ScanUtil;
import view.View;

public class MainController {
	static public Map<String, Object> sessionStorage = new HashMap<String, Object>();
	MemberServiceImpl memService = MemberServiceImpl.getInstance();

   public static void main(String[] args) {
	
	   MainController obj = new MainController();
	   obj.process();
}
   
   public void process() {
	   
	   View view = View.MAIN;
	   while(true) {
		   if(view == View.MAIN) view = home();
		   if(view == View.LOGIN) view = login();
		   if(view == View.MYPAGE) view = myPage();
	   }
   }
   
   public View myPage() {
	   System.out.println("====마이페이지====");
	   
	   System.out.println("1. 회원 리스트 출력");
	   System.out.println("2. 회원 정보 수정");
	   
	   int sel = ScanUtil.nextInt("선택 : ");
	   if(sel == 1) return View.LIST;
	   if(sel == 2) return View.UPDATE;
	   
	   
	   return View.MYPAGE;
   }
   
   public View join() {
		System.out.println("===회원가입===");
		
		String id = ScanUtil.nextLine("아이디 : ");
		String pw = ScanUtil.nextLine("비밀번호 : ");
		String name = ScanUtil.nextLine("이름 : ");
		
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		param.add(name);
		
		boolean pass = memService.join(param);
		
		if(pass) {
			System.out.println("회원가입 성공");
			return View.MAIN;
		}
		else {
			System.out.println("회원가입 실패");
			System.out.println("1. 회원가입");
			System.out.println("1. 홈");
			
			int sel = ScanUtil.nextInt("선택 : ");
			if(sel == 1) return View.JOIN;
			if(sel == 2) return View.MAIN;
			return View.MAIN;
		}
	   
   }
   
   public View login() {
	   
	   System.out.println("====로그인====");
	   
	   String id = ScanUtil.nextLine("아이디 : ");
	   String pw = ScanUtil.nextLine("비밀번호 : ");
	   
	   List<Object> param = new ArrayList<Object>();
	   param.add(id);
	   param.add(pw);
	   
	   boolean pass = memService.login(param);
	   if(pass) {
		   System.out.println("로그인 성공");
		   return View.MYPAGE;
	   }
	   else {
		   System.out.println("로그인 실패");
		   System.out.println("1. 재 로그인");
		   System.out.println("2. 회원가입");
		   System.out.println("2. 홈");
		   
		   int sel = ScanUtil.nextInt("선택 : ");
		   if(sel == 1) return View.LOGIN;
		   if(sel == 2) return View.JOIN;
		   if(sel == 3) return View.MAIN;
		   return View.LOGIN;
		   
	   }
	
	 
	   
   }
   
   public View home() {
	   System.out.println("====홈====");
	   System.out.println("1. 로그인");
	   System.out.println("2. 회원가입");
	   
	   int sel = ScanUtil.nextInt("선택 : ");
	   if(sel == 1) return View.LOGIN;
	   
	   return View.MAIN;
	   
   }

   
   
   
}
