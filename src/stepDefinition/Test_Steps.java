package stepDefinition;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
/*import org.openqa.selenium.WebPage.driver;
import org.openqa.selenium.firefox.FirefoxPage.driver;*/

import automationframework.AutomationFramework;

import automationframework.AutomationTestCaseVerification;

import automationframework.AutomationLog;
import automationframework.AutomationTestCase;
import automationframework.Configuration;
import automationframework.Credentials;
import automationframework.ScreenshotAndTestNgReporterListener;
import automationframework.TestDataProvider;
import pageobjects.Homepage;
import pageobjects.LoginPage;
import pageobjects.Page;
import automationframework.AppDriver;
/*import automationframework.AppPage.driver;
import automationframework.AppPage.driver2;*/

//import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Steps extends AutomationTestCaseVerification {
	
	Homepage home=new Homepage();
	LoginPage loginpage=new LoginPage(Page.driver);
	
	
	public Test_Steps() {
		consetup();
	}

	@Given("^User is on Home Page$")
    public void setup() 
    {
		System.out.println("Browser Name ="+Configuration.getConfigurationValueForProperty("browser"));
		System.out.println("applicationURL Name ="+Configuration.getConfigurationValueForProperty("applicationURL"));
		AutomationLog.info("Testing logger");
		AutomationLog.error("Testing error");
		AutomationLog.warn("Testing warn");
		
		ScreenshotAndTestNgReporterListener.customScreenshot();
		AutomationLog.info("Testing Custom Snapshot taking by framework");
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
		Page.driver.quit();
		AppDriver.killChromePhantomInstance(Page.driver);
	}

	@Override
	protected void verifyTestCases() throws Exception {
		AutomationLog.info("In verifyTestCases");
		
	}

	@Override
	protected String successMessage() {
		AutomationLog.info("In successMessage");
		return null;
	}

	@Override
	protected String failureMessage() {
		AutomationLog.info("In failureMessage");
		return null;
	}

	
/*	public void genrateReports() {
		CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory("target");
		results.setOutputName("shubham-cucumber-results");
		results.setSourceFile("./target/cucumber.json");
		try {
			results.executeFeaturesOverviewReport();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
}