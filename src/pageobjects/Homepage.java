package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Homepage extends Page 
{
    public Homepage(WebDriver driver)
    {
        super(driver);
    }

    public Homepage() {
    	super(driver);
	}

	public String homepageUrl()
    {
        return applicationUrl() + "/home/";
    }

    public static Homepage homePage()
    {
        return PageFactory.initElements(driver, Homepage.class);
    }

    public By getHomepageGreetingsLocator()
    {
		return null;
        
    }

   
}
