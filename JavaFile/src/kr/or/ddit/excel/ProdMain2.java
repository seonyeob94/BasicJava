package kr.or.ddit.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import util.ScanUtil;

public class ProdMain2 {
	public static void main(String[] args) {
		ProdMain2 obj = new ProdMain2();
		obj.init();
		obj.process();
	}
	
	List<Prod2> prodList;
	List<Cart2> cartList;
	
	public void init() {
		// 엑셀 읽어서 list 불러오기.
		// 엑셀 파일이 없다면 new ArrayList();
		
		// 엑셀 파일명 excel/prod.xlsx
		// 엑셀 파일명 excel/cart.xlsx
		
		File prodFile = new File("excel/prod2.xlsx");
		
		File cartFile = new File("excel/cart2.xlsx");
		
		if(prodFile.exists()) prodList = readProdExcel(prodFile);
		else 
			prodList = new ArrayList<Prod2>();
		if(cartFile.exists()) cartList = readCartExcel(cartFile);
		else cartList = new ArrayList<Cart2>();
		
	}
	
	private List<Cart2> readCartExcel(File cartFile){
		List<Cart2> cartList = new ArrayList<Cart2>();
		
		Workbook workbook;
		try {
			workbook = new XSSFWorkbook(cartFile);
			Sheet sheet = workbook.getSheetAt(0);
			
			int rows = sheet.getPhysicalNumberOfRows();
			for(int i=1;i<rows;i++) {
				Cart2 cart = new Cart2();
				cart.setCartNo((int)sheet.getRow(i).getCell(0).getNumericCellValue());
				cart.setProdNo((int)sheet.getRow(i).getCell(1).getNumericCellValue());
				cart.setCnt((int)sheet.getRow(i).getCell(2).getNumericCellValue());
				cartList.add(cart);
			}
			
			workbook.close();
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return cartList;
	}
	
	private List<Prod2> readProdExcel(File prodFile){
		List<Prod2> prodList = new ArrayList<Prod2>();
		
		try {
			Workbook workbook = new XSSFWorkbook(prodFile);
			Sheet sheet = workbook.getSheetAt(0);
			
			int rows = sheet.getPhysicalNumberOfRows();
			for(int i=1;i<rows;i++) {
				Prod2 prod = new Prod2();
				prod.setProdNo((int) sheet.getRow(i).getCell(0).getNumericCellValue());
				prod.setName(sheet.getRow(i).getCell(1).getStringCellValue());
				prod.setPrice((int)sheet.getRow(i).getCell(2).getNumericCellValue());
				prodList.add(prod);
				
			}
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return prodList;
		
	}
	
	private void writeCartExcel() {
		File carFile = new File("excel/cart2.xlsx");
		
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		
		Row head = sheet.createRow(0);
		head.createCell(0).setCellValue("카트번호");
		head.createCell(1).setCellValue("상품번호");
		head.createCell(2).setCellValue("수량");
		
		for(int i=0;i<cartList.size();i++) {
			Cart2 cart = cartList.get(i);
			sheet.createRow(i+1);
			sheet.getRow(i+1).createCell(0).setCellValue(cart.getCartNo());
			sheet.getRow(i+1).createCell(1).setCellValue(cart.getProdNo());
			sheet.getRow(i+1).createCell(2).setCellValue(cart.getCnt());
		}
		
		try(FileOutputStream fos = new FileOutputStream(carFile)) {
			workbook.write(fos);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void writeProdExcel() {
		File prodFile = new File("excel/prod2.xlsx");
		
		
		
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		
		Row head = sheet.createRow(0);
		head.createCell(0).setCellValue("상품번호");
		head.createCell(1).setCellValue("상품명");
		head.createCell(2).setCellValue("가격");
		
		for(int i =0; i<prodList.size();i++) {
			Prod2 prod = prodList.get(i);
			sheet.createRow(i+1);
			sheet.getRow(i+1).createCell(0).setCellValue(prod.getProdNo());
			sheet.getRow(i+1).createCell(1).setCellValue(prod.getName());			
			sheet.getRow(i+1).createCell(2).setCellValue(prod.getPrice());
		}
		try(FileOutputStream fos= new FileOutputStream(prodFile)) {
			workbook.write(fos);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void process() {
		
		int sel =0;
		while(true) {
			if(sel==0) {
				System.out.println("1. 상품");
				System.out.println("2. 구매");
				System.out.println("3. 종료");
				sel = ScanUtil.select();
			}
			
			if(sel==1) {
				System.out.println("1. 상품 리스트 출력");
				System.out.println("2. 상품 등록");
				System.out.println("3. 상품 삭제");
				System.out.println("4. 상품 수정");
				System.out.println("5. 홈");
				
				int sel2 = ScanUtil.select();
				if(sel2 == 1) printProdList();
				if(sel2 == 2) prodInsert();
				if(sel2 == 3) prodDelete();
				if(sel2 == 4) prodUpdate();
				if(sel2 == 5) sel=0;
			}
			
			if(sel==2) {
				System.out.println("1. 상품구매");
				System.out.println("2. 구매 내역 출력");
				System.out.println("3. 총 판매 금액");
				System.out.println("4. 홈");
				
				int sel2 = ScanUtil.select();
				if(sel2 == 1) cartBuy();
				if(sel2 == 2) printCartList();
				if(sel2 == 3) printTotalPrice();
				if(sel2 == 4) sel=0;
			}
			if(sel==3) {
				System.out.println("종료");
				break;
			}
		}
	}
	
	
	public void printTotalPrice() {
		int total =0;
		for(Prod2 prod : prodList) {
			
			int prodTotal =0;
			
			for(Cart2 cart : cartList) {
				if(cart.getProdNo()==prod.getProdNo()) {
					prodTotal+=prod.getPrice()*cart.getCnt();
				}
			}
			System.out.println(prod.getName() + " : "+ prodTotal);
			total+=prodTotal;
		}
		System.out.println("총합 : "+total);
	}
	
	
	public void printCartList() {
		System.out.println("카트번호\t상품번호\t수량");
		for(Cart2 cart : cartList) {
			String prodName ="";
			for(Prod2 prod : prodList) {
				if(prod.getProdNo()==cart.getProdNo()) {
					prodName = prod.getName();
					break;
				}
			}
			System.out.println(cart.getCartNo()+"\t"+cart.getProdNo()+"\t"+cart.getCnt());
		}
	}
	
	
	public void cartBuy() {
		printProdList();
		int prodNo = ScanUtil.nextInt("구매할 상품 번호 : ");
		int cnt = ScanUtil.nextInt("수량 : ");
		
		Cart2 cart = new Cart2();
		
		int cartNo = 1;
		if(cartList.size() != 0) {
			cartNo = cartList.get(cartList.size()-1).getCartNo()+1;
		}
		cart.setCartNo(cartNo);
		cart.setProdNo(prodNo);
		cart.setCnt(cnt);
		
		cartList.add(cart);
		
		writeCartExcel();
	}
	
	public void prodUpdate() {
		printProdList();
		
		int prodNo = ScanUtil.nextInt("수정할 상품번호 : ");
		
		Prod2 prod = null;
		for(Prod2 p : prodList) {
			if(p.getProdNo()==prodNo) {
				prod=p;
				break;
			}
		}
		if(prod==null) {
			System.out.println("해당 상품번호가 없습니다");
			return;
		}
		
		String name =ScanUtil.nextLine("상품이름 : ");
		int price = ScanUtil.nextInt("가격 : ");
		prod.setName(name);
		prod.setPrice(price);
		
		writeProdExcel();
		
		
	}
	
	public void prodDelete() {
		printProdList();
		
		int prodNo = ScanUtil.nextInt("삭제할 상품번호 : ");
		Prod2 prod = null;
		for(Prod2 p : prodList) {
			if(p.getProdNo()==prodNo) {
				prod = p;
				break;
			}
		}
		
		if(prod==null) {
			System.out.println("상품번호가 존재하지 않습니다");
			return;
		}
		
		prodList.removeIf(p -> p.getProdNo() == prodNo);

		
		writeProdExcel();
	}
	
	public void prodInsert() {
		printProdList();
		Prod2 prod = new Prod2();
		int prodNo = 1;
		if(prodList.size() !=0) {
			prodNo = prodList.get(prodList.size()-1).getProdNo()+1;
		}
		prod.setProdNo(prodNo);
		prod.setName(ScanUtil.nextLine("상품명 : "));
		prod.setPrice(ScanUtil.nextInt("가격 : "));
		prodList.add(prod);
		
		writeProdExcel();
	}
	
	public void printProdList() {
//		if (prodList == null || prodList.isEmpty()) {
//	        System.out.println("상품이 존재하지 않습니다.");
//	        return;
//	    }
		
		System.out.println("상품번호\t상품명\t가격");
		for(Prod2 prod : prodList) {
			System.out.println(prod.getProdNo()+"\t"+prod.getName()+"\t"+prod.getPrice());
		}
		
	}
}

class Cart2{
	private int cartNo;
	private int prodNo;
	private int cnt;
	public int getCartNo() {
		return cartNo;
	}
	public int getProdNo() {
		return prodNo;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}

class Prod2{
	private int prodNo;
	private String name;
	private int price;
	public int getProdNo() {
		return prodNo;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}