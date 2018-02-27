package stepDefinition;
/**
 * @author Shubham Jain
 * */
import java.util.HashMap;
import org.junit.Assert;
import org.openqa.selenium.By;

import automationframework.AppDriver;
import automationframework.AutomationLog;
import automationframework.AutomationTestCaseVerification;
import automationframework.ScreenshotAndTestNgReporterListener;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Homepage;
import pageobjects.LoginPage;
import pageobjects.Page;

public class Test_Steps3 extends AutomationTestCaseVerification{
	
	Homepage home=new Homepage();
	LoginPage loginpage=new LoginPage(Page.driver);
	
	public Test_Steps3() {
		invoke();
	}
		
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		home.button_MyAccount().click();
	}
	
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test() throws Throwable {
 
		 HashMap<String, String> expectedLoginData = testCaseData.get("AccountCredentials");
		 AutomationLog.info("Implementing CSV data Provider in famework");
		 loginpage.txtbx_UserName().sendKeys(expectedLoginData.get("username"));
		 AutomationLog.info("Enter Username from CSV");
		 loginpage.txtbx_Password().sendKeys(expectedLoginData.get("password"));
		 AutomationLog.info("Enter Password from CSV");
		 loginpage.button_LoginToAccount().click();
		 AutomationLog.info("Clicking on Login button");
	}
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		//loginpage.button_SingOutToAccount().click();
		 AutomationLog.info("Clicking on Logout button");
		//genrateReports();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
		
		//Page.driver.findElements(By.xpath("")).get(2).click();
		Page.driver.quit();
		AppDriver.killChromePhantomInstance(Page.driver);
		
		
	}
	
/*	@Then("^Asserts of JUnits$")
    public void testAssert(){					
		
        //Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };					
        		
        //Assert statements		
        Assert.assertEquals(string1,string2);					
        Assert.assertSame(string3, string4);					
        Assert.assertNotSame(string1, string3);					
        Assert.assertNotNull(string1);			
        Assert.assertNull(string5);			
        Assert.assertTrue(variable1<variable2);					
        Assert.assertArrayEquals(airethematicArrary1, airethematicArrary2);
     //   Assert.assertTrue(message, condition);        
	}
*/

//}
}