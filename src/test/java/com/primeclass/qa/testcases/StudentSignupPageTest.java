package com.primeclass.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.primeclass.qa.base.TestBase;
import com.primeclass.qa.util.DataProviderClass;

import com.primeclass.qa.util.TestUtil;
import com.primeclassclass.pages.StudentSignupPage;

/**
 * @author Arun Kumar Pandey Date 07 May 2020
 */

public class StudentSignupPageTest extends TestBase {

	StudentSignupPage studentsignuppage;
	TestUtil primeutil;

	public StudentSignupPageTest() {

		super();
	}

	@BeforeMethod

	public void setup() {

		initialaztion();
		primeutil = new TestUtil();
		studentsignuppage = new StudentSignupPage();

	}

	@Test(priority = 1, dataProvider = "getSignUpData", dataProviderClass = DataProviderClass.class)

	public void stu_Signup_Page(String firstName, String mobile, String stuotp, String emailAdd, String password,
			String confirmPass) throws InterruptedException {

		studentsignuppage.cickuserIcon();
		studentsignuppage.createstudent(firstName, mobile, stuotp, emailAdd, password, confirmPass);
		
		
	
	}
//
//	@AfterMethod
//
//	public void tearDown() {
//
//		driver.quit();
//
//	}

}
