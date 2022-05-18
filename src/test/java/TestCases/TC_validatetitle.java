package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.base;
import PageObjects.New_Cust_Reg;
import PageObjects.afterloginpage;
import PageObjects.loginpage;

public class TC_validatetitle extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void driveropen () throws IOException
	
	{
		driver = initializedriver ();
		
	}
	
	
	@AfterTest
	public void driverclose () throws IOException
	
	{
		driver.close();	
	}
	
	
	@Test(dataProvider = "datadrive")
	public void titletest (String userid, String password)
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(prop.getProperty("url"));
		loginpage a = new loginpage (driver);
		a.Userid().sendKeys(userid);
		a.Password().sendKeys(password);
		a.Loginclick().click();
		afterloginpage b = new afterloginpage (driver);
		
		New_Cust_Reg cl = b.NewCustlink();
		
		String title = cl.ValidateTitle().getText();
		
		Assert.assertEquals(title, "Add New Customer 123");
	
	
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
