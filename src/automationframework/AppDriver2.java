package automationframework;
/**
 * @author Shubham Jain
 *
 */

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Page;

public class AppDriver2 {
	private static String OSNAMES = System.getProperty("os.name").toLowerCase();
	private static final String FIREFOX = "MFF";
	private static final String CHROME = "GC";
	private static final String PhantomJS = "HL";

	static String binaryPath = System.getProperty("user.dir")+ File.separator + "src" +  File.separator + "test" + File.separator + "java" + File.separator  + "libs" + File.separator  + "DriverBinaries" + File.separator +  "geckodriver.exe";
	
	public static WebDriver getDriver(String browserToUse) {
/*		System.setProperty("webdriver.gecko.driver",binaryPath);
		WebDriver driver= new FirefoxDriver();	*/
		System.out.println(System.getProperty("user.dir")+ File.separator + "src" +  File.separator + "test" + File.separator + "java" + File.separator  + "libs" + File.separator  + "DriverBinaries" + File.separator + "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ File.separator + "src" +  File.separator + "test" + File.separator + "java" + File.separator  + "libs" + File.separator  + "DriverBinaries" + File.separator + "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.store.demoqa.com");
		return driver;
	  }
	}

