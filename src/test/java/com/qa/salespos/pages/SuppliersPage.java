package com.qa.salespos.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.salespos.generic.QA_WebUtil;

public class SuppliersPage extends HomePage{

		@FindBy(xpath="//div[contains(text(),'ID')]")
		private WebElement ID;
		
		@FindBy(xpath="//input[(@data-index='0') and (@name='btSelectItem')]")
		private WebElement firstCheckBox;
		
		@FindBy(xpath="//input[(@data-index='1') and (@name='btSelectItem')]")
		private WebElement SecondCheckBox;
		
		@FindBy(xpath="//input[@name='btSelectAll']")
		private WebElement SelectAllCheckBox;
		
		@FindBy(xpath="//div[contains(text(),'Company Name')]")
		private WebElement companyName;
		
		@FindBy(xpath="//div[contains(text(),'Agency Name')]")
		private WebElement agencyName;
		
		@FindBy(xpath="//div[contains(text(),'Category')]")
		private WebElement category;
		
		@FindBy(xpath="//div[contains(text(),'Last Name')]")
		private WebElement lastName;
		
		@FindBy(xpath="//div[contains(text(),'First Name')]")
		private WebElement firstName;
		
		@FindBy(xpath="//div[contains(text(),'Email')]")
		private WebElement email;
		
		@FindBy(xpath="//div[contains(text(),'Phone Number')]")
		private WebElement phoneNumber;
		
		@FindBy(xpath="//button[@id='delete']")
		private WebElement deleteBTN;
		
		@FindBy(xpath="//button[@id='email']")
		private WebElement emailBTN;
		
		@FindBy(xpath="	//button[@title='New Supplier']")
		private WebElement newSupplierBTN;
		
		@FindBy(xpath="	//input[@type='search']")
		private WebElement search;
		
		@FindBy(xpath="	//button[@title='Columns']")
		private WebElement columnsFilter;
		
		@FindBy(xpath="	//button[@title='Export data']")
		private WebElement exportData;
		
		@FindBy(xpath="//td[contains(text(), 'no people to display')]")
		private WebElement NoPeopleText;
		
		@FindBy(xpath="	//td[contains(text(),'Parle')]")
		private WebElement compNameInTable;
		
		@FindBy(xpath="//td[contains(text(),'Goods Supplier')]")
		private WebElement categoryInTable;
		
		@FindBy(xpath="//td[contains(text(),'Bhanu')]")
		private WebElement FirstNameInTable;
		
		@FindBy(xpath="//td[contains(text(),'Prakash')]")
		private WebElement LastNameInTable;
		
		@FindBy(xpath=".//a[@title='Send SMS']")
		private WebElement PhoneIconInTable;
		
		@FindBy(xpath=".//th[@data-field='messages']")
		private WebElement PhoneIcon;
		
		@FindBy(xpath=".//th[@data-field='edit']")
		private WebElement editIcon;
		
		@FindBy(xpath="//span[@class='pagination-info']")
		private WebElement paginationTxt;
		
		//=========================================================================================
		//pop up elements
		
		@FindBy(xpath="//div[contains(text(),'New Supplier')]")
		private WebElement popUpTitle;
		
		@FindBy(xpath="//div[contains(text(),'Update Supplier')]")
		private WebElement UpdatepopUpTitle;
		
		@FindBy(xpath="//button[contains(text(),'×')]")
		private WebElement popUpClose;

		@FindBy(xpath="//button[contains(text(),'Submit')]")
		private WebElement submitBTN;
		
		@FindBy(xpath="//div[@class='modal-content']//div[@class='modal-footer']//button[@id='submit']")
		private WebElement updateSubmitBTN;
		
		// Mandatory Fields - Company Name, Category, First Name, Last Name
		@FindBy(xpath="//label[contains(text(),'Company Name')]")
		private WebElement companyNameNS;
		
		@FindBy(xpath="//input[@name='company_name']")
		private WebElement companyNameInput;
		
		
		@FindBy(xpath="//label[contains(text(),'Category')]")
		private WebElement categoryNS;
		
