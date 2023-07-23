package com.qa.salespos.generic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class QA_WebUtil {
	public static void selectAllCheckBox(List<WebElement> allColumnChekBoxLabel,List<WebElement> allColumnChekBox)
	{
		for(int i=0;i< allColumnChekBox.size();i++)
		{
			WebElement checkBox=allColumnChekBox.get(i);
			String checkBoxName=allColumnChekBoxLabel.get(i).getText();
			if(checkBox.isSelected())
			{
				Reporter.log(checkBoxName+":Checkbox is already Selected",true);
			}
			else
			{
				Reporter.log("Selecting the checkbox:"+checkBoxName,true);
				checkBox.click();
			}
		}
	}
	
	public static void selectAllCheckBox(List<WebElement> allColumnChekBox)
	{
		for(int i=0;i< allColumnChekBox.size();i++)
		{
			WebElement checkBox=allColumnChekBox.get(i);
			if(checkBox.isSelected())
			{
				Reporter.log("Checkbox is already Selected",true);
			}
			else
			{
				Reporter.log("Selecting the checkbox:",true);
				checkBox.click();
			}
		}
	}
	
	public static void deselectAllCheckBox(List<WebElement> allColumnChekBoxLabel,List<WebElement> allColumnChekBox)
	{
		for(int i=0;i< allColumnChekBox.size();i++)
		{
			WebElement checkBox=allColumnChekBox.get(i);
			String checkBoxName=allColumnChekBoxLabel.get(i).getText();
			
			if(checkBox.isSelected())
			{
				Reporter.log("Deselecting the checkbox:"+checkBoxName,true);
				checkBox.click();
				
			}
			else
			{
				Reporter.log(checkBoxName+":Checkbox is already Selected",true);
			}
		}
	}
	
	public static void deselectAllCheckBoxExceptOne(List<WebElement> allColumnChekBoxLabel,List<WebElement> allColumnChekBox,int position)
	{
		for(int i=0;i<allColumnChekBox.size();i++)
		{
			WebElement checkBox=allColumnChekBox.get(i);
			String checkBoxname=allColumnChekBoxLabel.get(i).getText();
			if(checkBox.isSelected())
			{
				
				if(i==position)
				{
					Reporter.log("Skipping the checkbox:"+checkBoxname,true);
					continue;
				}
				Reporter.log("Deselecting the checkbox:"+checkBoxname,true);
				checkBox.click();
				
			}
			else
			{
				Reporter.log("Already deselected:"+checkBoxname,true);
			}
		}
	}
	
	public static SoftAssert verifyCheckboxiSEnabledExceptOne(List<WebElement> allColumnChekBoxLabel,List<WebElement> allColumnChekBox,int except,SoftAssert softAssert)
	{
		for(int i=0;i<allColumnChekBox.size();i++)
		{
			WebElement checkBox=allColumnChekBox.get(i);
			boolean enable=checkBox.isEnabled();
			String checkBoxName=allColumnChekBoxLabel.get(i).getText();
			if(i==except)
			{
				if(enable)
				{
					Reporter.log("Fail:"+checkBoxName+" CheckBox is Enabled",true);
					softAssert.fail("Fail:"+checkBoxName+" CheckBox is Enabled");
				}
				else
				{
					Reporter.log("PASS:"+checkBoxName+" CheckBox is Disabled",true);
				}
			}
			else
			{
				if(enable)
				{
					Reporter.log("PASS:"+checkBoxName+" CheckBox is Enabled",true);
				}
				else
				{
					Reporter.log("FAIL:"+checkBoxName+" CheckBox is Disabled",true);
					softAssert.fail("FAIL:"+checkBoxName+" CheckBox is Disabled");
				}
			}
			
		}
		return softAssert;
	}
	
	public static boolean verifyCheckBoxIsSelected(WebElement checkBox,String name)
	{
		boolean selected = checkBox.isSelected();
		if(selected)
		{
 
			Reporter.log("'"+name+"' CheckBox is selected",true);
		}
		else
		{
			Reporter.log("'"+name+"' CheckBox is NOT selected",true);
		}
		
		return selected;
	}
	
	public static boolean verifyCheckBoxIsSelected(WebElement checkBox)
	{
		boolean selected = checkBox.isSelected();
		if(selected)
		{
 
			Reporter.log(" CheckBox is selected",true);
		}
		else
		{
			Reporter.log(" CheckBox is NOT selected",true);
		}
		
		return selected;
	}
	
	public static boolean searchTableDataByColumn(WebElement table,int coulumnIndex,String expectedValue)
	{
		//home work- should be able to search cell by ignoring case -remove space
		boolean found=false;
		List<WebElement> allCells = table.findElements(By.xpath(".//td["+coulumnIndex+"]"));
		int count=allCells.size();
		for(int i=0;i<count;i++)
		{
			String actualCellValue = allCells.get(i).getText();
			if(actualCellValue.equals(expectedValue))
			{
				found=true;
				break;
			}
		}
		
		if(found)
		{
			Reporter.log("Expected Value:"+expectedValue+" is found in the table",true);
		}
		else
		{
			Reporter.log("Expected Value:"+expectedValue+" is NOT found in the table",true);
		}
		
		return found;
	}
	
	public static int getIndexOfTableHeaders(WebElement table,String expectedColName)
	{//home work- should be able to search column by ignoring case -remove space
		List<WebElement> allHeaders = table.findElements(By.tagName("th"));
		int count=allHeaders.size();
		int coulumnIndex=-1;
		for(int i=0;i<count;i++)
		{
			String columnName = allHeaders.get(i).getText();
			if (columnName.equals(expectedColName))
			{
				coulumnIndex=i;
				
				break;
			}
		}
		if(coulumnIndex==-1)
		{
			Reporter.log("Specified Column:"+expectedColName+" is NOT FOUND",true);
		}
		else
		{
			Reporter.log("Specified Column:"+expectedColName+" is found at:"+coulumnIndex,true);
		}
		return coulumnIndex;
	}
	
	public static boolean verifyElementText(WebElement element, String expectedText,boolean ignoreCase,boolean partialMatch)
	{
		String actualText=element.getText();
		Reporter.log("Expected Text:"+expectedText,true);
		Reporter.log("Actual Text:"+actualText,true);
		boolean finalResult;
		if(ignoreCase)
		{
			actualText=actualText.toLowerCase();
			expectedText=expectedText.toLowerCase();
			Reporter.log("Ignore the Case",true);
		}
		else
		{
			Reporter.log("Do not Ignore the Case",true);
		}
		
		if(partialMatch)
		{
			Reporter.log("partial match",true);
			finalResult= actualText.contains(expectedText);
		}
		else
		{
			Reporter.log("Complete match",true);
			finalResult= actualText.equals(expectedText);
		}
		
		if(finalResult)
		{
			Reporter.log("TEXT IS MATCHING",true);
		}
		else
		{
			Reporter.log("TEXT IS NOT MATCHING",true);
		}
		
		
		return finalResult;
	}
	
	public static void selectCheckBox(WebDriver driver,String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void verifyCheckBoxIsSelected(WebDriver driver,String xpath)
	{
		boolean selected = driver.findElement(By.xpath(xpath)).isSelected();
		if(selected)
		{
			System.out.println("Pass:Check Box is Selected");
		}
		else
		{
			System.err.println("FAIL: Check Box is Not Selected");
		}
	}
	
	public static boolean verifyPageByTitle(WebDriverWait wait,String expectedTitle,String page)
	{
		try 
		{
			wait.until(ExpectedConditions.titleContains(expectedTitle));
			System.out.println("Pass:"+page+ " is displayed");
			return true;
		}
		catch (Exception e) 
		{
			System.err.println("FAIL:"+page+ " is NOT displayed");
			return false;
		}
		
	}
	
	public static boolean verifyPageByURL(WebDriverWait wait,String expectedURL,String page)
	{

		try 
		{
			wait.until(ExpectedConditions.urlContains(expectedURL));
			System.out.println("Pass:"+page+ " is displayed");
			return true;
		}
		catch (Exception e) 
		{
			System.err.println("FAIL:"+page+ " is NOT displayed");
			return false;
		}
	}
	
	public static boolean verifyPageByElement(WebDriverWait wait,String xpath,String page)
	{

		try 
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			System.out.println("Pass:"+page+ " is displayed");
			return true;
		}
		catch (Exception e) 
		{
			System.err.println("FAIL:"+page+ " is NOT displayed");
			return false;
		}
	}
	
	public static boolean verifyPageByElement(WebDriverWait wait,WebElement element,String page)
	{

		try 
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Pass:"+page+ " is displayed",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("FAIL:"+page+ " is NOT displayed",true);
			return false;
		}
	}
	
	
	public static boolean verifyElementIsPresent(WebDriverWait wait,WebElement element,String... elementName)
	{
		
		String name=elementName.length>0? elementName[0]:"Element";
		try 
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Pass: "+name+" is displayed",true);
			return true;
		}
		catch (Exception e) 
		{
			Reporter.log("FAIL: "+name+" is NOT displayed",true);
			return false;
		}
	}
	
	public static boolean verifyElementColor(WebElement element,String expectedColor,String elementName)
	{
		Reporter.log("Verify color of the element:"+elementName,true);
		Reporter.log("Expected Color:"+expectedColor,true);
		String actualColor = element.getCssValue("color");
		Reporter.log("Actual Color in RGBa:"+actualColor,true);
		String actualHexColor = Color.fromString(actualColor).asHex();
		Reporter.log("Actual Color in hexa format:"+actualHexColor,true);
		return actualHexColor.equals(expectedColor);
	}
	
	public static void addScreenShotToReport(String testName,WebDriver driver,ExtentTest extentTest,String msg,Status status)
	{

		String timeStamp = QA_Util.getTimeStamp();
		String imgPath="./images/"+testName+timeStamp+".png";
		QA_Screenshot.takePageScreenShot(driver,imgPath);
		imgPath="../images/"+testName+timeStamp+".png";
		extentTest.log(status, MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
		
	}
	
	
}
