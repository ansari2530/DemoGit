package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public static WebDriver driver;
	
	public static Properties prop;
	
	public WebDriver initializedriver () throws IOException
	
	{ 
		
		prop = new Properties ();
		
		FileInputStream fis = new FileInputStream ("C:\\Users\\Salman\\eclipse-workspace\\salman\\data.properties");
				
		prop.load(fis);
		
		String url = prop.getProperty("url");

		String browser = prop.getProperty("browser");
		//String browser = System.getProperty("browser");

				if (browser.contains("chrome"))
					
				{
					
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
					ChromeOptions options = new ChromeOptions ();
					 
					if (browser.contains("headless"))
						
					{
						options.addArguments("headless");
						
					}
					
					driver = new ChromeDriver (options);
					
					
					
					
				}
				
				
				
				else if (browser.equals("firefox"))
					
				{
					
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
					
					driver = new FirefoxDriver ();
					
				}
				
				
				
				else if (browser.equals("edge"))
					
				{
					
					System.setProperty("webdriver.msedge.driver", "C:\\Users\\edgedriver.exe");
					
					driver = new FirefoxDriver ();
					
				}
				
				
				
				return driver;
	}
	
	
	public String screenshot ( String failedTCdriver, WebDriver driver) throws IOException
	
	{
		TakesScreenshot ss = (TakesScreenshot)driver ;
	
		File src = ss.getScreenshotAs(OutputType.FILE);
		
		String destinationfile = System.getProperty("user.dir")+"\\reports\\"+failedTCdriver+".png";
		
		
		FileUtils.copyFile(src, new File(destinationfile));
		
		return destinationfile;
		
	}
	
	
	public void githubdemo1() 
	
	{
		
		System.out.println("example 1");
		System.out.println("example 1");
		
		System.out.println("modified by person 1");
		System.out.println("modified by person 1");
		System.out.println("modified by person 1");
		System.out.println("modified by person 2");
		System.out.println("modified by person 2");
		System.out.println("modified by person 2");
		
		
	}
	
	
public void githubdemo2() 
	
	{
		
		System.out.println("example 1");
		System.out.println("example 1");
		
		System.out.println("modified by person 1");
		System.out.println("modified by person 1");
		System.out.println("modified by person 1");
		System.out.println("modified by person 2");
		System.out.println("modified by person 2");
		System.out.println("modified by person 2 (child)");
		
		
	}
	
	
}
