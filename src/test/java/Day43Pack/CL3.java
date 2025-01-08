package Day43Pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CL3 {
	@BeforeSuite
	void login()
	{
		System.out.println("BeforeSuite method are executed....");
	}
	

	@AfterSuite
	void search()
	{
		System.out.println("AfterSuite method are executed....");
		
	}
	
	

}
