package testcases;

import org.testng.annotations.Test;


import testcaseRef.T02_loginValidation;
import utilities.forumConData;
import utilities.logCollection;
import utilities.readXLData;

public class T02_loginRunner 
{
	@Test //(groups = {"smokeTest"}, priority=1)
	public static void userLoginValidation() throws Exception
	{
		String sPath = forumConData.readXLFile;
		
		readXLData.readExtData(sPath, "loginpage");
		
		for(int i=1; i<=12; i++)
		{
			String keywords = readXLData.readcellData(i, 3);
			
			if(keywords.equals("openBrowser"))
			{
				T02_loginValidation.openBrowser();
				
				logCollection.info(" Browser is opened.");
				
				System.out.println(" Browser is opened.");
			}
			
			else if (keywords.equals("openHomepage"))
			{
				T02_loginValidation.openHomepage();
				
				logCollection.info("  Home page of Forum.Digitalpoint.tech website is loaded.");
				
				System.out.println(" Home page of Forum.Digitalpoint.tech website is loaded.");
			}
			
			else if (keywords.equals("validateTitle1"))
			{
				T02_loginValidation.validateTitle1();
				
				logCollection.info(" Title of the Home page is validated.");
				
				System.out.println(" Title of the Home page is validated.");
			}
			
			else if (keywords.equals("clickLoginbutt"))
			{
				T02_loginValidation.clickLoginbutt();
				
				logCollection.info("Login page is loading.");
				
				System.out.println(" Login page is loading.");
			}
			
			else if (keywords.equals("validateTitle2"))
			{
				T02_loginValidation.validateTitle2();
				
				logCollection.info(" Title of the Login page is validated.");
				
				System.out.println(" Title of the Login page is validated.");
			}
			
			else if (keywords.equals("sendUID"))
			{
				T02_loginValidation.sendUID();
				
				logCollection.info(" User ID entered successfully.");
				
				System.out.println(" User ID entered successfully.");
			}
			
			else if (keywords.equals("sendPsswd"))
			{
				T02_loginValidation.sendPsswd();
				
				logCollection.info(" Password entered successfully.");
				
				System.out.println(" Password entered successfully.");
			}
			
			else if (keywords.equals("clickSubmitbutt"))
			{
				T02_loginValidation.clickSubmitbutt();
				
				logCollection.info(" Login successful.");
				
				System.out.println(" Login successful.");
			}
			
			else if (keywords.equals("validateTitle3"))
			{
				T02_loginValidation.validateTitle3();
				
				logCollection.info(" Title of the after Login page is validated.");
				
				System.out.println(" Title of the after Login page is validated.");
			}
			
			else if (keywords.equals("clickLogoutdrop"))
			{
				T02_loginValidation.clickLogoutdrop();
				
				logCollection.info(" Click onto drop down successfully.");
				
				System.out.println(" Click onto drop down successfully.");
			}
			
			else if (keywords.equals("clickLogoutbutt"))
			{
				T02_loginValidation.clickLogoutbutt();
				
				logCollection.info(" Logout successful.");
				
				System.out.println(" Logout successful.");
			}
			
			else if (keywords.equals("closeBrowser"))
			{
				T02_loginValidation.closeBrowser();
				
				logCollection.info(" Browser is closed successfully.");
				
				System.out.println(" Browser is closed successfully.");
			}
			
		}
		
	}
	

}
