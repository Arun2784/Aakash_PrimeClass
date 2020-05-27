package com.primeclassclass.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.primeclass.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[@class='class-center']")

	WebElement centerButton;

	@FindBy(xpath = "//div[@id='block-prime-class-branding']//a//img")

	WebElement PrimeLogo;

	@FindBy(xpath = "//a[contains(text(),'Aakash Distance Learning')]")

	WebElement homePageHeader;
	
	@FindBy(xpath="//a[contains(text(),'+91-7428232929')]")
	
	WebElement contactUsnumber;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public boolean buttonValidation() {

		return centerButton.isEnabled();

	}

	public String getHomepageTextValue() {

		return homePageHeader.getText();

	}
	
	public String contactUsPhonValidation() {
		
		return contactUsnumber.getText();
		
	}

}
