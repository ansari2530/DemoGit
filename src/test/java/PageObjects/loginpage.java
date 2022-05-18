package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage (WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = "//input[@type=\"text\"]")
	WebElement userid;
	
	
	@FindBy (xpath = "//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy (xpath = "//input[@type=\"submit\"]")
	WebElement loginclick;
	
	

	
	
	
	public WebElement Userid ()
	{
		
		return userid;
		
	}
	
	
	public WebElement Password ()
	{
		
		return password;
		
	}
	
	
	public WebElement Loginclick ()
	{
		
		return loginclick;
		
	}
	
	
	

}
