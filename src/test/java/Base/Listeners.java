package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends base implements ITestListener {

	extentreport a = new extentreport ();
	ExtentReports extent = a.getreport();
	ExtentTest test;
	ThreadLocal<ExtentTest> threadsafe = new ThreadLocal<ExtentTest> ();
	
	@Override
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());
		threadsafe.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		threadsafe.get().log(Status.PASS, "Test Sucessful");
	//test.log(Status.PASS, "Test Successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//test.fail(result.getThrowable());
		threadsafe.get().fail(result.getThrowable());
					WebDriver driver = null;
		
		String failedTCdriver = result.getMethod().getMethodName();
		
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {}
		
		
		try { 
			
			threadsafe.get().addScreenCaptureFromPath(screenshot (failedTCdriver, driver),failedTCdriver);
			//screenshot (failedTCdriver, driver); //passing that name to our SS method to execute based on that failed tc 
			
			
		} catch (IOException e) {}		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		}

	@Override
	public void onStart(ITestContext context) {
		}

	@Override
	public void onFinish(ITestContext context) {
		
	extent.flush();
	}

}
