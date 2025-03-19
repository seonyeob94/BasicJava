package kr.or.ddit.excel;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lombok.Data;
import util.ScanUtil;

public class ProdMain {
	public static void main(String[] args) {
		ProdMain obj = new ProdMain();
		obj.init();
		obj.process();
	}
	List<Prod> prodList;
	List<Cart> cartList;
	
	public void init() {
		//엑셀 읽어서 list불러오기
		//엑셀 파일이 없다면 new ArrayList();
		//엑셀 파일명 excel/prod.xlsx
		//엑셀 파일명 excel/cart.xlsx

		 File prodFile = new File("excel/prod.xlsx");
		 
		 if(prodFile.exists()) prodList= readProdExcel(prodFile);
		else addExcel();
	}
	
	public void addExcel(){
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		
		Row row = sheet.createRow(0);
		int cellNum =0;
		Cell c1 = row.createCell(0);
		Cell c2 = row.createCell(1);
		Cell c3 = row.createCell(2);

		c1.setCellValue("상품번호");
		c2.setCellValue("이름");
		c3.setCellValue("나이");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("excel/prod.xlsx");
			workbook.write(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void process() {
		init();
		int sel=0;
		while(true) {
			if(sel==0) {
				System.out.println("1. 상품");
				System.out.println("2. 구매");
				System.out.println("3. 종료");
				
				sel = ScanUtil.select();
				
			}
			
			if(sel==1) {
				System.out.println("1.상품 리스트 출력");
				System.out.println("2.상품 등록");
				System.out.println("3.상품 삭제");
				System.out.println("4.상품 정보 수정");
				System.out.println("5.홈");
				System.out.println("6.자동저장 변경 현재상태("+autoSave+")");
				
				
				int sel2 = ScanUtil.select();
				if(sel2==1) printList(prodList);
				if(sel2==2) prodAdd(prodList);
				if(sel2==3) prodDelete(prodList);
				if(sel2==4) prodUpdate(prodList);
				if (sel2 == 5) {
					saveExcel(prodList);
					sel=0;
				}
				if(sel2==6) autoSave = !autoSave;
				
			}
			if(sel==2) {
				System.out.println("1. 상품 구매");
				System.out.println("2. 구매 내역 출력");
				System.out.println("3. 총판매 금액");
				System.out.println("4. 홈");
				System.out.println("5.자동저장 변경 현재상태("+autoSave+")");
				
				
				int sel2 = ScanUtil.select();
				if (sel2 == 4) {
					saveExcel(prodList);
					sel=0;
				}
				if(sel2==5) autoSave = !autoSave;
			}
		}
	}
	boolean autoSave = true;
	
	public void prodUpdate(List<Prod> prodList) {
		printList(prodList);
		
		int sel = ScanUtil.nextInt("수정할 상품번호 : ");
		Prod prod = null;
		for(Prod p : prodList) {
			if(p.getProdNo()==sel) prod=p;
		}
		if(prod==null) System.out.println("해당 상품번호는 없습니다");
		else {
			String name =ScanUtil.nextLine("상품이름 : ");
			int price = ScanUtil.nextInt("가격 : ");
			prod.setName(name);
			prod.setPrice(price);
		}
		if(autoSave) saveExcel(prodList);
		printList(prodList);
	}
	
	public void prodDelete(List<Prod> prodList) {
		printList(prodList);
		
		int sel = ScanUtil.nextInt("삭제할 상품번호 : ");
		
		for(int i=0; i<prodList.size();i++) {
			if(prodList.get(i).getProdNo()==sel) prodList.remove(i);
		}
		

		if(autoSave) saveExcel(prodList);
		printList(prodList);
	}
	
	public void saveExcel(List<Prod> prodList) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("excel/prod.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet();
		
		Row index = sheet.createRow(0);
		
		Cell c1 = index.createCell(0);
		Cell c2 = index.createCell(1);
		Cell c3 = index.createCell(2);
		
		c1.setCellValue("상품번호");
		c2.setCellValue("상품명");
		c3.setCellValue("가격");
		
		for(int i=1; i<prodList.size()+1;i++) {
			Prod prod = prodList.get(i-1);
			Row row = sheet.createRow(i);
			

			Cell rc1 = row.createCell(0);
			Cell rc2 = row.createCell(1);
			Cell rc3 = row.createCell(2);
			
			rc1.setCellValue(prod.getProdNo());
			rc2.setCellValue(prod.getName());
			rc3.setCellValue(prod.getPrice());
		}
		
		try {
			workbook.write(fos);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void prodAdd(List<Prod> prodList) {
		int prodNo = 0;
		for(Prod prod : prodList) {
			if(prodNo<prod.getProdNo()) prodNo=prod.getProdNo();
		}
		prodNo++;
		String name = ScanUtil.nextLine("상품명 : ");
		int price =ScanUtil.nextInt("가격 : ");
		
		Prod prod = new Prod();
		prod.setProdNo(prodNo);
		prod.setName(name);
		prod.setPrice(price);
		prodList.add(prod);
		
		if(autoSave) saveExcel(prodList);
	}
	
	public void printList(List<Prod> prodList) {
		if (prodList == null || prodList.isEmpty()) {
	        System.out.println("No products available.");
	        return;
	    }
		
		System.out.println("상품번호\t이름\t나이");
		for(Prod prod : prodList) {
			System.out.println(prod.getProdNo()+"\t"+prod.getName()+"\t"+prod.getPrice());
		}
	}
	
	public List<Prod> readProdExcel(File prodFile){
	prodList = new ArrayList();
		 FileInputStream fis =null;
		
		 try {
			fis = new FileInputStream("excel/prod.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Workbook workbook;
		 
		 try {
			workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);
			for(int i =1; i<=sheet.getLastRowNum();i++) {
				Row row = sheet.getRow(i);
				int prodNo = (int)row.getCell(0).getNumericCellValue();
				String name = row.getCell(1).getStringCellValue();
				int price = (int)row.getCell(2).getNumericCellValue();
				
				Prod prod = new Prod();
				prod.setProdNo(prodNo);
				prod.setName(name);
				prod.setPrice(price);
				
				prodList.add(prod);
			}
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return prodList;
	}
	
}

class Cart{
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

class Prod{
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