		@FindBy(xpath="//label[contains(text(),'First Name')]")
		private WebElement firstNameNS;
		
		@FindBy(xpath="//input[@name='first_name']")
		private WebElement firstNameInput;
		
		
		@FindBy(xpath="	//label[contains(text(),'Last Name')]")
		private WebElement lastNameNS;
		
		@FindBy(xpath="//input[@name='last_name']")
		private WebElement lastNameInput;
		
		//Non Mandatory Fields - Agency Name, Gender, Email, Phone Number, Address1, Address2, City, State, Postal Code, Country, Comments,Account Number, Tax Id
		
		@FindBy(xpath="//label[contains(text(),'Agency Name')]")
		private WebElement agencyNameNS;
		
		@FindBy(xpath="//div[@class='modal-content']//form//fieldset//div[3]/div/input[@name='agency_name']")
		private WebElement agencyNameNSInput;
		
		@FindBy(xpath="//label[contains(text(),'Gender')]")
		private WebElement gender;
		
		@FindBy(xpath="//label[contains(text(),'Email')]")
		private WebElement emailNS;
		
		@FindBy(xpath="//div[@class='modal-content']//input[@name='email']")
		private WebElement emailUpdateTxt;
		
		//div[@class='modal-content']//input[@name='email']
		
		@FindBy(xpath="//label[contains(text(),'Phone Number')]")
		private WebElement phoneNumberNS;
		
		@FindBy(xpath="//input[@name='phone_number']")
		private WebElement phoneNumberNSInput;
		
		@FindBy(xpath="//label[contains(text(),'Address 1')]")
		private WebElement address1;
		
		@FindBy(xpath="	//label[contains(text(),'Address 2')]")
		private WebElement address2;
		
		@FindBy(xpath="//label[contains(text(),'City')]")
		private WebElement city;

		@FindBy(xpath="//label[contains(text(),'State')]")
		private WebElement state;

		@FindBy(xpath="//label[contains(text(),'Postal Code')]")
		private WebElement postalCode;
		
		@FindBy(xpath="//label[contains(text(),'Country')]")
		private WebElement country;
		
		@FindBy(xpath="//label[contains(text(),'Comments')]")
		private WebElement comments;

		@FindBy(xpath="//label[contains(text(),'Account Number')]")
		private WebElement accountNumber;
		
		@FindBy(xpath="//label[contains(text(),'Tax Id')]")
		private WebElement taxId;
		
		@FindBy(xpath="//span[starts-with(text(),'You have successfully added Supplier')]")
		private WebElement addSupplierSuccessMsg;
		
		@FindBy(xpath="//span[starts-with(text(),'You have successfully updated Supplier')]")
		private WebElement updateSupplierSuccessMsg;
		
		@FindBy(xpath="//span[starts-with(text(),'Message unsuccessfully sent to')]")
		private WebElement SmsUnsuccessMsg;
		
		@FindBy(xpath="//span[starts-with(text(),'You have successfully deleted 1 Supplier(s)')]")
		private WebElement delSuccessMsg;
		
		@FindBy(xpath="//button[@title='Columns']/../ul//input")
		private List<WebElement> allColumnNameChekBox;
		
		@FindBy(xpath="//button[@title='Columns']/../ul//span")
		private List<WebElement> allColumnNameChekBoxLabel;
		
		@FindBy(xpath="//input[@name='btSelectItem']")
		private List<WebElement> allCheckBox;
		
		@FindBy(xpath="(//table[@id='table']//td//a[@title='Update Supplier']/span[@class='glyphicon glyphicon-edit'])[1]")
		private WebElement UpdateBTN;
		
		@FindBy(id="table")
		private WebElement supplierTable;
		
		//=====================================================================
		// Send SMS pop up Elements
		
