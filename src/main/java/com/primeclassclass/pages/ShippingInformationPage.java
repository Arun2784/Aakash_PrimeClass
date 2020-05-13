package com.primeclassclass.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.primeclass.qa.base.TestBase;

public class ShippingInformationPage extends TestBase {

	@FindBy(xpath = "//label[contains(text(),'Paytm')]")

	WebElement paymentMethod;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-field-product-student-fname-0-value']")

	WebElement firstName;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-field-product-student-lname-0-value']")

	WebElement lasttName;

	@FindBy(xpath = "//label[contains(text(),'Male')]")

	WebElement gender;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-field-admission1-student-dob-0-value-date']")

	WebElement dateofBirth;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")

	WebElement selectMonth;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")

	WebElement selectYear;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']")

	WebElement datepicker;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-field-admission1-parent-fname-0-value']")

	WebElement parentName;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-field-admission1-parent-mobile-0-value']")

	WebElement parentMobile;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-field-admission1-parent-email-0-value']")

	WebElement parentemail;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-address-0-address-postal-code']")

	WebElement pincode;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-address-0-address-address-line1']")

	WebElement streetAddress;

	@FindBy(xpath = "//input[@id='edit-payment-information-billing-information-address-0-address-locality']")

	WebElement city;

	@FindBy(xpath = "//select[@id='edit-payment-information-billing-information-address-0-address-administrative-area']")

	WebElement Ship_state;

	@FindBy(xpath = "//input[@id='edit-actions-next']")

	WebElement continueBtn;

	@FindBy(xpath = "//input[@id='edit-actions-next']")

	WebElement payNow;

	public ShippingInformationPage() {

		PageFactory.initElements(driver, this);

	}

	public void fill_shipping_information(String stu_name, String stu_last, String Parent_name, String Parent_Mobile,
			String Parent_email, String street_address, String city, String pincode, String state)
			throws InterruptedException {

		/*
		 * Author- Arun Kumar Pandey Code understand from Naveen date-19 April status-
		 * Now working
		 * 
		 */
		Thread.sleep(2000);
		// ((JavascriptExecutor) driver).executeScript("scroll(0,200)");
		// paymentMethod.click();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", gender);

		((JavascriptExecutor) driver).executeScript("scroll(0,100)");
		// gender.click();
		firstName.clear();
		firstName.sendKeys(stu_name);
		Thread.sleep(4000);
		lasttName.clear();
		lasttName.sendKeys(stu_last);
		Thread.sleep(4000);

		Thread.sleep(2000);
		dateofBirth.click();
		
		selectMonth.click();
		System.out.println("Successfully click on Month drop down");

		Select select_month = new Select(selectMonth);

		select_month.selectByVisibleText(prop.getProperty("dob_month"));

		System.out.println("Month Value is" + selectMonth.getText());

		System.out.println("Successfully Month Value selected");

		selectYear.click();
		Select select_year = new Select(selectYear);
		Thread.sleep(5000);
		select_year.selectByVisibleText(prop.getProperty("dob_year"));
		System.out.println("Successfully year Value selected");
		System.out.println(selectYear.getText());

		/*
		 * /* Author- Arun Kumar Pandey Code sourse -SDET Youtube date-19 April status-
		 * code Properly working
		 * 
		 */

		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("/html[1]/body[1]/div[7]/table[1]/tbody[1]/tr/td"));

		for (WebElement e : list) {

			String date = e.getText();

			if (date.equalsIgnoreCase(prop.getProperty("dob_date"))) {

				e.click();
				
				System.out.println("Successfully date selected");
				break;
			}
		}

		parentName.sendKeys(Parent_name);
		System.out.println("Successfully PName Fill");
		parentMobile.sendKeys(Parent_Mobile);
		parentemail.clear();
		parentemail.sendKeys(Parent_email);
		System.out.println("Successfully pmail Fill");
		streetAddress.sendKeys(street_address);
		this.city.sendKeys(city);
		this.pincode.sendKeys(pincode);
		System.out.println("Successfully pincode Fill");
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, 4000);
		wait.until(ExpectedConditions.visibilityOf(Ship_state));
		wait.until(ExpectedConditions.elementToBeClickable(Ship_state));
		Select selectstate = new Select(Ship_state);
		System.out.println("Successfully state reach new stage");
		selectstate.selectByVisibleText(state);

		System.out.println("Successfully Form Fill");

		((JavascriptExecutor) driver).executeScript("scroll(0,-500)");
		((JavascriptExecutor) driver).executeScript("scroll(0,100)");

		continueBtn.click();
		payNow.click();

	}

}
