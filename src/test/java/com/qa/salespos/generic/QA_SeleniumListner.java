package com.qa.salespos.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import com.aventstack.extentreports.ExtentTest;

public class QA_SeleniumListner implements WebDriverListener
{
	ExtentTest extentTest;
	
	public QA_SeleniumListner(ExtentTest extentTest)
	{
		this.extentTest=extentTest;
	}
	
	public void beforeFindElement(WebDriver driver, By locator) 
	{
		String msg=QA_Util.getLocatorDetails(locator);
		extentTest.info("Finding the element by using "+msg);
	}
	
	public void beforeSendKeys(WebElement element, CharSequence... keysToSend) 
	{
		extentTest.info("Entering the input:"+keysToSend[0]);
	}
	
	public void beforeClick(WebElement element) 
	{
		extentTest.info("Clicking on the element");
	} 
}

