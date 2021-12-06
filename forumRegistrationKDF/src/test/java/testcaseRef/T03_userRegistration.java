package testcaseRef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import utilities.forumEleLoc;
import utilities.browserEngine;
import utilities.forumConData;

public class T03_userRegistration 
{
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		//TS_01 Open the browser
		driver = browserEngine.getBrowser();
		//driver = gridEngine.browserSetup();
	}
	
	public static void openUserReg()
	{
		//TS_01 Navigate to User Registration page of Forum.Digitalpoint.tech website		
		driver.get(forumConData.regpageURL);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void userRegTitle()
	{
		//TS_03 Title of the User Registration button will be validated
		String expectedRegistrationTitle = driver.getTitle();
		
		Assert.assertEquals(forumConData.regpageTitle, expectedRegistrationTitle);
	}
	
	public static void ddLanguage()
	{
		//TS_04 Click onto choose Language drop down and select language
		new Select (driver.findElement(forumEleLoc.languageXpath)).selectByVisibleText(forumConData.regLanguage);
	}
	
	public static void ddTitle()
	{
		//TS_05 Click onto choose Title drop down and select Title
		new Select (driver.findElement(forumEleLoc.titleXpath)).selectByVisibleText(forumConData.regTitle);
	}
	
	public static void sendFname()
	{
		//TS_06 Send First name
		driver.findElement(forumEleLoc.regFnameXpath).sendKeys(forumConData.regFname);
	}
	public static void sendLname()
	{
		//TS_07 Send Last Name
		driver.findElement(forumEleLoc.regLnameXpath).sendKeys(forumConData.regLname);
	}
	
	public static void sendEmail()
	{
		//TS_08 Send Email ID
		driver.findElement(forumEleLoc.regEmailXpath).sendKeys(forumConData.regEmail);
	}
	
	public static void sendPsswd()
	{
		//TS_09 Send Password
		driver.findElement(forumEleLoc.regPsswdXpath).sendKeys(forumConData.regPsswd);
	}
	
	public static void rbGender()
	{
		//TS_10 Click onto Gender radio button
		driver.findElement(forumEleLoc.radioButMaleXpath).click();
	}
	
	public static void sendPhonenum()
	{
		//TS_11 Send Phone number
		driver.findElement(forumEleLoc.phoneXpath).sendKeys(forumConData.regPhoneNum);
	}
	
	public static void ddCourse()
	{
		//TS_12 Click onto choose Course drop down and select Course
		new Select (driver.findElement(forumEleLoc.courseXpath)).selectByVisibleText(forumConData.regCourse);
	}
	
	public static void cbConfirmed()
	{
		//TS_13 Click onto Confirmed check box
		driver.findElement(forumEleLoc.checkBoxXpath).click();
	}
	
	public static void clickSubmitbutt()
	{
		//TS_14 Click onto Submit button
		driver.findElement(forumEleLoc.submitButXpath).click();
	}
	
	public static void afterSubmitTitle()
	{
		//TS_15 Title of after Submit button will be validated
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	String expectedAfterRegPageTitle = driver.getTitle();
		
		Assert.assertEquals(forumConData.homepageTitle, expectedAfterRegPageTitle);
	}
	
	@AfterMethod
	public static void closeBrowser()
	{
		//TS_016 Close the browser
		driver.close();
	}
	
	
}



















