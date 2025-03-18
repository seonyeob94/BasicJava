package kr.or.ddit.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil2 {
	public static void main(String[] args) throws IOException {


		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet();
		
		Row row = sheet.createRow(0);
		
		int cellNum = 0;
		Cell c1 = row.createCell(cellNum++);
		Cell c2 = row.createCell(cellNum++);
		Cell c3 = row.createCell(cellNum++);
		
		c1.setCellValue("자바");
		c2.setCellValue("엑셀");
		c3.setCellValue("포이");
		
		FileOutputStream fos = new FileOutputStream("excel/poi.xlsx");
		workbook.write(fos);
		
	}
}
