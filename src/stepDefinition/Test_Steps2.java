/*package stepDefinition;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebPage.driver;
import org.openqa.selenium.firefox.FirefoxPage.driver;

import automationframework.AutomationFramework;

import automationframework.AutomationTestCaseVerification;

import automationframework.AutomationLog;
import automationframework.AutomationTestCase;
import automationframework.Configuration;
import automationframework.Credentials;
import automationframework.ScreenshotAndTestNgReporterListener;
import pageobjects.Homepage;
import pageobjects.LoginPage;
import pageobjects.Page;
import automationframework.AppDriver;
import automationframework.AppPage.driver;
import automationframework.AppPage.driver2;

//import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Steps2 {
	
	Homepage home=new Homepage();
	LoginPage loginpage=new LoginPage(Page.driver);
	
	
	@Given("^User is on Home Page$")
    public void setup() 
    {
         String globalConfigureationFileWithPath = "src/configuration/config.properties";
         AutomationFramework.initWithGlobalConfiguration(globalConfigureationFileWithPath);
		 HashMap<String, String> expectedLoginData = testCaseData.get("AccountCredentials");
		 System.out.println("Username from CSV"+expectedLoginData.get("username"));
		 System.out.println("Password from CSV"+expectedLoginData.get("password"));
		 
		 
		 
		new Page(AppDriver.getDriver(Configuration.getConfigurationValueForProperty("browser")));
		System.out.println("Browser Name ="+Configuration.getConfigurationValueForProperty("browser"));
		System.out.println("applicationURL Name ="+Configuration.getConfigurationValueForProperty("applicationURL"));
		AutomationLog.info("Testing logger");
		AutomationLog.error("Testing error");
		AutomationLog.fatal("Testing fatal");
		AutomationLog.warn("Testing warn");
		
		ScreenshotAndTestNgReporterListener.customScreenshot();
		AutomationLog.info("Testing Custom Snapshot taking by framework");
    }

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		home.button_MyAccount().click();
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		 HashMap<String, String> expectedLoginData = testCaseData.get("AccountCredentials");
		 loginpage.txtbx_UserName().sendKeys(expectedLoginData.get("username"));
		 AutomationLog.info("Implementing CSV data Provider in famework");
	//	loginpage.txtbx_UserName().sendKeys(username);
	//	loginpage.txtbx_Password().sendKeys(password);
		 loginpage.txtbx_Password().sendKeys(expectedLoginData.get("password"));
		 
		loginpage.button_LoginToAccount().click();
	}
	
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
 
		//Write the code to handle Data Table
		List<List<String>> data = usercredentials.raw();
		System.out.println("DataTable"+data.get(0).get(0));
		System.out.println("DataTable2"+data.get(0).get(1));
		System.out.println("DataTable3"+data.get(0).get(2));
		loginpage.txtbx_UserName().sendKeys(data.get(0).get(0)); 
 
		//This is to get the first data of the set (First Row + Second Column)
		loginpage.txtbx_Password().sendKeys(data.get(0).get(1));
 
		loginpage.button_LoginToAccount().click();
		
	}
	
	@When("^User enters Credentials to LogIns$")
	public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {
		 
		//Write the code to handle Data Table
		for (Credentials credentials : usercredentials) {			
			Page.driver.findElement(By.id("log")).sendKeys(credentials.getUsername()); 
		    Page.driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
		    Page.driver.findElement(By.id("login")).click();
			}		
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		//Page.driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		//genrateReports();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
		Page.driver.quit();
		AppDriver.killChromePhantomInstance(Page.driver);
	}


	
	public void genrateReports() {
		CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory("target");
		results.setOutputName("shubham-cucumber-results");
		results.setSourceFile("./target/cucumber.json");
		try {
			results.executeFeaturesOverviewReport();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}*/