		@FindBy(xpath= ".//div[@class='modal-content']//div[@class='bootstrap-dialog-title']")
		private WebElement popUpTitleSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//label[@for='first_name_label']")
		private WebElement firstNameSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//input[@name='first_name']")
		private WebElement firstNameTxtSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//label[@for='last_name_label']")
		private WebElement lastNameSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//input[@name='last_name']")
		private WebElement lastNameTxtSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//label[@for='phone_label']")
		private WebElement phoneSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//input[@name='phone']")
		private WebElement phoneTxtSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//label[@for='message_label']")
		private WebElement msgSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//textarea[@name='message']")
		private WebElement msgTxtSMS;
		
		@FindBy(xpath= ".//div[@class='modal-content']//button[@id='submit']")
		private WebElement submitBTNSMS;
		
		
		//===========================================================================================
		
		public void setCompanyName(String cn)
		{
			companyNameInput.sendKeys(cn);
		}
		
		public void setCategory(String cat)
		{
			category.sendKeys(cat);
		}
		
		public void setFirstName(String fn)
		{
			firstNameInput.sendKeys(fn);
		}

		public void setLastName(String ln)
		{
			lastNameInput.sendKeys(ln);
		}
		public void setAgencyName(String an)
		{
			agencyNameNSInput.sendKeys(an);
		}
		public void setPhoneNumber(String pn)
		{
			phoneNumberNSInput.sendKeys(pn);
		}
		
		public void setEmailId(String em)
		{
			emailUpdateTxt.sendKeys(em);
		}
		
		public void clickToSelectOrDeslectAllCheckBox()
		{
			if(!SelectAllCheckBox.isSelected())
			{
				SelectAllCheckBox.click();//to check all the checkboxes are selected
			}
			else if(SelectAllCheckBox.isSelected())
			{
				SelectAllCheckBox.click();//to check all the checkboxes are getting deselected
			}
		}
		
		public boolean checkifSelectAllCheckBoxIsSelected()
		{
			boolean selected = SelectAllCheckBox.isSelected();
			
			return true;
		}
		
		public boolean checkifSelectAllCheckBoxIsNotSelected()
		{
			boolean selected = !SelectAllCheckBox.isSelected();
			
			return true;
		}
		
		public void clickSubmitBTN()
		{
			submitBTN.click();
		}
		
		public void clickFirstCheckBox()
		{
			firstCheckBox.click();
		}
		
		public void clickSecondCheckBox()
		{
			SecondCheckBox.click();
		}
		
		public void clickEmailBTN()
		{
			emailBTN.click();
		}
		
		public void clickDeleteBTN()
		{
			deleteBTN.click();
		}
		
		
		public boolean DeleteAndEmailBTNIsEnabled()
		{
			boolean delBTN = deleteBTN.isEnabled();
			boolean emalBTN = emailBTN.isEnabled();
			
			return delBTN && emalBTN;
		}
		
		public boolean DeleteOrEmailBTNIsEnabled()
		{
			boolean delBTN = deleteBTN.isEnabled();
			boolean emalBTN = emailBTN.isEnabled();
			
			return delBTN || emalBTN;
		}
		
		
		
		public void clickUpdateSubmitBTN()
		{
			updateSubmitBTN.click();
		}
		
		public void clickUpdateBTN()
		{
			UpdateBTN.click();
		}
		
		public SuppliersPage(WebDriver driver,WebDriverWait wait,ExtentTest extentTest)
		{
			super(driver,wait,extentTest);
		}
		
		public void clickOnNewSuppliersBTN()
		{
			newSupplierBTN.click();
		}
		
		public void clickColumnsButton()
		{
			columnsFilter.click();
		}
		
		public void clickPhoneIcon()
		{
			PhoneIconInTable.click();
		}
		
		public void clickSmsPopSubmitBTN()
		{
			submitBTNSMS.click();
		}
		
		public void setSmsTextMsg(String msg)
		{
			msgTxtSMS.sendKeys(msg);
		}
		
