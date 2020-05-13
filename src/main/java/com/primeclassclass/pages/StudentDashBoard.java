package com.primeclassclass.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.primeclass.qa.base.TestBase;

public class StudentDashBoard extends TestBase {

	@FindBy(xpath = "//a[@class='class-crs']")

	WebElement courselink;

	public StudentDashBoard() {

		PageFactory.initElements(driver, this);

	}

	public CoursesPage clickOnCourseLink() throws InterruptedException {

		Thread.sleep(4000);

		courselink.click();

		return new CoursesPage();
	}

}
