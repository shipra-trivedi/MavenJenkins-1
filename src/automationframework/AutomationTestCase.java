package automationframework;
/**
 * @author Shubham Jain
 *
 */
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import pageobjects.Homepage;
import pageobjects.LoginPage;
import pageobjects.Page;

public class AutomationTestCase 
{
	Homepage homePage = Homepage.homePage();
	LoginPage loginPage = new LoginPage(Page.driver);
    protected HashMap<String, HashMap<String, String>> testCaseData;


    private String executingTestCaseName = null;
    private String executingTestCaseFileName = null;

    public AutomationTestCase() 
    {
        this.executingTestCaseName = this.getClass().getSimpleName();
        this.executingTestCaseFileName = executingTestCaseName;
    }

    protected AutomationTestCase(String executingTestCaseName) 
    {
        this.executingTestCaseName = this.getClass().getSimpleName();
        this.executingTestCaseFileName = executingTestCaseName;
    }

    public void setup() 
    {
        AutomationLog.startTestCase(executingTestCaseName);
        String browserToUse = Configuration.getConfigurationValueForProperty("browser");
        new Page(AppDriver.getDriver(browserToUse));
    	Credentials ValidCredentials = getGlobalUserCredentials();
        try {
        	loginPage.doSuccessfulLogin(ValidCredentials.getEmail(), ValidCredentials.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
       // populate test case data from csv
        testCaseData = TestDataProvider.getTestData(executingTestCaseFileName);
    }
    
    public void consetup() 
    {
        AutomationLog.startTestCase(executingTestCaseName);
		new Page(AppDriver.getDriver(Configuration.getConfigurationValueForProperty("browser")));
       // populate test case data from csv
        //System.out.println("checking name="+executingTestCaseFileName);
        testCaseData = TestDataProvider.getTestData(executingTestCaseFileName);
    }

    public static Credentials getGlobalUserCredentials()
    {
        String email = Configuration.getConfigurationValueForProperty("email");
        String password = Configuration.getConfigurationValueForProperty("password");
        Credentials credential =new Credentials(email, password);
        return credential;
    }

    public void cleanup()
    {

    //	Page.driver.quit();  // As per suggestion by shubham

/*        AutomationLog.endTestCase(executingTestCaseName);

        if (testCaseData != null)
            testCaseData.clear();
*/
    //    AppDriver.clearBrowserContext(Page.driver);
    }

    public void testcasePassed(String customMessage) 
    {
        AutomationLog.info(executingTestCaseName + " " + customMessage);
    }

    public void testcaseFailed(String customMessage) 
    {
       // AutomationLog.info(executingTestCaseName + " " + customMessage);
    	AutomationLog.info("Failed report to send = " + customMessage);
		//Quitting the driver and all pages
		AppDriver.clearBrowserContext(Page.driver);
    }    
}
