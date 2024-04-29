package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("This On Test Start");
		
	}
	
	public void onTestSucess(ITestResult result) {
		System.out.println("This On Test Succes");
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("This On Test Failure");
	
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("This On Test Skipped");
	
	}
	public void onFinish(ITestContext context) {
		System.out.println("This On Test Finish");
	
	}

}
