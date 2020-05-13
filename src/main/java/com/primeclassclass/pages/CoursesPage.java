package com.primeclassclass.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.primeclass.qa.base.TestBase;

public class CoursesPage extends TestBase {

	@FindBy(xpath = "//label[contains(text(),'Medical')]")
	WebElement selectMedical;

	@FindBy(xpath = "//label[contains(text(),'Engineering')]")

	WebElement selectEngineering;

	@FindBy(xpath = "//label[contains(text(),'Foundation')]")

	WebElement selectFoundation;

	@FindBy(xpath = "//select[@class='form-select' and @name='field_product_classes']")

	WebElement AakashClasses;

	@FindBy(xpath = "//select[@class='form-select' and @name='field_notification_select_stream']")

	WebElement AakashState;

	@FindBy(xpath = "//select[@class='form-select' and @name='center_list_dropdown']")

	WebElement AakashCenter;

	@FindBy(xpath = "//input[@id='edit-submit-digital-product-search']")

	WebElement clickOnApply;

	@FindBy(xpath = " //div[@class='result-listing-wrapper']//div[1]//div[1]//div[1]//h3[1]//a[1]")

	WebElement selectSeacrhedCourses;
	
	@FindBy(xpath="//input[@id='edit-buysubmit']")

	WebElement payregistrationFee;
	
	public CoursesPage() {

		PageFactory.initElements(driver, this);

	}

	public void clickonEngineering() {

		selectEngineering.click();

	}

	public void selectMedicalcourses(String chooseClass, String chooseState) throws InterruptedException {

		Thread.sleep(3000);

		Select classes1 = new Select(AakashClasses);

		classes1.selectByVisibleText(chooseClass);

		Select state1 = new Select(AakashState);

		state1.selectByVisibleText(chooseState);

		Thread.sleep(5000);

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", clickOnApply);
//		Thread.sleep(5000);

//		Select centers1 = new Select(AakashCenter);
//
//		centers1.selectByVisibleText(selectCenters);

		System.out.println("**********Before Click on Apply");

		clickOnApply.click();

		System.out.println("**********After Click on Apply");

		// return new SearchedCoursePage();
	}

	public CheckOutPage clickOnSearchedCourses() throws InterruptedException {

		Thread.sleep(5000);

		System.out.println("clicking on Searched courses");

		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOf(payregistrationFee));
		wait.until(ExpectedConditions.elementToBeClickable(payregistrationFee));
		payregistrationFee.click();
		System.out.println("successfully clicked on Registration");

		return new CheckOutPage();

	}

}