package com.qa.salespos.scripts;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.salespos.generic.QA_BaseTest;
import com.qa.salespos.pages.HomePage;
import com.qa.salespos.pages.LoginPage;
import com.qa.salespos.pages.SuppliersPage;

public  class POS_Suppliers_01 extends QA_BaseTest
{
	 	@Test(priority = 5,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step1()
	 	{
	 		//Suppliers icon should be present as 4th icon
	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
	 		loginPage.setUserName("admin");
	 		loginPage.setPassword("pointofsale");
	 		loginPage.clickGoButton();
	 		
	 		HomePage homePage=new HomePage(driver,wait,extentTest);
	 		boolean result = homePage.verifyMenuElementByPosition( 4, "Suppliers");
	 		Assert.assertTrue(result);
	 	}

	 	@Test(priority = 6, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step2n3()
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
	 		supplierPage.clickOnSuppliers();
	 		
	 		supplierPage.verifyPageIsDisplayed("suppliers","SuppliersPage");
	 		boolean result =supplierPage.verifyElementsArePresent();
	 		Assert.assertTrue(result);
	 	}
	 	
	 	@Test(priority = 7,groups={"Suppliers"}, enabled=false)
	 	public void testPOS_Suppliers_01_Step4()
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
	 		supplierPage.clickOnSuppliers();
	 		
	 		boolean NoPeopleTextResult = supplierPage.verifyNoPeopleTextIsDisplayed();
	 		Assert.assertTrue(NoPeopleTextResult);
	 	}
	 	
	 	@Test(priority = 8,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step5()
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
	 		supplierPage.clickOnSuppliers();
	 		
	 		supplierPage.clickOnNewSuppliersBTN();
	 		boolean newSuppliersPagePopUpResult = supplierPage.verifyElementsArePresentInPopUp();
	 		Assert.assertTrue(newSuppliersPagePopUpResult);
	 	}
	 	@Test(priority = 9,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step6() throws InterruptedException
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
//	 		supplierPage.clickOnNewSuppliersBTN();
	 		supplierPage.setCompanyName("Parle");
	 		supplierPage.setFirstName("Bhanu");
	 		supplierPage.setLastName("Prakash");
	 		supplierPage.clickSubmitBTN();
	 		Assert.assertTrue(supplierPage.verifyAddSupplierSuccessToastMsgDisplayed("Parle","testPOS_Suppliers_01_Step5"));
	 		supplierPage.verifySuplierPresentInTable("Parle","Bhanu","Prakash");
	 		
	 	}
	 	
	 	@Test(priority = 10,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step7() throws InterruptedException
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage suppliersPage=new SuppliersPage(driver,wait,extentTest);
//	 		suppliersPage.clickOnSuppliers();
	 		
	 		suppliersPage.clickUpdateBTN();
	 		boolean SuppliersUpdatePopUpResult = suppliersPage.verifyElementsArePresentInUpdatePopUp();
	 		Assert.assertTrue(SuppliersUpdatePopUpResult);	
	 	}
	 	