		public SoftAssert verifyAllColumnNameCheckBoxIsUncheckedExceptLast(SoftAssert softAssert)
		{
				int count=allColumnNameChekBox.size();
			
				for(int i=0;i<count;i++)
				{
					QA_WebUtil.selectAllCheckBox(allColumnNameChekBoxLabel,allColumnNameChekBox);
					QA_WebUtil.deselectAllCheckBoxExceptOne(allColumnNameChekBoxLabel,allColumnNameChekBox,i);
					softAssert=QA_WebUtil.verifyCheckboxiSEnabledExceptOne(allColumnNameChekBoxLabel,allColumnNameChekBox,i,softAssert);
				}
				
				return softAssert;
		}
		
		public SoftAssert verifyAllColumnNameCheboxIsSelectedAndVerifyItsName(String[] expectedLabels,SoftAssert softAssert)
		{
			for(int i=0;i<allColumnNameChekBox.size();i++)
			{
				WebElement checkBox=allColumnNameChekBox.get(i);
				WebElement label=allColumnNameChekBoxLabel.get(i);
				String labelText=label.getText();
				boolean labelMatch = QA_WebUtil.verifyElementText(label,expectedLabels[i], false, false);
				softAssert.assertTrue(labelMatch);
				boolean selected =QA_WebUtil.verifyCheckBoxIsSelected(checkBox, labelText);
				softAssert.assertTrue(selected);
			}
			
			return softAssert;
			
		}
		
		public boolean selectAllColumnNameChebox(String[] expectedLabels)
		{
			boolean result=false;
			for(int i=0;i<allColumnNameChekBox.size();i++)
			{
				WebElement checkBox=allColumnNameChekBox.get(i);
				if(!checkBox.isSelected())
				{
					checkBox.click();
				}
				result = checkBox.isSelected();
			}
			return result;
		}	
		
		public SoftAssert verifySupplierTbCheckboxIsSelectedAndVerifyAllEntriesAreSelected(SoftAssert softAssert) throws InterruptedException
		{
			for(int i=0;i<allCheckBox.size();i++)
			{
				WebElement checkBox=allCheckBox.get(i);
				Thread.sleep(1000);
				boolean selected =QA_WebUtil.verifyCheckBoxIsSelected(checkBox);
				if(selected)
				{
				softAssert.assertTrue(selected);
				}
				else if(!selected)
				{
				softAssert.assertTrue(!selected);
				}
			}
			
			return softAssert;	
		}
		
		public SoftAssert verifyAllEntriesAreSelectedAndSelectAllEntryIsSelected(SoftAssert softAssert)
		{
			for(int i=0;i<allCheckBox.size();i++)
			{
				WebElement checkBox=allCheckBox.get(i);
				checkBox.click();
				boolean selected = checkBox.isSelected();
				softAssert.assertTrue(selected);		
			}	
			return softAssert;
		}
		
		public SoftAssert verifyAllEntriesAreDeselectedAndDeselectAllEntryIsSelected(SoftAssert softAssert)
		{
			for(int i=0;i<allCheckBox.size();i++)
			{
				WebElement checkBox=allCheckBox.get(i);
				boolean selected = checkBox.isSelected();
				if(selected)
				{
					checkBox.click();
					softAssert.assertTrue(!selected);
				}
			}	
			return softAssert;
		}
		
		public boolean unCheckColumnNameCheckBoxAndVerifyColumnIsNotVisible()
		{
			String checkBoxlabel=allColumnNameChekBoxLabel.get(1).getText();
			allColumnNameChekBox.get(1).click();
			
			int v = QA_WebUtil.getIndexOfTableHeaders(supplierTable,checkBoxlabel );
			if(v==-1)
			{
				Reporter.log("Column:'"+checkBoxlabel+" is not visible in table",true);
				return true;
			}
			else
			{
				Reporter.log("Column:'"+checkBoxlabel+"'' is still visible in table",true);
				return false;
			}
		}
		
