package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Base.base;
import PageObjects.New_Cust_Reg;
import PageObjects.afterloginpage;
import PageObjects.loginpage;

public class TC_New_Cust_Pg extends base {
	
public WebDriver driver ;

public static Logger log = LogManager.getLogger(base.class.getName());

	
	@BeforeTest
	public void driveropen () throws IOException
	
	{
		driver = initializedriver ();
		log.info("driver invoked successfully");
	}

	
	@AfterTest
	public void driverclose () throws IOException
	
	{
		driver.close();	
		log.info("driver closed successfully");

	}
	
	
	
	
	
	@Parameters({"URL", "URL2"})
	@Test(invocationCount=2)
	public void registeration (String id, String pass)
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(prop.getProperty("url"));
		log.info("url invoked successfully");

		
		loginpage a = new loginpage (driver);
		a.Userid().sendKeys(id);
		a.Password().sendKeys(pass);
		a.Loginclick().click();
		log.info("Logged In successfully");

		
		afterloginpage b = new afterloginpage (driver);
		New_Cust_Reg cl = b.NewCustlink();
		
		
		cl.fillcustname().sendKeys(id);
		cl.fillgender().click();
		cl.filladdress().sendKeys("Mumbai Maharashtra");
		cl.fillcity().sendKeys("Mumbai");
		cl.fillstate().sendKeys("maharash");
		cl.fillpin().sendKeys("1234");
		cl.fillphoneno().sendKeys("1234567890");
		cl.fillemail().sendKeys("salman@gmail.com");
		cl.clicksubmit().click();
		log.info("New User Created successfully");

		
		
		driver.switchTo().alert().accept();
	}
	

	
	
	
}
