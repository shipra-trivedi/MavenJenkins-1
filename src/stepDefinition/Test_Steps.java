package stepDefinition;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	String binaryPath = System.getProperty("user.dir")+ File.separator + "src" +  File.separator + "test" + File.separator + "java" + File.separator  + "libs" + File.separator  + "DriverBinaries" + File.separator +  "geckodriver.exe";
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    //System.out.println(binaryPath);
		System.setProperty("webdriver.gecko.driver",binaryPath);
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.store.demoqa.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
		driver.findElement(By.id("log")).sendKeys(username); 	 
	    driver.findElement(By.id("pwd")).sendKeys(password);
	    driver.findElement(By.id("login")).click();
	}
	
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(DataTable usercredentials) throws Throwable {
 
		//Write the code to handle Data Table
		List<List<String>> data = usercredentials.raw();
		System.out.println("DataTable"+data.get(0).get(0));
		System.out.println("DataTable2"+data.get(0).get(1));
		System.out.println("DataTable3"+data.get(0).get(2));

		//This is to get the first data of the set (First Row + First Column)
		driver.findElement(By.id("log")).sendKeys(data.get(0).get(0)); 
 
		//This is to get the first data of the set (First Row + Second Column)
	    driver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
 
	    driver.findElement(By.id("login")).click();
	}
	
/*	@When("^User enters Credentials to LogIns$")
	public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {
		 
		//Write the code to handle Data Table
		for (Credentials credentials : usercredentials) {			
			driver.findElement(By.id("log")).sendKeys(credentials.getUsername()); 
		    driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
		    driver.findElement(By.id("login")).click();
			}		
	}*/

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		//driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		//genrateReports();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
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