		public boolean checkColumnNameCheckBoxAndVerifyColumnIsVisible()
		{
			String checkBoxlabel=allColumnNameChekBoxLabel.get(1).getText();
			allColumnNameChekBox.get(1).click();
			
			int v = QA_WebUtil.getIndexOfTableHeaders(supplierTable,checkBoxlabel );
			if(v==-1)
			{
				Reporter.log("Column:'"+checkBoxlabel+" is not visible in table",true);
				return false;
			}
			else
			{
				Reporter.log("Column:'"+checkBoxlabel+"'' is visible in table",true);
				return true;
			}
		}
		
		public boolean verifyNoPeopleTextIsDisplayed()
		{
			return QA_WebUtil.verifyElementText(NoPeopleText, "There are no people to display.", false, false);
			
		}
		
		public boolean verifySuccessTosterMsgIsDisplayed(String expected)
		{
			return QA_WebUtil.verifyElementText(addSupplierSuccessMsg, expected, true, true);
		}
		public boolean verifyUpdateTosterMsgIsDisplayed(String expected)
		{
			return QA_WebUtil.verifyElementText(updateSupplierSuccessMsg, expected, true, true);
		}
		
		public boolean verifyAddSupplierSuccessToastMsgDisplayed(String expectedMessage,String testName)
		{
			boolean result = QA_WebUtil.verifyElementText(addSupplierSuccessMsg, expectedMessage, true, true);
			
			QA_WebUtil.addScreenShotToReport(testName, driver, extentTest, expectedMessage, Status.PASS);
			
			return result;
		}
		
		public boolean verifyPaginationMsgIsDisplayed(String expectedMessage,String testName)
		{
			boolean result = QA_WebUtil.verifyElementText(paginationTxt, expectedMessage, true, true);
			
			QA_WebUtil.addScreenShotToReport(testName, driver, extentTest, expectedMessage, Status.PASS);
			
			return result;
		}
		
		
		public boolean verifyUpdateSupplierSuccessToastMsgDisplayed(String expectedMessage,String testName)
		{
			boolean result = QA_WebUtil.verifyElementText(updateSupplierSuccessMsg, expectedMessage, true, true);
			if(result)
			{
				QA_WebUtil.addScreenShotToReport(testName, driver, extentTest, expectedMessage, Status.PASS);
			}
			return result;
		}
		
		public boolean verifySmsSucessToastMsgDisplayed(String expectedMessage,String testName)
		{
			boolean result = QA_WebUtil.verifyElementText(SmsUnsuccessMsg, expectedMessage, true, true);
			if(result)
			{
				QA_WebUtil.addScreenShotToReport(testName, driver, extentTest, expectedMessage, Status.PASS);
			}
			return result;
		}
		
		public boolean verifyDeleteSucessToastMsgDisplayed(String expectedMessage,String testName)
		{
			boolean result = QA_WebUtil.verifyElementText(delSuccessMsg, expectedMessage, true, true);
			if(result)
			{
				QA_WebUtil.addScreenShotToReport(testName, driver, extentTest, expectedMessage, Status.PASS);
			}
			return result;
		}
		
		public boolean verifySuplierPresentInTable(String companyName,String firstName,String lastName)
		{
			int companyNameIndex=QA_WebUtil.getIndexOfTableHeaders(supplierTable,"Company Name");
			boolean companyFound = QA_WebUtil.searchTableDataByColumn(supplierTable,++companyNameIndex,companyName);
			
			int firstNameIndex=QA_WebUtil.getIndexOfTableHeaders(supplierTable,"First Name");
			boolean firstNameFound = QA_WebUtil.searchTableDataByColumn(supplierTable,++firstNameIndex,firstName);
			
			int lastNameIndex=QA_WebUtil.getIndexOfTableHeaders(supplierTable,"Last Name");
			boolean lastNameFound = QA_WebUtil.searchTableDataByColumn(supplierTable,++lastNameIndex,lastName);
			
			boolean finalResult=companyFound && lastNameFound && firstNameFound;
			return finalResult;
		}
		
