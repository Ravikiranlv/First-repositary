package Before_annotation_method;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class configuration_annotation {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("From the Before Suite", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("From the Before Test", true);
	}

	@BeforeClass
	public void beforeclass() {			
		Reporter.log("From the Before Class", true);
	}

	@BeforeMethod
	public void beforemethod() {
		Reporter.log("From the Before Method", true);
	}

	@AfterMethod
	public void aftermethod() {
		Reporter.log("From the After Method", true);
	}

	@AfterClass
	public void afterclass() {
		Reporter.log("From the After Class", true);
	}

	@AfterTest
	public void aftertest() {
		Reporter.log("From the After Test", true);
	}

	@AfterSuite
	public void aftersuite() {
		Reporter.log("From the After suite", true);
	}
}
