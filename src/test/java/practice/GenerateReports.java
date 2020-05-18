package practice;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateReports extends Base{
	
	
	@Test(priority = 1)
	public void enterText() {
		System.out.println("Runnning method one");
		Assert.assertEquals(true, true);
		Reporter.log("Passes due to assertion");
		
		//exttest.log(LogStatus.PASS, "This will appear in log : Running enterText");
	}
	
	@Test(priority = 2)
	public void clickSearch() {
		System.out.println("Runnning method two");
//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		Assert.assertNotEquals(false, true);
		Reporter.log("Passes due to assertion");
		//exttest.log(LogStatus.PASS, "This will appear in log : Running enterText");
	}
	
	@Test(priority = 3)
	public void openFirstLink() {
		System.out.println("Runnning method three");
//		driver.findElement(By.linkText("Software testing - Wikipedia")).click();
		Assert.assertTrue(true);
		Reporter.log("Passes due to assertion");
		//exttest.log(LogStatus.PASS, "This will appear in log : Running enterText");
	}
	
	@AfterSuite
	public void TearDown() {
		System.out.println("Running After Suite");
//		driver.quit();
		//extrep.endTest(exttest);
		//extrep.flush();
	}
	
}