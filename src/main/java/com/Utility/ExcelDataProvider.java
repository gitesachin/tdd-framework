package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public  ExcelDataProvider() throws IOException {
		
	
	String filepath="C:\\Users\\SACHIN\\eclipse-workspace\\TDDFramework\\Testdata\\data.xlsx ";
	File src= new File(filepath);
	FileInputStream file= new FileInputStream(src);
          wb = new XSSFWorkbook(file);
	
	}
	public String getStringdata(String sheetname, int row, int cell)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();		
	}
	
	public  String getNumericdata(String sheetname, int row, int cell)
	{
	 String data=String.valueOf((double)wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue());
	 return data;
		
		
	}

}
