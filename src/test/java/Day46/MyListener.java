package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void onStart(ITestContext context) {
	    System.out.println("On Started...");
	  }
	
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Started Execution...");
	  }
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Mrthod Successful...");
	  }
	
	public void onTestFailure(ITestResult result) {

		System.out.println("Failed Test Method...");
	  }
	
	public void onTestSkipped(ITestResult result) {

		System.out.println("Skipped test method...");
	  }
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Started Execution...");
	  }
	
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }
	
		
	public void onFinish(ITestContext context) {
	    
		System.out.println("Finished Execution...");
	  }

}
