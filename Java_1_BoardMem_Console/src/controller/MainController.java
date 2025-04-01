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
import java.math.BigDecimal;


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
		   if(view == View.JOIN) view = join();
		   if(view == View.MYPAGE) view = myPage();
		   if(view == View.LIST) view = list();
		   if(view == View.UPDATE) view = update();
		   if(view == View.DELETE) view = delete();
	   }
   }
   
   public View delete() {
	   int memNo = (int)sessionStorage.get("memNo");
	   List<Object> param = new ArrayList();
	   param.add(memNo);
	   
	   boolean pass = memService.delete(param);
	   if(pass) {
		   System.out.println("회원탈퇴 성공");
		   return View.LIST;
	   }
	   else {
		   System.out.println("회원탈퇴 실패");
			System.out.println("1. 회원탈퇴");
			System.out.println("2. 홈");
			
			int sel = ScanUtil.nextInt("선택 : ");
			if(sel == 1) return View.DELETE;
			if(sel == 2) return View.MAIN;
		   
		   return View.LIST;
	   }
   }
   
   public View update() {
	   int memNo = (int)sessionStorage.get("memNo");
	   String id = ScanUtil.nextLine("아이디 : ");
	   String pw = ScanUtil.nextLine("비밀번호 : ");
	   
	   List<Object> param = new ArrayList();
	   param.add(id);
	   param.add(pw);
	   param.add(memNo);
	   
	   boolean pass = memService.update(param);
	   if(pass) {
		   System.out.println("정보수정 성공");
		   return View.MYPAGE;
	   }else {
			System.out.println("정보수정 실패");
			System.out.println("1. 회원가입");
			System.out.println("2. 홈");
			
			int sel = ScanUtil.nextInt("선택 : ");
			if(sel == 1) return View.UPDATE;
			if(sel == 2) return View.MAIN;
			return View.MAIN;
		}
	   
	  
   }
   
   public View list() {
	   System.out.println("====리스트==============");
	   
	   List<Map<String, Object>> memberList = memService.list();
	   System.out.println("회원번호\t아이디\t이름");
	   System.out.println("========================");
	   for(Map<String, Object> member : memberList) {
		   
		   int memNo = ((BigDecimal) member.get("MEM_NO")).intValue();

		   String id = (String)member.get("ID");
		   String name = (String)member.get("NAME");
		   System.out.println(memNo+"\t"+id+"\t"+name);
	   }
	   
	   return View.MYPAGE;
   }
   
   public View myPage() {
	   System.out.println("====마이페이지==============");
	   
	   System.out.println("1. 회원 리스트 출력");
	   System.out.println("2. 회원 정보 수정");
	   System.out.println("3. 회원 탈퇴");
	   System.out.println("4. 홈");
	   
	   int sel = ScanUtil.nextInt("선택 : ");
	   if(sel == 1) return View.LIST;
	   if(sel == 2) {
		   int memNo = ScanUtil.nextInt("회원번호(미리 번호를 확인하세요) : ");
		   sessionStorage.put("memNo", memNo);
		   return View.UPDATE;
	   }
	   if(sel == 3) {
		   int memNo = ScanUtil.nextInt("회원번호(미리 번호를 확인하세요) : ");
		   sessionStorage.put("memNo", memNo);
		   return View.DELETE;
	   }
	   if(sel == 4) return View.MAIN;
	   
	   
	   return View.MYPAGE;
   }
   
   public View join() {
		System.out.println("===회원가입=============");
		
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
			System.out.println("2. 홈");
			
			int sel = ScanUtil.nextInt("선택 : ");
			if(sel == 1) return View.JOIN;
			if(sel == 2) return View.MAIN;
			return View.MAIN;
		}
	   
   }
   
   public View login() {
	   
	   System.out.println("====로그인==============");
	   
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
		   System.out.println("3. 홈");
		   
		   int sel = ScanUtil.nextInt("선택 : ");
		   if(sel == 1) return View.LOGIN;
		   if(sel == 2) return View.JOIN;
		   if(sel == 3) return View.MAIN;
		   return View.LOGIN;
		   
	   }
	
	 
	   
   }
   
   public View home() {
	   System.out.println("====홈==============");
	   System.out.println("1. 로그인");
	   System.out.println("2. 회원가입");
	   
	   int sel = ScanUtil.nextInt("선택 : ");
	   if(sel == 1) return View.LOGIN;
	   if(sel == 2) return View.JOIN;
	   
	   return View.MAIN;
	   
   }

   
   
   
}
