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
			
		}
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
