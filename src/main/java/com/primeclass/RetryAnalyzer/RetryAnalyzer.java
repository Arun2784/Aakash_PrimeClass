package com.primeclass.RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.primeclass.qa.base.TestBase;

public class RetryAnalyzer extends TestBase implements IRetryAnalyzer {

	int counter = 0;

	int retryLimit = 3;

	public boolean retry(ITestResult result) {

		if (counter < retryLimit) {

			counter++;

			return true;
		}

		return false; 

	}
}
