package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLibrary {
	/**
	 * this method is a generic method which is used to read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readdatafromproperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * this method is a generic method which is used to read data from Excel file
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String readdataexcel(String sheetname,int row,int cell) throws IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/Testdata.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
   
    String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
    return data;
	}
}
