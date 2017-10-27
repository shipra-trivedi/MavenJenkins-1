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

//import com.github.mkolisnyk.cucumber.reporting.*;

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
    public void UserCheck() 
    {
		System.out.println("Browser Name ="+Configuration.getConfigurationValueForProperty("browser"));
		System.out.println("applicationURL Name ="+Configuration.getConfigurationValueForProperty("applicationURL"));
		AutomationLog.info("Testing logger");
		AutomationLog.error("Testing error");
		AutomationLog.warn("Testing warn");
		
		ScreenshotAndTestNgReporterListener.customScreenshot();
		AutomationLog.info("Testing Custom Snapshot taking by framework");
		
	/*	Assert.assertEquals("Custom Error by shubham", Page.driver.getTitle());
		AutomationLog.info("Title of the game is not equal");*/
		
		Assert.assertEquals("ONLINE STORE | Toolsqa Dummy Test site", Page.driver.getTitle());
		AutomationLog.info("Title of the game is equal");
		

		
		Assert.assertEquals("ONLINE STORE | Toolsqa Dummy Test site", Page.driver.getTitle());
		AutomationLog.info("Title of the game is equal 2");
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