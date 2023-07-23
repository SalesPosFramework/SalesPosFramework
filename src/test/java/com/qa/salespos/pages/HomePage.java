package com.qa.salespos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;
import com.qa.salespos.generic.QA_WebUtil;

public class HomePage {
	WebDriver driver=null;
	WebDriverWait wait=null;
	ExtentTest extentTest = null;
	 

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	
	@FindBy(xpath="//h3[text()='Welcome to OSPOS, click a module below to get started.']")
	private WebElement welcomeMsgOSPOS;
	
	@FindBy(xpath="//a[@title='Change Password']")
	private WebElement userName;
	
	@FindBy(xpath="//a[@title='Customers']")
	private WebElement customers;
	
	@FindBy(xpath="//a[@title='Items']")
	private WebElement items;
	
	@FindBy(xpath="//a[@title='Item Kits']")
	private WebElement itemKits;
	
	@FindBy(xpath="//a[@title='Suppliers']")
	private WebElement suppliers;
	
	@FindBy(xpath="//a[@title='Reports']")
	private WebElement reports;
	
	@FindBy(xpath="//a[@title='Receivings']")
	private WebElement receivings;
	
	@FindBy(xpath="//a[@title='Sales']")
	private WebElement sales;
	
	@FindBy(xpath="//a[@title='Gift Cards']")
	private WebElement giftCards;
	
	@FindBy(xpath="//a[@title='Messages']")
	private WebElement messages;
	
	
	@FindBy(xpath="//a[@title='Expenses']")
	private WebElement expenses;
	
	@FindBy(xpath="//a[@title='Cashups']")
	private WebElement cashups;
	
	@FindBy(xpath="//a[@title='Office']")
	private WebElement office;
	
	

	public HomePage(WebDriver driver,WebDriverWait wait,ExtentTest extentTest)
	{
		this.driver=driver;
		this.wait=wait;
		this.extentTest=extentTest;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyMenuElementByPosition(int position,String expectedText)
	{
		Reporter.log("Expected Position:"+position,true);
		String xp="//div[@role='navigation']//ul/li["+position+"]/a";
		WebElement element = driver.findElement(By.xpath(xp));
		
		return QA_WebUtil.verifyElementText(element, expectedText, false, false);//dont ignore the case & complete match
		
	}
	
	public void clickOnSuppliers()
	{
		suppliers.click();
	}
	
	public void clickLogout()
	{
		logoutLink.click();
	}
	
	public boolean verifyPageIsDisplayed( String expectedURL, String pageName)
	{
		return QA_WebUtil.verifyPageByURL(wait, "home", "HomePage");
	}
	
	public boolean verfyElementsArePresent()
	{
		boolean finalResult=false;
		
		boolean logoutPresent= QA_WebUtil.verifyElementIsPresent(wait, logoutLink, "Logout");
		boolean welcomeMsgPresent= QA_WebUtil.verifyElementIsPresent(wait, welcomeMsgOSPOS, "welcome Msg OSPOS");
		boolean userNamePresent= QA_WebUtil.verifyElementIsPresent(wait, userName, "User Name");
		boolean customersPresent= QA_WebUtil.verifyElementIsPresent(wait, customers, "Customers");
		boolean itemsPresent= QA_WebUtil.verifyElementIsPresent(wait, items, "Items");
		boolean itemKitsPresent= QA_WebUtil.verifyElementIsPresent(wait, itemKits, "Item Kits");
		boolean suppliersPresent= QA_WebUtil.verifyElementIsPresent(wait, suppliers, "Suppliers");
		boolean reportsPresent= QA_WebUtil.verifyElementIsPresent(wait, reports, "Reports");
		boolean receivingsPresent= QA_WebUtil.verifyElementIsPresent(wait, receivings, "Receivingss");
		boolean salesPresent= QA_WebUtil.verifyElementIsPresent(wait, sales, "Sales");
		boolean giftCardsPresent= QA_WebUtil.verifyElementIsPresent(wait, giftCards, "Gift Cards");
		boolean messagesPresent= QA_WebUtil.verifyElementIsPresent(wait, messages, "Messages");
		boolean expensesPresent= QA_WebUtil.verifyElementIsPresent(wait, expenses, "Expenses");
		boolean cashupsPresent= QA_WebUtil.verifyElementIsPresent(wait, cashups, "Cashups");
		boolean officePresent= QA_WebUtil.verifyElementIsPresent(wait, office, "Office");
		
		
		 finalResult=logoutPresent && welcomeMsgPresent && userNamePresent && customersPresent && receivingsPresent && itemKitsPresent && suppliersPresent && reportsPresent && itemsPresent && salesPresent && giftCardsPresent && messagesPresent && expensesPresent && cashupsPresent && officePresent;
		
	
		return finalResult;
		
	}
}
