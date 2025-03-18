package kr.or.ddit.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static void main(String[] args) throws IOException {

		File file = new File("excel/data.xls");

		Workbook workbook = null;

		if (file.getName().endsWith("xls")) {
			// 97~2003버전(.xls)
			FileInputStream fis = new FileInputStream(file);
			workbook = new HSSFWorkbook(fis);
		}

		// 2007버전(.xlsx)
		else if (file.getName().endsWith("xlsx")) {
			workbook = new XSSFWorkbook();
		} else {
			System.out.println("잘못된 확장자");
			return;
		}
		
		Sheet sheet = workbook.getSheetAt(0);
		
//		Row row = sheet.getRow(0); //행 0부터 시작
//		Cell cell = row.getCell(1); //열 0부터 시작
//		Cell cell2 = row.getCell(1); //열 0부터 시작
//		
//		String str = cell.getStringCellValue();
//		String str2 = cell2.getStringCellValue();
//		System.out.println(str+"\t"+str2);
		
		int firstNum = sheet.getFirstRowNum();
		int lastNum = sheet.getLastRowNum();
		
		for(int i=firstNum; i<=lastNum;i++) {
			Row row = sheet.getRow(i);
			
			for(int j =0; j<row.getLastCellNum();j++) {
				Cell cell = row.getCell(j);
//				String val = cell.getStringCellValue();
				String val = getCellValue(cell);
				System.out.print(val+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static String getCellValue(Cell cell) {
		CellType type = cell.getCellType();
		
		if(type == CellType.STRING) {
			return cell.getStringCellValue();
		}
		if(type == CellType.NUMERIC) {
			// 날짜, 숫자
			// 정수체크
			double d = cell.getNumericCellValue();
			
			if(d==Math.floor(d)) {
				return (int) d+"";
			}
//			if(DateUtil.isCellDateFormatted(cell)) {
//				return cell.getDateCellValue().toString();
//			}else {
//				return cell.getNumericCellValue() +"";
//			}
			
			return cell.getNumericCellValue()+"";
			
		}
		if(type == CellType.FORMULA) {
			return cell.getCellFormula();
		}
		return "";
	}
}
