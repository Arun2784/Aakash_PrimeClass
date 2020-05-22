package com.primeclass.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.primeclass.qa.base.TestBase;
import com.primeclass.qa.util.DataProviderClass;
import com.primeclass.qa.util.TestUtil;
import com.primeclassclass.pages.CheckOutPage;
import com.primeclassclass.pages.CoursesPage;

import com.primeclassclass.pages.ShippingInformationPage;
import com.primeclassclass.pages.StudentDashBoard;
import com.primeclassclass.pages.StudentSignupPage;

public class ShippinginformationTest extends TestBase {

	StudentSignupPage studentsignuppage;
	TestUtil primeutil;
	StudentDashBoard dashboard;
	CoursesPage coursepage;
	CheckOutPage checkoutPage;
	ShippingInformationPage shippinginformation;

	public ShippinginformationTest() {

		super();

	}

	@BeforeMethod

	public void setup() {

		initialaztion();
		primeutil = new TestUtil();
		studentsignuppage = new StudentSignupPage();
		dashboard = new StudentDashBoard();
		coursepage= new CoursesPage();
		checkoutPage = new CheckOutPage();
		shippinginformation = new ShippingInformationPage();
		

	}
	
	@Test(priority = 1, dataProvider = "getSignUpData", dataProviderClass = DataProviderClass.class)

	public void shippingInformationFill(String firstName, String mobile, String stuotp, String emailAdd,
			String password, String confirmPass,String chooseClass, String chooseState,String choosecenter, String stu_name, String stu_last, String Parent_name,
			String Parent_Mobile, String Parent_email, String street_address, String city, String pincode,
			String state) throws InterruptedException {

		studentsignuppage.cickuserIcon();
		studentsignuppage.createstudent(firstName, mobile, stuotp, emailAdd, password, confirmPass);
		dashboard.clickOnCourseLink();
		coursepage.selectMedicalcourses(chooseClass, chooseState,choosecenter);
		coursepage.clickOnSearchedCourses();
		checkoutPage.ClickOnproceedToCheckOut();
		shippinginformation.fill_shipping_information(stu_name, stu_last, Parent_name, Parent_Mobile, Parent_email, street_address, city, pincode, chooseState);
		
		
		
	}
	
	
//	@AfterMethod
//	
//	public void teardown() {
//		
//		driver.quit();
//		
//	}

}
