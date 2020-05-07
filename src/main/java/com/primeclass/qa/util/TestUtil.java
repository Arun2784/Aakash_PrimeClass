package com.primeclass.qa.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.primeclass.qa.base.TestBase;

public class TestUtil extends TestBase {

	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long Implicit_wait = 10;
	static Workbook book;
	static Sheet sheet;;
	public static String TESTDATA_SHEET_PATH = "D:\\Core Java\\PrimeClassAakash\\src\\main\\java\\com\\primeclass\\qa\\testdata\\PrimeclassData.xlsx";

	
	public static Object[][] signupTestData(String sheetName1) throws InvalidFormatException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Till here OK");
		sheet = book.getSheet(sheetName1);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		
		//System.out.println("Till here also OK");
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				 System.out.println(data[i][k]);
				
				//System.out.println("Till here also also OK");
			}
		}
		return data;
	}
}