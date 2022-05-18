package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class afterloginpage{
	
	public WebDriver driver;
	
	public afterloginpage (WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath = "//a[text()='New Customer']")
	WebElement newcustomer;
	
	

	@FindBy (linkText = "New Account")
	WebElement newaccount;
	
	
	
	
	
	
	
	public New_Cust_Reg NewCustlink ()
	{
		newcustomer.click();
		New_Cust_Reg a = new New_Cust_Reg (driver);
		return a;
	}
	
	
	

}
