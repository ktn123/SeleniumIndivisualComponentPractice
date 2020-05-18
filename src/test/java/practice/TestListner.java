package practice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestListner extends Base implements ITestListener{
	
	public void onStart(ITestResult arg0) {
//		extrep = new ExtentReports(System.getProperty("user.dir")+"//src//test//java//ExtentReport.html");
		
	}
	
	public void onTestSuccess(ITestResult arg0) {
		exttest = extrep.startTest(arg0.getName());
		exttest.log(LogStatus.PASS, "TestPass. TestName :"+arg0.getName());
		extrep.endTest(exttest);
		extrep.flush();
	}
	
}
