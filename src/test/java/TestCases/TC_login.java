package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.base;
import PageObjects.loginpage;

public class TC_login extends base {

	WebDriver driver ;
	
	@BeforeTest
	public void driveropen () throws IOException
	
	{
		driver = initializedriver ();
		
	}
	
	
	@Test(dataProvider = "datadrive")
	public void logintest (String userid, String password)
	
	{
		driver.get(prop.getProperty("url"));
		loginpage a = new loginpage (driver);
		a.Userid().sendKeys(userid);
		a.Password().sendKeys(password);
		a.Loginclick().click();
	
//		driver.switchTo().alert().accept();
	
		
//	
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//	      //alertIsPresent() condition applied
//	      if(w.until(ExpectedConditions.alertIsPresent())==null)
//	      {
//	      System.out.println("Alert not exists");
//	      }
//	      else
//	      {
//	  		driver.switchTo().alert().accept();
//	      }
//		
	}
	
	
	
	@AfterTest
	public void driverclose () throws IOException
	
	{
		driver.close();	
	}
	
	
	@DataProvider
	public Object[][] datadrive ()
	{
		Object[][] data = new Object[1][2];
		
		data [0][0] = "mngr398720";
		data [0][1] = "sYmUqYm";
		

//		data [1][0] = "salman";
//		data [1][1] = "salman";
//		
		return data;
	}
	
	
	
}
