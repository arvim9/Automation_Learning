package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo1 {
	
	@BeforeClass
	void login()
	{
		System.out.println("Logged In successfully in application...");
	}
	
	@AfterClass
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
