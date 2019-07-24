package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
	
	public static ArrayList<String> readRow(int rowNumber) throws Exception{
		
		File file = new File("C:\\Users\\FATEEMA\\eclipse-workspace\\CucumberBasic\\src\\test\\resources\\testData\\loginData.xls");
		FileInputStream stream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(stream);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(rowNumber);
		
		int maxCell = row.getLastCellNum();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < maxCell; i++) {
			HSSFCell cell = row.getCell(i);
			list.add(cell.getStringCellValue());
		}
		
		System.out.println(list);
		return list;
				
	}
	
	

}