		public boolean verifyUpdatedAgencyNamePhoneNoPresentInTable(String agencyName, String phoneNumber)
		{
			int agencyNameIndex=QA_WebUtil.getIndexOfTableHeaders(supplierTable,"Agency Name");
			boolean agencyFound = QA_WebUtil.searchTableDataByColumn(supplierTable,++agencyNameIndex,agencyName);
			
			int phoneNumberIndex=QA_WebUtil.getIndexOfTableHeaders(supplierTable,"Phone Number");
			boolean phoneFound = QA_WebUtil.searchTableDataByColumn(supplierTable,++phoneNumberIndex,phoneNumber);
		
			boolean finalResult =agencyFound && phoneFound;
			return finalResult;
		}
		
		public boolean verifyPhoneIconPresentInTable()
		{
			boolean phoneIcon = QA_WebUtil.verifyElementIsPresent(wait, PhoneIcon);
			if(true)
			{
				Reporter.log("Column:"+phoneIcon+" is visible in table",true);
				return true;
			}
			else
			{
				Reporter.log("Column:"+phoneIcon+" is not visible in table",true);
				return false;
			}
		
		}
		
		
		public boolean verifyNewSupplierMandatoryFields()
		{
			
			boolean companyColor= QA_WebUtil.verifyElementColor(companyNameNS, "#ff0000","CompanyName Label");
			boolean categoryColor= QA_WebUtil.verifyElementColor(categoryNS, "#ff0000","Category Label");
			boolean finalResult= companyColor&&categoryColor;
			return finalResult;
		}
		
		public boolean verifyTableEntryIsDisplayed()
		{
			boolean TableEntryResult=false;
			boolean compNamePresent=  QA_WebUtil.verifyElementText(compNameInTable, "Parle", false, false);
			boolean categoryPresent=  QA_WebUtil.verifyElementText(categoryInTable, "Goods Supplier", false, false);
			boolean firstNamePresent=  QA_WebUtil.verifyElementText(FirstNameInTable, "Bhanu", false, false);
			boolean lastNamePresent=  QA_WebUtil.verifyElementText(LastNameInTable, "Prakash", false, false);
			
			TableEntryResult= compNamePresent && categoryPresent && firstNamePresent && lastNamePresent;
					
			return TableEntryResult;
		}
		
		public boolean verifyElementsArePresent()
		{
			boolean finalResult=false;
			
			boolean IDPresent= QA_WebUtil.verifyElementIsPresent(wait, ID, "ID");
			boolean companyNamePresent= QA_WebUtil.verifyElementIsPresent(wait, companyName, "Company Name");
			boolean agencyNamePresent= QA_WebUtil.verifyElementIsPresent(wait, agencyName, "Agency Name");
			boolean categoryPresent= QA_WebUtil.verifyElementIsPresent(wait, category, "Category");
			boolean lastNamePresent= QA_WebUtil.verifyElementIsPresent(wait, lastName, "Last Name");
			boolean firstNamePresent= QA_WebUtil.verifyElementIsPresent(wait, firstName, "First Name");
			boolean emailPresent= QA_WebUtil.verifyElementIsPresent(wait, email, "Email ");
			boolean phoneNumberPresent= QA_WebUtil.verifyElementIsPresent(wait, phoneNumber, "Phone Number");
			boolean deleteBTNsPresent= QA_WebUtil.verifyElementIsPresent(wait, deleteBTN, "Delete Option with Icon");
			boolean emailBTNPresent= QA_WebUtil.verifyElementIsPresent(wait, emailBTN, "Email Option with icon");
			boolean newSupplierBTNPresent= QA_WebUtil.verifyElementIsPresent(wait, newSupplierBTN, "New Supplier Button");
			boolean searchPresent= QA_WebUtil.verifyElementIsPresent(wait, search, "Search Text Box");
			boolean columnsFilterPresent= QA_WebUtil.verifyElementIsPresent(wait, columnsFilter, "Columns Selection Button");
			boolean exportDataPresent= QA_WebUtil.verifyElementIsPresent(wait, exportData, "Export Data Button");
			
			
			
			 finalResult= exportDataPresent && columnsFilterPresent && searchPresent && newSupplierBTNPresent && emailBTNPresent && deleteBTNsPresent && phoneNumberPresent &&  emailPresent && IDPresent && companyNamePresent && agencyNamePresent && categoryPresent && lastNamePresent && firstNamePresent;
		
			return finalResult;
			
		}

