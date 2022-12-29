package capter_screen_shot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImplementations implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// after Class
	}

	@Override
	public void onStart(ITestContext arg0) {
		// Before Class
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}
	
	@Override
	public void onTestFailure(ITestResult arg0) {
		Reporter.log("katham bay bay, hogbutt bathiyaa", true);
		screen_shot.getPhoto(arg0.getMethod().getMethodName());
	}

	public void onTestSkippd(ITestResult arg0) {
       
	}
    public void onTestStar(ITestResult arg0)
    {
    		//Before method
    }
    public void ontestSuccess(ITestResult arg0)
    {
    	//After Method
    }
}
