package practice;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	public static ExtentReports extrep;
	public static ExtentTest exttest;
	
//	exttest = extrep.startTest("GenrateReports");
	public Base(){
		extrep = new ExtentReports(System.getProperty("user.dir")+"//src//test//java//ExtentReport.html");;
	}
	
}
