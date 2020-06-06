package com.primeclass.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.dom4j.io.OutputFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.primeclass.qa.base.TestBase;

public class FailedScreenShot extends TestBase {

	public static void getFailedScreenshot(String testMethodName) {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile, new File("D:\\Core Java\\PrimeClassAakash\\failedscreenshots/"+testMethodName +"_"+".jpg"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
