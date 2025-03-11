package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import util.ScanUtil;
import util.View;
import vo.ProdVo;
import service.ProdService;

public class MainController {
	static public Map<String, Object> sessionStorage = new HashMap<>();

	
	ProdService prodService = ProdService.getInstance();
	
	public static void main(String[] args) {
		MainController mc= new MainController();
		mc.process();
	}
	
	public void process() {
		
		
		View view = View.HOME;
		while(true) {
			if(view==View.HOME) view = home();
			if(view==View.LIST) view = list();
			if(view==View.INSERT) view = insert();
			if(view==View.DETAIL) view = detail();
			if(view==View.DELETE) view = delete();
			if(view==View.UPDATEPRICE) view = updateprice();
			if(view==View.UPDATECONT) view = updatecont();
			if(view==View.UPDATENAME) view = updatename();
			
		}
	}
	
	public View delete() {
		int prodNo = (int)sessionStorage.get("prodNo");
		List<Object> param = new ArrayList<Object>();
		param.add(prodNo);
		
		prodService.delete(param);
		
		
		return View.LIST;
	}
	
	public View updateprice() {
		String price =ScanUtil.nextLine("수정된 가격 : ");
		int prodNo = (int)sessionStorage.get("prodNo");
		
		List<Object> param = new ArrayList<Object>();
		param.add(price);
		param.add(prodNo);
		prodService.updateprice(param);
		
		return View.DETAIL;
	}
	
	public View updatecont() {
		String contnet =ScanUtil.nextLine("수정된 내용 : ");
		int prodNo = (int)sessionStorage.get("prodNo");
		
		List<Object> param = new ArrayList<Object>();
		param.add(contnet);
		param.add(prodNo);
		prodService.updatecont(param);
		
		
		return View.DETAIL;
	}
	
	public View updatename() {
		String name =ScanUtil.nextLine("수정된 이름 : ");
		int prodNo = (int)sessionStorage.get("prodNo");
		
		List<Object> param = new ArrayList<Object>();
		param.add(name);
		param.add(prodNo);
		prodService.updatename(param);
		
		
		return View.DETAIL;
	}
	
	
	public View detail() {
		
		int prodNo = (int)sessionStorage.get("prodNo");
		List<Object> param = new ArrayList<Object>();
		param.add(prodNo);
		
		ProdVo prod = prodService.detail(param);
		
		prodNo =prod.getProd_no();
		String name = prod.getName();
		String content = prod.getContent();
		int price = prod.getPrice();
		String prodType = prod.getProd_type();
		String prodDate = prod.getProd_date();
		System.out.println(prodNo+"\t"+name+"\t"+content+"\t"+price+"\t"+prodType+"\t"+prodDate);
		
		
		System.out.println("1. 상품 가격수정");
		System.out.println("2. 상품 내용수정");
		System.out.println("3. 상품 이름수정");
		System.out.println("4. 삭제");
		System.out.println("5. 홈");
		
		int sel = ScanUtil.select();
		if(sel==1) {
			sessionStorage.put("prodNo", prodNo);
			return View.UPDATEPRICE;
		}
		if(sel==2)  {
			sessionStorage.put("prodNo", prodNo);
			return View.UPDATECONT;
		}
		if(sel==3)  {
			sessionStorage.put("prodNo", prodNo);
			return View.UPDATENAME;
		}
		if(sel==4) return View.DELETE;
		if(sel==5) return View.HOME;
		
		return View.DETAIL;
	}
	
	public View insert() {
		
		System.out.println("상품 등록");
		

		String name = ScanUtil.nextLine("이름 : ");
		String content = ScanUtil.nextLine("내용 : ");
		String price = ScanUtil.nextLine("가격 : ");
		String prodType = ScanUtil.nextLine("타입 : ");

		List<Object> param = new ArrayList();
		param.add(name);
		param.add(content);
		param.add(price);
		param.add(prodType);
		
		prodService.insert(param);

		
		return View.LIST;
		
	}
	
	public View list() {
		

		List<Object> param = new ArrayList();
		List<ProdVo> prodList = prodService.prodList(param);
		
		
		
//		if(prodList.size()!=0) {
//			ProdVo p = prodList.get(0);
//			System.out.println("=====상품리스트=========");
//			
//		}
		
		
		System.out.println();
		System.out.println("1. 상품 검색");
		System.out.println("2. 상품 등록");
		System.out.println("3. 상품 상세조회");

		int sel =ScanUtil.select();
		if(sel==1) {
			System.out.println("=====상품리스트=========");
			for(ProdVo prod : prodList) {
				int prodNo1 =prod.getProd_no();
				String name = prod.getName();
				String content = prod.getContent();
				int price = prod.getPrice();
				String prodType = prod.getProd_type();
				String prodDate = prod.getProd_date();
				System.out.println(prodNo1+"\t"+name+"\t"+content+"\t"+price+"\t"+prodType+"\t"+prodDate);
			}
			return View.LIST;
		}
		if(sel==2) return View.INSERT;
		if(sel==3) {
			int prodNo = ScanUtil.nextInt("상품 번호(미리 상품을 검색하세요) : ");
			sessionStorage.put("prodNo", prodNo);
			return View.DETAIL;
		}
		
		return View.LIST;
	}
	
	
	
	
	public View home() {
		System.out.println("====홈======");

		System.out.println();
		System.out.println("1. 상품 리스트");
		
		int sel =ScanUtil.select();
		if(sel==1) return View.LIST;
		
		return View.LIST;
		
		
	}
	


}
