package excelTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.util.Scanner; // for use later

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class TestExcelUseCase {

	public static void main(String[] args) throws Exception {

		File testFile = new File("C:\\Users\\Don\\Documents\\EclipseTest\\test.xlsx");
		FileInputStream inputStream = new FileInputStream(testFile);
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet("RecTrans");
		XSSFSheet sheet2 = workbook.getSheet("test Sheet");		

		Cell cell  = sheet.createRow(0).createCell(3);
		Cell cell2 = sheet.getRow(2).getCell(3);
		
		cell.setCellValue("What's up?");
		
		FileOutputStream output = new FileOutputStream(testFile);
		String inCellValue ;
		inCellValue = cell2.toString();
		System.out.println(inCellValue);
			
		workbook.write(output);
		workbook.close();
		output.close();
	
	

	}
}
