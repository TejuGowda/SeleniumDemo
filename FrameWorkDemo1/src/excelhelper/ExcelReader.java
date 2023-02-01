package excelhelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis =  new FileInputStream("./testdata/TestData.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			int data = workbook.getSheet("Login").getLastRowNum();
			System.out.println(data);
		}
		catch(Exception e) {
			
			//e.printStackTrace();
		}
	}
	
	
	
	public static int getRowCount(String filepath, String sheetName)  {
		
		int rowCount = 0;
		try {
			FileInputStream fis =  new FileInputStream(filepath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			rowCount = workbook.getSheet(sheetName).getLastRowNum();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return rowCount;
		
	}
	
	public static String getCellData(String filepath, String sheetName, int row, int cell) {
		
		String data="";
		
		try {
			FileInputStream fis =  new FileInputStream(filepath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			data = workbook.getSheet(sheetName).getRow(row).getCell(cell).toString();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return data;
	}
}