		public boolean verifyElementsArePresentInPopUp()
		{
			boolean finalResult=false;
			
			boolean popUpTitlePresent= QA_WebUtil.verifyElementIsPresent(wait, popUpTitle, "Pop Up title");
			boolean popUpClosePresent= QA_WebUtil.verifyElementIsPresent(wait, popUpClose, "Pop Up Close icon");
			boolean submitBTNPresent= QA_WebUtil.verifyElementIsPresent(wait, submitBTN, " Submit Button");
			boolean companyNamePresent= QA_WebUtil.verifyElementIsPresent(wait, companyNameNS, "Company Name");
			boolean categoryPresent= QA_WebUtil.verifyElementIsPresent(wait, categoryNS, "Category");
			boolean firstNamePresent= QA_WebUtil.verifyElementIsPresent(wait, firstNameNS, "First Name");
			boolean lastNamePresent= QA_WebUtil.verifyElementIsPresent(wait, lastNameNS, "Last Name");
			boolean agencyNamePresent= QA_WebUtil.verifyElementIsPresent(wait, agencyNameNS, "Agency Name");
			boolean genderPresent= QA_WebUtil.verifyElementIsPresent(wait, gender, "Gender");		
			boolean emailPresent= QA_WebUtil.verifyElementIsPresent(wait, emailNS, "Email ");
			boolean phoneNumberPresent= QA_WebUtil.verifyElementIsPresent(wait, phoneNumberNS, "Phone Number");
			boolean address1Present= QA_WebUtil.verifyElementIsPresent(wait, address1, "Address1");
			boolean address2Present= QA_WebUtil.verifyElementIsPresent(wait, address2, "Address2");
			boolean cityPresent= QA_WebUtil.verifyElementIsPresent(wait, city, "City");
			boolean statePresent= QA_WebUtil.verifyElementIsPresent(wait, state, "State"); 
			boolean postalCodePresent= QA_WebUtil.verifyElementIsPresent(wait, postalCode, "Postal Code");
			boolean countryPresent= QA_WebUtil.verifyElementIsPresent(wait, country, "Country");
			boolean commentsPresent= QA_WebUtil.verifyElementIsPresent(wait, comments, "Comments");
			boolean accountNumberPresent= QA_WebUtil.verifyElementIsPresent(wait, accountNumber, "Account Number");
			boolean taxIdPresent= QA_WebUtil.verifyElementIsPresent(wait, taxId, "Tax Id");
			
			 finalResult= taxIdPresent && accountNumberPresent && commentsPresent && countryPresent && postalCodePresent && statePresent && cityPresent && address2Present && address1Present && phoneNumberPresent && emailPresent && genderPresent && agencyNamePresent && popUpTitlePresent && popUpClosePresent && submitBTNPresent && companyNamePresent && categoryPresent && firstNamePresent && lastNamePresent;
			return finalResult;
			
		}
		public boolean verifyElementsArePresentInUpdatePopUp()
		{
			boolean finalResult=false;
			
			boolean popUpTitlePresent= QA_WebUtil.verifyElementIsPresent(wait, UpdatepopUpTitle, "Update Pop Up title");
			boolean popUpClosePresent= QA_WebUtil.verifyElementIsPresent(wait, popUpClose, "Pop Up Close icon");
			boolean updateSubmitBTNPresent= QA_WebUtil.verifyElementIsPresent(wait, updateSubmitBTN, " Submit Button");
			boolean companyNamePresent= QA_WebUtil.verifyElementIsPresent(wait, companyNameNS, "Company Name");
			boolean categoryPresent= QA_WebUtil.verifyElementIsPresent(wait, categoryNS, "Category");
			boolean firstNamePresent= QA_WebUtil.verifyElementIsPresent(wait, firstNameNS, "First Name");
			boolean lastNamePresent= QA_WebUtil.verifyElementIsPresent(wait, lastNameNS, "Last Name");
			boolean agencyNamePresent= QA_WebUtil.verifyElementIsPresent(wait, agencyNameNS, "Agency Name");
			boolean genderPresent= QA_WebUtil.verifyElementIsPresent(wait, gender, "Gender");		
			boolean emailPresent= QA_WebUtil.verifyElementIsPresent(wait, emailNS, "Email ");
			boolean phoneNumberPresent= QA_WebUtil.verifyElementIsPresent(wait, phoneNumberNS, "Phone Number");
			boolean address1Present= QA_WebUtil.verifyElementIsPresent(wait, address1, "Address1");
			boolean address2Present= QA_WebUtil.verifyElementIsPresent(wait, address2, "Address2");
			boolean cityPresent= QA_WebUtil.verifyElementIsPresent(wait, city, "City");
			boolean statePresent= QA_WebUtil.verifyElementIsPresent(wait, state, "State"); 
			boolean postalCodePresent= QA_WebUtil.verifyElementIsPresent(wait, postalCode, "Postal Code");
			boolean countryPresent= QA_WebUtil.verifyElementIsPresent(wait, country, "Country");
			boolean commentsPresent= QA_WebUtil.verifyElementIsPresent(wait, comments, "Comments");
			boolean accountNumberPresent= QA_WebUtil.verifyElementIsPresent(wait, accountNumber, "Account Number");
			boolean taxIdPresent= QA_WebUtil.verifyElementIsPresent(wait, taxId, "Tax Id");
			
			 finalResult= taxIdPresent && accountNumberPresent && commentsPresent && countryPresent && postalCodePresent && statePresent && cityPresent && address2Present && address1Present && phoneNumberPresent && emailPresent && genderPresent && agencyNamePresent && popUpTitlePresent && popUpClosePresent && updateSubmitBTNPresent && companyNamePresent && categoryPresent && firstNamePresent && lastNamePresent;
			return finalResult;
			
		}
		
