package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Cust_Reg {
	
   public WebDriver driver;

   public New_Cust_Reg (WebDriver driver)
	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
   @FindBy (xpath = "//input[@name='name']")
   WebElement customername;
   
 
   @FindBy (xpath = "//input[@name=\"rad1\"]")
   WebElement gender;
   
   @FindBy (id = "dob")
   WebElement DOB;
   

   
   @FindBy (xpath = "//textarea[@name=\"addr\"]")
   WebElement address;
   
 
   @FindBy (xpath = "//input[@name=\"city\"]")
   WebElement city;
   
   
   @FindBy (xpath = "//input[@name=\"state\"]")
   WebElement state;
   
   @FindBy (xpath = "//input[@name=\"pinno\"]")
   WebElement pin;
   
   @FindBy (xpath = "//input[@name=\"telephoneno\"]")
   WebElement phoneno;
   
   
   @FindBy (xpath = "//input[@name=\"emailid\"]")
   WebElement email;
   

   
   @FindBy (xpath = " //input[@type=\"submit\"]")
   WebElement submit;
   
   
   @FindBy (xpath = "//p[text()='Add New Customer']")
	WebElement title;
   
   
   
   public WebElement fillcustname ()
   
   {
	   return customername;
   }
   
   
 public WebElement fillgender ()
   
   {
	   return customername;
   }
   
 public WebElement filldob ()
 
 {
	   return DOB;
	  
 }
 
 
 public WebElement filladdress ()
 
 {
	   return address;
 }
 
 
 public WebElement fillcity ()
 
 {
	   return city;
 }
 
 
 public WebElement fillstate ()
 
 {
	   return state;
 }
 
 
 public WebElement fillpin ()
 
 {
	   return pin;
 }
 
 
 public WebElement fillphoneno ()
 
 {
	   return phoneno;
 }
 
 
 public WebElement clicksubmit()
 
 {
	   return submit;
 }
 
 
public WebElement fillemail()
 
 {
	   return email;
 }
 

public WebElement ValidateTitle ()
{
	return title;
}

   
   
}
