package testcases;


import org.testng.annotations.Test;


import testcaseRef.T03_userRegistration;
import utilities.forumConData;
import utilities.readXLData;

public class T03_userRegRunner 
{
	@Test //(groups = {"regressionTest"}, priority=1)
	public static void userRegValidation() throws Exception
	{
		String sPath = forumConData.readXLFile;
		
		readXLData.readExtData(sPath, "userRegistration");
		
		for (int j=1; j<=16; j++)
		{
			String regkeywords = readXLData.readcellData(j, 3);
			
			if (regkeywords.equals("openBrowser"))
			{
				T03_userRegistration.openBrowser();
				
				System.out.println(" Browser is opened.");
			}
			
			else if (regkeywords.equals("openUserReg"))
			{
				T03_userRegistration.openUserReg();
				
				System.out.println(" User Registration page of Forum.Digitalpoint.tech website is loaded.");
			}
			
			else if (regkeywords.equals("userRegTitle"))
			{
				T03_userRegistration.userRegTitle();
				
				System.out.println(" Title of the User Registration page is validated.");
			}
			
			else if (regkeywords.equals("ddLanguage"))
			{
				T03_userRegistration.ddLanguage();
				
				System.out.println(" Language is selected.");
			}				
			
			else if (regkeywords.equals("ddTitle"))
			{
				T03_userRegistration.ddTitle();
				
				System.out.println(" Title is selected.");
			}
			
			else if (regkeywords.equals("sendFname"))
			{
				T03_userRegistration.sendFname();
				
				System.out.println(" First name is entered.");
			}
			
			else if (regkeywords.equals("sendLname"))
			{
				T03_userRegistration.sendLname();
				
				System.out.println(" Last name is entered.");
			}
			
			else if (regkeywords.equals("sendEmail"))
			{
				T03_userRegistration.sendEmail();
				
				System.out.println(" Email ID is entered.");
			}
			
			else if (regkeywords.equals("sendPsswd"))
			{
				T03_userRegistration.sendPsswd();
				
				System.out.println(" Password is entered.");			
			}
			
			else if (regkeywords.equals("rbGender"))
			{
				T03_userRegistration.rbGender();
				
				System.out.println(" Click onto Gender raio button.");
			}
			
			else if (regkeywords.equals("sendPhonenum"))
			{
				T03_userRegistration.sendPhonenum();
				
				System.out.println(" Phone number is entered.");
			}
			
			else if (regkeywords.equals("ddCourse"))
			{
				T03_userRegistration.ddCourse();
				
				System.out.println(" Course is selected.");
			}
			
			else if (regkeywords.equals("cbConfirmed"))
			{
				T03_userRegistration.cbConfirmed();
				
				System.out.println(" Click onto 'Confirmed' check box.");
			}
			
			else if (regkeywords.equals("clickSubmitbutt"))
			{
				T03_userRegistration.clickSubmitbutt();
				
				System.out.println(" Click onto Submit button.");
			}
			
			else if (regkeywords.equals("afterSubmitTitle"))
			{
				T03_userRegistration.afterSubmitTitle();
				
				System.out.println(" Title of after Submit button page is validated.");
			}
			
			else if (regkeywords.equals("closeBrowser"))
			{
				T03_userRegistration.closeBrowser();
				
				System.out.println(" Browser closed the web page successfully.");
			}
		}
	}
}



















