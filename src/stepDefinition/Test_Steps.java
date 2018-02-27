package stepDefinition;
/**
 * @author Shubham Jain
 * */
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
/*import org.openqa.selenium.WebPage.driver;
import org.openqa.selenium.firefox.FirefoxPage.driver;*/

import DataBases.JdbcMYSQLServerConnection;
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
import test.java.Runner.BeforeSuite;
import automationframework.AppDriver;
/*import automationframework.AppPage.driver;
import automationframework.AppPage.driver2;*/

//import com.github.mkolisnyk.cucumber.reporting.*;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
/*import cucumber.api.java.After;
import cucumber.api.java.Before;*/
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import mailReport.SendMailClass;


public class Test_Steps extends AutomationTestCaseVerification {
	
	Homepage home=new Homepage();
	LoginPage loginpage=new LoginPage(Page.driver);
	
	public Test_Steps() {
		invoke();
	}
		
	@BeforeSuite
	public void afterScenario() {
		AutomationLog.info("I am in email send function");
        try {
		//	SendMailClass.execute();
        	
        	System.out.println("Before is running");
        	AutomationLog.info("Before is running");
        	
			AutomationLog.info("Email sent");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Given("^User is on Home Page$")
    public void UserCheck() throws Exception
    {
/*		System.out.println("Browser Name ="+Configuration.getConfigurationValueForProperty("browser"));
		System.out.println("applicationURL Name ="+Configuration.getConfigurationValueForProperty("applicationURL"));
		System.out.println("applicationURL Name ="+Configuration.getConfigurationValueForProperty("execution-type"));*/
		AutomationLog.info("Testing logger");
		AutomationLog.error("Testing error");
		AutomationLog.warn("Testing warn");
		
		ScreenshotAndTestNgReporterListener.customScreenshot();
		AutomationLog.info("Testing Custom Snapshot taking by framework");
		/*
		
		JdbcMYSQLServerConnection mysql=new JdbcMYSQLServerConnection();		
		
		System.out.println("Query One Starts");
		
		ResultSet rs = mysql.dataBaseQuery("select * from credentials");
		if(rs.next()) {
		
			System.out.println(rs.getString(1));
		}
		
		mysql.closeConnection();
		
		System.out.println("Query two Starts");
		ResultSet rs2 = mysql.dataBaseQuery("select * from credentials where username = 'udip'");
		if(rs2.next()) {	
			System.out.println(rs2.getString(2));
		}
		mysql.closeConnection();
		
		System.out.println("Query three Starts");		
		ResultSet rs3 = mysql.dataBaseQuery("select * from credentials where username = 'gaurav'");
		if(rs3.next()) {	
			System.out.println(rs3.getString(3));
		}
		mysql.closeConnection();
		
		////////////////////////////////////////////////////////////
		
		*/
		
		
		
		// System.out.println(rs2.getString(1));
		// mysql.closeConnection();

	//	 con.close();
		 
	/*	Assert.assertEquals("Custom Error by shubham", Page.driver.getTitle());
		AutomationLog.info("Title of the game is not equal");*/
		
/*		Assert.assertEquals("ONLINE STORE | Toolsqa Dummy Test site", Page.driver.getTitle());
		AutomationLog.info("Title of the game is equal");
		
		
		Assert.assertEquals("ONLINE STORE | Toolsqa Dummy Test site", Page.driver.getTitle());
		AutomationLog.info("Title of the game is equal 2");*/
		
		//int i=1/0;   // checking exception case in step defination
    }
	
	@After
	public void afterMethod(Scenario scenario) {
	    if(scenario.isFailed()) {
	    	AutomationLog.error("Failed Scenario Name = "+scenario.getName()+" And it's status is = "+scenario.getStatus());
        	ScreenshotAndTestNgReporterListener.customScreenshotOnFail(scenario.getName());
        	AutomationLog.error("Testcase/Scenario fail");
	    }
	}
}