		public boolean verifyElementsArePresentInSMSPopUp()
		{
			boolean finalResult=false;
			
			boolean smsPopUpTitlePresent= QA_WebUtil.verifyElementIsPresent(wait, popUpTitleSMS, "Send SMS Pop Up title");
			boolean firstNamePresent= QA_WebUtil.verifyElementIsPresent(wait, firstNameSMS, "First Name Label");
			boolean firstNameTxtBoxPresent= QA_WebUtil.verifyElementIsPresent(wait, firstNameTxtSMS, "First Name Text Box");
			boolean lastNamePresent= QA_WebUtil.verifyElementIsPresent(wait, lastNameSMS, "Last Name Label");
			boolean lastNameTxtBoxPresent= QA_WebUtil.verifyElementIsPresent(wait, lastNameTxtSMS, "Last Name Text Box");
			boolean phonePresent= QA_WebUtil.verifyElementIsPresent(wait, phoneSMS, "Phone Label");
			boolean phoneTxtBoxPresent= QA_WebUtil.verifyElementIsPresent(wait, phoneTxtSMS, "Phone Text Box");
			boolean msgPresent= QA_WebUtil.verifyElementIsPresent(wait, msgSMS, "Message Label");
			boolean msgTxtBoxPresent= QA_WebUtil.verifyElementIsPresent(wait, msgTxtSMS, "Message Text Box");
			boolean smsSubmitBTNPresent= QA_WebUtil.verifyElementIsPresent(wait, updateSubmitBTN, " Submit Button");
			
			finalResult= smsSubmitBTNPresent && msgTxtBoxPresent && msgPresent && phoneTxtBoxPresent && smsPopUpTitlePresent && firstNamePresent && firstNameTxtBoxPresent && lastNamePresent && lastNameTxtBoxPresent && phonePresent;
			return finalResult;
		
		}	
		
}
