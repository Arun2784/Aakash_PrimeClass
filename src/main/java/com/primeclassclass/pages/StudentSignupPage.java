package com.primeclassclass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.primeclass.qa.base.TestBase;

/**
 * @author Arun Kumar Pandey Date 07 May 2020
 */

public class StudentSignupPage extends TestBase {

	@FindBy(xpath = "//nav[@id='block-useraccountmenu-4']")

	WebElement UserIcon;

	@FindBy(xpath = "//nav[@id='block-useraccountmenu-4']")

	WebElement logInbtn;

	@FindBy(xpath = "//div[@class='my-account-wrapper log-in-link']//a[contains(text(),'Sign Up')]")

	WebElement signUpbtn;

	@FindBy(xpath = "//label[contains(text(),'Sign Up as Student')]")

	WebElement signUpStudentRadio;

	@FindBy(xpath = "//input[@id='edit-field-signup-type-parent']")

	WebElement signUpParentRadio;

	@FindBy(xpath = "//input[@id='edit-field-user-fname-0-value']")

	WebElement stufirsname;

	@FindBy(xpath = "//input[@id='edit-field-user-mobile-0-value']")

	WebElement stumobilenum;
	
	@FindBy(xpath = "//span[@class='otp-link']")

	WebElement verifymobil;
	
	@FindBy(xpath = "//input[@id='edit-field-user-otp-0-value']")

	WebElement enterotp;

	@FindBy(xpath = "//input[@id='edit-mail']")

	WebElement stuemail;

	@FindBy(xpath = "//input[@id='edit-pass-pass1']")

	WebElement stupassword;

	@FindBy(xpath = "//input[@id='edit-pass-pass2']")

	WebElement stuconfirmPass;

	@FindBy(xpath = "//input[@id='edit-submit']")

	WebElement stusubmit;

	public StudentSignupPage() {

		PageFactory.initElements(driver, this);

	}

	public void cickuserIcon() {

		UserIcon.click();

		signUpbtn.click();

	}

	public void createstudent(String firstName, String mobile, String stuotp, String emailAdd, String password,
			String confirmPass) throws InterruptedException {
		Thread.sleep(5000);
		stufirsname.clear();
		stufirsname.sendKeys(firstName);
		stumobilenum.clear();
		stumobilenum.sendKeys(mobile);

		stuemail.clear();
		stuemail.sendKeys(emailAdd);
		stupassword.clear();
		stupassword.sendKeys(password);
		stuconfirmPass.clear();
		stuconfirmPass.sendKeys(confirmPass);
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(verifymobil));
		wait.until(ExpectedConditions.elementToBeClickable(verifymobil));
		verifymobil.click();
		System.out.println("successfully clicked on Verify Button");
		enterotp.clear();
		Thread.sleep(5000);
		enterotp.sendKeys(stuotp);
		Thread.sleep(5000);
		
		((JavascriptExecutor) driver).executeScript("scroll(0,100)");
		
		//((JavascriptExecutor) driver).executeScript("scroll(0,100)");
		
		stusubmit.click();
		
		
		
	}
	
}
