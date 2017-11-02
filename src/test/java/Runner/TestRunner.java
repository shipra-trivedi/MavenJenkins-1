package test.java.Runner;
/**
 * @author Shubham Jain
 * */
import org.junit.runner.RunWith;

import automationframework.AppDriver;
import automationframework.AutomationLog;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pageobjects.Page;
 
//@RunWith(Cucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
		retryCount = 3,
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		toPDF = true,
		outputFolder = "target")
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
		,plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json","junit:target/cucumber.xml"}
//		,monochrome = false
//		,dryRun = true
		)
 
@RunWith(ExtendedCucumberRunner.class)
public class TestRunner {
    @BeforeSuite
    public static void setUp() {
    	AutomationLog.info("In Before Suite");
    }
    @AfterSuite
    public static void tearDown() {
        System.out.println("In After Suite");
        AppDriver.clearBrowserContext(Page.driver);
        AutomationLog.info("Quiting Webdriver Instances");
    }
}