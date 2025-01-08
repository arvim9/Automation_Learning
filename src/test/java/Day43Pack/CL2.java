package Day43Pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CL2 {

	@BeforeTest
	void login()
	{
		System.out.println("Logged In successfully in application...");
	}
	

	@Test
	void search()
	{
		System.out.println("Search method executed....");
		
	}
	
	
}