package com.primeclass.qa.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import com.primeclass.qa.base.TestBase;

public class DataProviderClass extends TestBase {

	 String sheetname = "signup";
	 TestUtil utill;
	 
	 
	
	@DataProvider(name = "getSignUpData")
	
	public Object[][] getstudentSignupData() throws InvalidFormatException {
	
		Object[][] data =  TestUtil.signupTestData(sheetname);
		
		return data;
	
		
		
		
	}
}
