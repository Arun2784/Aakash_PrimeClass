package com.primeclass.qa.util;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerFailedScrenshot extends FailedScreenShot implements ITestListener {

	public void onTestFailure(ITestResult result) {

		System.out.println("FailedTest");
		getFailedScreenshot(result.getMethod().getMethodName());
	}

}
