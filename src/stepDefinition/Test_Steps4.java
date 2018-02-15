package stepDefinition;
import java.sql.ResultSet;
/**
 * @author Shubham Jain
 * */
import java.util.HashMap;

import org.junit.Assert;

import DataBases.JdbcMYSQLServerConnection;
import automationframework.AppDriver;
import automationframework.AutomationLog;
import automationframework.AutomationTestCaseVerification;
import automationframework.ScreenshotAndTestNgReporterListener;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import mailReport.SendMailClass;
import pageobjects.Homepage;
import pageobjects.LoginPage;
import pageobjects.Page;

public class Test_Steps4 extends AutomationTestCaseVerification{
	
	Homepage home=new Homepage();
	LoginPage loginpage=new LoginPage(Page.driver);
	
	public Test_Steps4() {
		invoke();
	}
	
	
	@Given("^Test1$")
    public void Test1() throws Exception
    {
		System.out.println("Test1");
		home.button_MyAccount().click();
		 HashMap<String, String> expectedLoginData = testCaseData.get("AccountCredentials");
		 AutomationLog.info("Implementing CSV data Provider in famework");
		/* 
		 JdbcMYSQLServerConnection mysql=new JdbcMYSQLServerConnection();
			ResultSet rs2 = mysql.dataBaseQuery("select * from credentials where username = 'shubham'");
			if(rs2.next()) {	
				System.out.println(rs2.getString(2));
			}
		 
		 */
/*		 loginpage.txtbx_UserName().sendKeys(expectedLoginData.get("username"));
		 AutomationLog.info("Enter Username from CSV");
		 loginpage.txtbx_Password().sendKeys(expectedLoginData.get("password"));*/
			
/*		loginpage.txtbx_UserName().sendKeys(rs2.getString(2));
		AutomationLog.info("Enter Username from CSV");
		loginpage.txtbx_Password().sendKeys(rs2.getString(3));	*/
		 AutomationLog.info("Enter Password from CSV");
		 loginpage.button_LoginToAccount().click();
		 AutomationLog.info("Clicking on Login button");
    }
	
	@When("^Test2$")
    public void Test2() throws Exception
    {
		System.out.println("Test2");
    }
	
	@Then("^Test3$")
    public void Test3() throws Exception
    {
		System.out.println("Test3");
    }	
}
