import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class methods {
	File outFile = new File("C:\\Users\\Don\\Desktop\\Granny Graces Inventory\\StarterInventoryTest.xlsx");
	FileInputStream inputStream = new FileInputStream(outFile);
	XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	XSSFSheet sheet = workbook.getSheet(sheetName); // replace with sheetName when done with testing
	
	
}
