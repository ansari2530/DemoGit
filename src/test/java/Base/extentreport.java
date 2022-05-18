package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreport {

	public ExtentReports getreport () 
	
	{
		String path = System.getProperty("user.dir")+"//htmlreports//report";
		
		ExtentSparkReporter report = new ExtentSparkReporter (path);
		
		report.config().setReportName("Automation Report");
		report.config().setDocumentTitle("End to End Testing");
		
		ExtentReports extent = new ExtentReports ();
		
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Salman");
		return extent;

	}
	
	
}
