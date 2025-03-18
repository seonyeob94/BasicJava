package kr.or.ddit.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
	
	
	public void insert() {
		
		Workbook workbook = new XSSFWorkbook();
		
		
		Sheet sheet= workbook.createSheet();
		Row row =sheet.createRow(0);
		
		int cellNum =0;
		Cell c1 = row.createCell(cellNum++);
		Cell c2 = row.createCell(cellNum++);
		Cell c3 = row.createCell(cellNum++);
		
		c1.setCellValue("");
		c2.setCellValue("");
		c3.setCellValue("");
	}

	public void printList() throws IOException {
		File file = new File("excel/data.xls");

		Workbook workbook = null;

		if (file.getName().endsWith("xls")) {
			FileInputStream fis = new FileInputStream(file);
			workbook = new HSSFWorkbook(fis);
		} else if (file.getName().endsWith("xlsx")) {
			workbook = new XSSFWorkbook();
		} else {
			System.out.println("잘못된 확장자");
			return;
		}

		Sheet sheet = workbook.getSheetAt(0);

		int firstNum = sheet.getFirstRowNum();
		int lastNum = sheet.getLastRowNum();

		for (int i = firstNum; i <= lastNum; i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				String val = getCellValue(cell);
				System.out.print(val + "\t");

			}
			System.out.println();
		}

	}

	public static String getCellValue(Cell cell) {
		CellType type = cell.getCellType();

		if (type == CellType.STRING) {
			return cell.getStringCellValue();
		}
		if (type == CellType.NUMERIC) {
			double d = cell.getNumericCellValue();

			if (d == Math.floor(d)) {
				return (int) d + "";
			}
			return cell.getNumericCellValue() + "";
		}
		if (type == CellType.FORMULA) {
			return cell.getCellFormula();
		}

		return "";

	}

	public void process() throws IOException {
		List<MemberVo> list;
		// list에 엑셀에서 값 읽어오기
		while (true) {
			System.out.println("1.회원 리스트 출력");
			System.out.println("2.회원 가입");
			System.out.println("3.회원 삭제");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 프로그램 종료");

			int sel = ScanUtil.nextInt("선택 : ");
			if (sel == 1) printList();
			if (sel == 2) insert();

		}

	}

}

class MemberVo {
	int memNo;
	String name;
	int age;
}