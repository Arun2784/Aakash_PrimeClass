package com.primeclassclass.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.primeclass.qa.base.TestBase;



public class CheckOutPage extends TestBase {
	@FindBy(xpath = "//input[@id='edit-checkout']")

	WebElement proceedToCheckOut;

	

	public CheckOutPage() {

		PageFactory.initElements(driver, this);

	}
	
	
	public ShippingInformationPage ClickOnproceedToCheckOut() throws InterruptedException {
		
		Thread.sleep(4000);
		proceedToCheckOut.click();
		
		return new ShippingInformationPage();
		
		
	}
	
}