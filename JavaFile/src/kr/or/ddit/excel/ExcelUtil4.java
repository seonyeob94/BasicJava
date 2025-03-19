package kr.or.ddit.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import util.ScanUtil;

public class ExcelUtil4 {
	public static void main(String[] args) throws IOException {
		ExcelUtil4 obj = new ExcelUtil4();
		obj.process();
	}
	
	


	public void process() throws IOException {
		List<MemberVo> list= readExcel();
		// list에 엑셀에서 값 읽어오기
		while (true) {
			System.out.println("1.회원 리스트 출력");
			System.out.println("2.회원 가입");
			System.out.println("3.회원 삭제");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 프로그램 종료");
			System.out.println("6.자동저장 변경 현재상태("+autoSave+")");

			int sel = ScanUtil.select();
			if (sel == 1) printList(list);
			if (sel == 2) memberJoin(list);
			if (sel == 3) memberDelete(list);
			if (sel == 4) memberUpdate(list);
			if (sel == 5) {
				saveExcel(list);
				break;
			}
			if(sel==6) autoSave = !autoSave;
		}

	}
	
	boolean autoSave = true;
	
	public void memberDelete(List<MemberVo> list) {
		printList(list);
		
		int sel = ScanUtil.nextInt("삭제할 회원 번호 : ");
		
		
//		for(MemberVo m : list) {
//			if(m.memNo==sel) list.remove(m);
//		}
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).memNo==sel) list.remove(i);
		}
		
		if(autoSave) saveExcel(list);
		printList(list);
	}
	
	public void memberUpdate(List<MemberVo> list) {
		printList(list);
		
		int sel = ScanUtil.nextInt("수정할 회원 번호 : ");
		
		MemberVo member = null;
		
		for(MemberVo m : list) {
			if(m.memNo==sel) member= m;
		}
		if(member==null) System.out.println("해당 회원번호는 없습니다");
		else {
			member.name = ScanUtil.nextLine("회원 이름 : ");
			member.age = ScanUtil.nextInt("나이 : ");
		}
		if(autoSave) saveExcel(list);
		printList(list);
	}
	
	public void saveExcel(List<MemberVo> memList) {
		
		FileOutputStream fos = null;
		try {
			fos =new FileOutputStream("excel/data.xls");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = new HSSFWorkbook();
		
		Sheet sheet = workbook.createSheet();
		
		Row index = sheet.createRow(0);
		
		Cell c1 = index.createCell(0);
		Cell c2 = index.createCell(1);
		Cell c3 = index.createCell(2);
		
		c1.setCellValue("회원번호");
		c2.setCellValue("이름");
		c3.setCellValue("나이");
		
		for(int i=1; i<memList.size()+1;i++) {
			MemberVo member = memList.get(i-1);
			Row row = sheet.createRow(i);
			
			Cell rc1 = row.createCell(0);
			Cell rc2 = row.createCell(1);
			Cell rc3 = row.createCell(2);
			
			rc1.setCellValue(member.memNo);
			rc2.setCellValue(member.name);
			rc3.setCellValue(member.age);
		}
		
		try {
			workbook.write(fos);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void memberJoin(List<MemberVo> memberList) {
//		int memNo = memberList.get(memberList.size()-1).memNo+1;
		int memNo = 0;
		for(MemberVo member : memberList) {
			if(memNo<member.memNo) memNo = member.memNo;
		}
		memNo++;
		String name = ScanUtil.nextLine("이름 : ");
		int age = ScanUtil.nextInt("나이 : ");
		
		MemberVo member = new MemberVo();
		member.memNo = memNo;
		member.age = age;
		member.name = name;
		
		memberList.add(member);
		
		if(autoSave) saveExcel(memberList);
	}
	
	public void printList(List<MemberVo> memberList) {
		System.out.println("회원번호\t이름\t나이");
		for(MemberVo member : memberList) {
			System.out.println(member.memNo+"\t"+member.name+"\t"+member.age+"\t");
		}
	}
	
	public List<MemberVo> readExcel(){
		List<MemberVo> memberList = new ArrayList();
		FileInputStream fis= null;
		try {
			fis = new FileInputStream("excel/data.xls");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook;
		try {
			workbook = new HSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);
			for(int i =1; i<=sheet.getLastRowNum();i++) {
				Row row = sheet.getRow(i);
				int memNo = (int)row.getCell(0).getNumericCellValue();
				String name = row.getCell(1).getStringCellValue();
				int age = (int) row.getCell(2).getNumericCellValue();
				
				MemberVo member = new MemberVo();
				member.memNo = memNo;
				member.name = name;
				member.age = age;
				
				memberList.add(member);
			}
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return memberList;
		
	}

}

class MemberVo {
	int memNo;
	String name;
	int age;
}