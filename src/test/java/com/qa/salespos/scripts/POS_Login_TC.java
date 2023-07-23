package com.qa.salespos.scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;
import com.qa.salespos.generic.QA_BaseTest;
import com.qa.salespos.generic.QA_Excel;
import com.qa.salespos.pages.HomePage;
import com.qa.salespos.pages.LoginPage;

public class POS_Login_TC extends QA_BaseTest
{
	 @Test(priority = 1,groups= {"login","smoke"})
	 public void testPOS_Login_Step1()
	 {
		 LoginPage loginPage=new LoginPage(driver,wait,extentTest);
		boolean finalResult = loginPage.verfyEleemntsArePresent(wait);
		Assert.assertTrue(finalResult);
	 }
	 
	 @Test(priority = 2,groups= {"login","smoke"}) 
	 public void testPOS_Login_Step2()
	 {
		 LoginPage loginPage=new LoginPage(driver,wait,extentTest);
		loginPage.setUserName("admin");
		loginPage.setPassword("pointofsale");
		loginPage.clickGoButton();
		HomePage homePage=new  HomePage(driver,wait,extentTest);
		boolean homePageDisplayed = homePage.verifyPageIsDisplayed("home", "Home Page");
		boolean elementsDisplayed = homePage.verfyElementsArePresent();
		Assert.assertTrue(homePageDisplayed && elementsDisplayed);
	 }
	 
	 @Test(priority = 3,dependsOnMethods = {"testPOS_Login_Step2"}, groups= {"login","smoke"})
	 public void testPOS_Login_Step3()
	 {
		HomePage homePage=new  HomePage(driver,wait,extentTest);
		homePage.clickLogout();
		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
		boolean loginPageDisplayed = loginPage.verifyLoginPageIsDisplayed(wait);
		Assert.assertTrue(loginPageDisplayed);
	 }
	 
	 @DataProvider
	 public Iterator<String[]> getData()
	 {
		ArrayList<String[]> data = QA_Excel.getSheetDataToList(XL_PATH,"POS_Login");
		return data.iterator();
	 }
	 
	 @Test(dataProvider = "getData", priority = 4, groups= {"login"})
	 public void testPOS_Login_Step4(String un,String pw)
	 {
		 LoginPage loginPage=new LoginPage(driver,wait,extentTest);
			loginPage.setUserName(un);
			loginPage.setPassword(pw);
			loginPage.clickGoButton();
			Assert.assertTrue(loginPage.verfyErrMsIsPresent(wait));
	 }
	 
	}


