package testcaseRef;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import utilities.forumEleLoc;
//import utilities.gridEngine;
import utilities.browserEngine;
import utilities.forumConData;

public class T02_loginValidation 
{
	public static WebDriver driver;
	
	public static void openBrowser() throws MalformedURLException
	{
		//TS_001 Open the browser
		driver = browserEngine.getBrowser();
		//driver = gridEngine.browserSetup();
	}
	
	public static void openHomepage()
	{
		//TS_002 Navigate to Forum.Digitalpoint.tech web site
		System.out.println(" Browser is opening Home page.");
		
		driver.get(forumConData.homepageURL);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void validateTitle1()
	{
		//TS_003 Title of the Home page is validated
		String expectedTitle = driver.getTitle();
    	
    	Assert.assertEquals(forumConData.homepageTitle, expectedTitle);
	}
	
	public static void clickLoginbutt()
	{
		//TS_004 Click onto login button
		driver.findElement(forumEleLoc.homeLoginButtonXpath).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void validateTitle2()
	{
		//TS_005 Title of the login page will be validated
		String loginpageATitle=driver.getTitle();
		
		Assert.assertEquals(forumConData.loginpageETitle, loginpageATitle);
	}
	
	public static void sendUID()
	{
		//TS_006 Send User name
		driver.findElement(forumEleLoc.unameXpath).sendKeys(forumConData.loginUid);
	}
	
	public static void sendPsswd()
	{
		//TS_007 Send Password
		driver.findElement(forumEleLoc.upsswdXpath).sendKeys(forumConData.loginPsswd);
	}
	
	public static void clickSubmitbutt()
	{
		//TS_008 Click onto submit button
		driver.findElement(forumEleLoc.loginButXpath).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void validateTitle3()
	{
		//TS_009 Title of the after login will be validated
		String afterloginActualTitle=driver.getTitle();
    	
    	Assert.assertEquals(forumConData.afterloginTitleExpected,afterloginActualTitle);
	}
	
	public static void clickLogoutdrop()
	{
		//TS_010 Click onto Logout Dropdown
		driver.findElement(forumEleLoc.dropdownXpath).click();
	}
	
	public static void clickLogoutbutt()
	{
		//TS_011 Click onto Logout button
		driver.findElement(forumEleLoc.logoutButXpath).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public static void closeBrowser()
	{
		//TS_012 Close the browser
		driver.close();
	}
}










