package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Logged In successfully in application...");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("User is logged out successfully...");
	}
	
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search method executed....");
		
	}
	
	@Test(priority=2)
	void advSearch()
	{
		System.out.println("Advance search method is executed....");
	}
	
	
	
	
	

}
