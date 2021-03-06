package com.primeclass.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.primeclass.qa.base.TestBase;
import com.primeclass.qa.util.IframeHandle;
import com.primeclass.qa.util.ListnerFailedScrenshot;
import com.primeclassclass.pages.LoginPage;

@Listeners(ListnerFailedScrenshot.class)

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	IframeHandle iframe;
	SoftAssert softassert = new SoftAssert();

	public LoginPageTest() {

		super();

	}

	@BeforeMethod

	public void setup() {
		initialaztion();
		loginPage = new LoginPage();

		iframe = new IframeHandle();

		// iframe.totalCountOfFrame();

	}

	@Test(priority = 1)

	public void verifyLoginPageTitleTest() {

		String title = loginPage.getLoginPageTitle();

//		Assert.assertEquals(title, "Aakash Medical NEET/AIIMS UG Coaching-Engg IIT JEE Coaching | AESL",
//				"Title not Matched");

		softassert.assertEquals(title, "Aakash Medical NEET/AIIMS UG Coaching-Engg IIT JEE Coaching | AESL",
				"Title not Matched");

		softassert.assertAll();

	}

	@Test(priority = 2)

	public void VerfiyCenterLinkButton() {

		Assert.assertTrue(loginPage.buttonValidation(), "Center button is not visible");

	}

	@Test(priority = 3)

	public void verifyHomePageHeaderTest() {

		

		String header = loginPage.getHomepageTextValue();

		System.out.println("Home Page header is:  " + header);

		Assert.assertEquals(header, prop.getProperty("Header_value"), "Header value is not matched");
		
	}

	@Test(priority = 4)

	public void contactUsTest() {

		String contactUs = loginPage.contactUsPhonValidation();

		System.out.println("Offical Contact us phon number is--->  " + contactUs);

		Assert.assertEquals(contactUs, prop.getProperty("contactUs"), "Company Official number is not correct");

	}

	/*
	 * 
	 * @Test(priority=3) public void verifyLoggedInAccountNameTest(){ String
	 * accountName = homePage.getLoggedInAccountName();
	 * System.out.println("Logged in account name is: "+ accountName);
	 * Assert.assertEquals(accountName, prop.getProperty("accountname")); }
	 * 
	 * 
	 */

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
