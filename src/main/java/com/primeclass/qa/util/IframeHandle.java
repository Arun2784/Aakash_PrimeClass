package com.primeclass.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.primeclass.qa.base.TestBase;

public class IframeHandle extends TestBase {

	public void totalCountOfFrame() {

		List<WebElement> framesList = driver.findElements(By.tagName("iframe"));

		// int totalframe = framesList.size();

		System.out.println("Number of frames in a page :" + framesList.size());

	}

	public void switchFrame() {

		WebElement frame = driver.findElement(By.xpath("//body[@class='classroom-front-page role--anonymous no-sidebar']/iframe[1]"));
		//iframe[@id='launcher']
		//iframe[@id='webWidget']
		//iframe[@id='webWidget']
		//body[@class='classroom-front-page role--anonymous no-sidebar']/iframe[1]
		

		driver.switchTo().frame(frame);

	}

	public void defaultframe() {

		driver.switchTo().defaultContent();

	}

}
