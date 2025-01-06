package Day43Pack;


import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class CL1 {

	
	
	@AfterTest
	void logout()
	{
		System.out.println("User is logged out successfully...");
	}
	
	
	@Test
	void advSearch()
	{
		System.out.println("Advance search method is executed....");
	}
}
