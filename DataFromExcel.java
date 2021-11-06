package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcel {

	public String[][] readExcel() throws IOException {
		// TODO Auto-generated method stub
		//Create object for Excel Workbook with the file path
		XSSFWorkbook wb = new XSSFWorkbook("D:\\Param\\Selenium Installation Artifacts\\CreateLead_Data.xlsx");
		//Create object to get in to worksheet
		XSSFSheet ws = wb.getSheet("CreateLead");
		//Get the row count
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		//Get the cell count
		int cellCount = ws.getRow(0).getLastCellNum();
		String readData[][] = new String[rowCount][cellCount];
		//Iterate through for loop to print all the data from the worksheet
		System.out.println("The data from the Create Lead Worksheet as follows:");
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				String data = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				readData[i-1][j]=data;
				
				
			}
			
		}
		
		
		
		wb.close();
		return readData;
		
	}
	
	public String[][] readCreateContacts() throws IOException{
		XSSFWorkbook wb = new XSSFWorkbook("D:\\Param\\Selenium Installation Artifacts\\CreateLead_Data.xlsx");
		XSSFSheet ws = wb.getSheet("CreateContacts");
		int rowCount = ws.getLastRowNum();
		int colCount = ws.getRow(0).getLastCellNum();
		String createContacts[][] = new String[rowCount][colCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String data = ws.getRow(i).getCell(j).getStringCellValue();
				createContacts[i-1][j] = data;
				
			}
			
		}
		wb.close();
		return createContacts;
	}

}