	 	@Test(priority = 11,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step8() throws InterruptedException
	 	{
	 		
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
//	 		supplierPage.clickUpdateBTN();
	 		Thread.sleep(2000);
	 		
	 		supplierPage.setAgencyName("Balaji Distributers");
	 		supplierPage.setPhoneNumber("9481787493");
	 		supplierPage.clickUpdateSubmitBTN();
	 		Assert.assertTrue(supplierPage.verifyUpdateSupplierSuccessToastMsgDisplayed("You have successfully updated Supplier Parle","testPOS_Suppliers_01_Step6"));
	 		Assert.assertTrue(supplierPage.verifyUpdatedAgencyNamePhoneNoPresentInTable("Balaji Distributers","9481787493"));
	 		Assert.assertTrue(supplierPage.verifyPhoneIconPresentInTable());

	 	}
	 	
	 	@Test(priority = 12,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step9() throws InterruptedException
	 	{
	 		
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
	 		supplierPage.clickPhoneIcon();
	 		Thread.sleep(4000);
	 		
	 		boolean SuppliersSendSMSPopUpResult = supplierPage.verifyElementsArePresentInSMSPopUp();
	 		Assert.assertTrue(SuppliersSendSMSPopUpResult);	

	 	}
	 	
	 	@Test(priority = 13,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step10() throws InterruptedException
	 	{
	 		
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
//	 		supplierPage.clickPhoneIcon();
	 		Thread.sleep(4000);
	 		
	 		supplierPage.setSmsTextMsg("Hi");
	 		supplierPage.clickSmsPopSubmitBTN();
	 		Assert.assertTrue(supplierPage.verifySmsSucessToastMsgDisplayed("Message unsuccessfully sent to: 9481787493","testPOS_Suppliers_01_Step10"));

	 	}
	 	
	 	@Test(priority = 14,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step11() throws InterruptedException
	 	{
//	 		
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
	 		supplierPage.clickUpdateBTN();
	 		supplierPage.setEmailId("abc@gmail.com");
	 		Thread.sleep(2000);
	 		supplierPage.clickUpdateSubmitBTN();
	 		Thread.sleep(1000);
	 		supplierPage.clickFirstCheckBox();
	 		Thread.sleep(1000);
	 		Assert.assertTrue(supplierPage.DeleteAndEmailBTNIsEnabled());
	 		supplierPage.clickFirstCheckBox();

	 	}
	 	
	 	@Test(priority = 15,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step12() throws InterruptedException
	 	{
//	 		
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
//	 		supplierPage.clickUpdateBTN();
//	 		supplierPage.setEmailId("abc@gmail.com");
//	 		Thread.sleep(2000);
//	 		supplierPage.clickUpdateSubmitBTN();
	 		
	 		supplierPage.clickSecondCheckBox();
	 		Assert.assertTrue(supplierPage.DeleteOrEmailBTNIsEnabled());
	 		supplierPage.clickSecondCheckBox();

	 	}
	 	
	 	@Test(priority = 16,groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step13() throws InterruptedException
	 	{
	 		
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
//	 		supplierPage.clickUpdateBTN();
//	 		supplierPage.setEmailId("abc@gmail.com");
//	 		Thread.sleep(2000);
//	 		supplierPage.clickUpdateSubmitBTN();
	 		
	 		supplierPage.clickFirstCheckBox();
	 		supplierPage.clickEmailBTN();
	 		Thread.sleep(1000);
	 		supplierPage.clickFirstCheckBox();
	 	}
	 	
	 	@Test(priority = 17, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step14()
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
	 		String[] expectedLabels= {"ID","Company Name","Agency Name","Category","Last Name","First Name","Email","Phone Number"};
	 		supplierPage.clickColumnsButton();
	 		SoftAssert softAssert = supplierPage.verifyAllColumnNameCheboxIsSelectedAndVerifyItsName(expectedLabels,new SoftAssert());
	 		softAssert.assertAll();
	 	}
	 	
	 	@Test(priority = 18, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step15n16()
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
//	 		supplierPage.clickColumnsButton();
	 		boolean result1 = supplierPage.unCheckColumnNameCheckBoxAndVerifyColumnIsNotVisible();
	 		boolean result2 = supplierPage.checkColumnNameCheckBoxAndVerifyColumnIsVisible();
	 		Assert.assertTrue(result1 && result2);
	 	}
	 	
	 	@Test(priority = 19, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step17()
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
//	 		supplierPage.clickColumnsButton();
	 		String[] expectedLabels= {"ID","Company Name","Agency Name","Category","Last Name","First Name","Email","Phone Number"};

	 		SoftAssert softAssert =new SoftAssert();
	 		softAssert=supplierPage.verifyAllColumnNameCheckBoxIsUncheckedExceptLast(softAssert);
	 		softAssert.assertAll();
	 		supplierPage.selectAllColumnNameChebox(expectedLabels);
	 		
	 	}
	 	
	 	@Test(priority = 20, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step18n19() throws InterruptedException
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
	 		supplierPage.clickFirstCheckBox();
	 		supplierPage.clickDeleteBTN();
	 		
	 		Alert alert = driver.switchTo().alert();
	 		Thread.sleep(2000);
	 		String actualMsg = alert.getText();
	 		String expectedMsg = "Are you sure you want to delete the selected Supplier(s)?";
	 		Assert.assertEquals(expectedMsg, actualMsg);
	 		alert.dismiss();
	 	}
	 	
	 	@Test(priority = 21, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step20() throws InterruptedException
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		
	 		supplierPage.clickFirstCheckBox();
	 		supplierPage.clickDeleteBTN();
	 		
	 		Alert alert = driver.switchTo().alert();
	 		Thread.sleep(2000);
	 		alert.accept();
	 		Thread.sleep(1000);
	 		Assert.assertTrue(supplierPage.verifyDeleteSucessToastMsgDisplayed("You have successfully deleted 1 Supplier(s)","testPOS_Suppliers_01_Step20"));

	 	}
	 	
	 	@Test(priority = 22, groups={"Suppliers"},enabled=false)
	 	public void testPOS_Suppliers_01_Step21() throws InterruptedException
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		Thread.sleep(2000);
	 	
	 		Assert.assertTrue(supplierPage.verifyPaginationMsgIsDisplayed("Showing 1 to 1 of 1 rows","testPOS_Suppliers_01_Step21"));

	 	}
	 	
	 	@Test(priority = 23, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step22n23() throws InterruptedException
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		Thread.sleep(2000);
	 		
	 		supplierPage.clickToSelectOrDeslectAllCheckBox();
	 		SoftAssert softAssert =new SoftAssert();
	 		softAssert=supplierPage.verifySupplierTbCheckboxIsSelectedAndVerifyAllEntriesAreSelected(softAssert);
	 		softAssert.assertAll();
	 		
	 		supplierPage.clickToSelectOrDeslectAllCheckBox();
	 		softAssert=supplierPage.verifySupplierTbCheckboxIsSelectedAndVerifyAllEntriesAreSelected(softAssert);
	 		softAssert.assertAll();
	 	}
	 	
	 	@Test(priority = 24, groups={"Suppliers"})
	 	public void testPOS_Suppliers_01_Step24n25() throws InterruptedException
	 	{
//	 		LoginPage loginPage=new LoginPage(driver,wait,extentTest);
//	 		loginPage.setUserName("admin");
//	 		loginPage.setPassword("pointofsale");
//	 		loginPage.clickGoButton();
	 		SuppliersPage supplierPage=new SuppliersPage(driver,wait,extentTest);
//	 		supplierPage.clickOnSuppliers();
	 		Thread.sleep(2000);
	 		
	 		SoftAssert softAssert =new SoftAssert();
	 		softAssert=supplierPage.verifyAllEntriesAreSelectedAndSelectAllEntryIsSelected(softAssert);
	 		Thread.sleep(2000);
	 		boolean result1= supplierPage.checkifSelectAllCheckBoxIsSelected();
	 		softAssert.assertAll();
	 		
//	 		Thread.sleep(1000);
//	 		softAssert=supplierPage.verifyAllEntriesAreDeselectedAndDeselectAllEntryIsSelected(softAssert);
//	 		Thread.sleep(2000);
//	 		boolean result2=supplierPage.checkifSelectAllCheckBoxIsNotSelected();
//	 		softAssert.assertAll();
//	 		
//	 		Assert.assertTrue(result1 && result2);

	 	}
	 	
}

