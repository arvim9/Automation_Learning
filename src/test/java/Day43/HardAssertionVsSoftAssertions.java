package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionVsSoftAssertions {
	
	
	
	// Hard Assertion...
	
//	@Test
	void test_hardAssertions()
	{
		System.out.println("Line number 1");
		System.out.println("Line number 2");
		
		Assert.assertEquals(1,2);
		
		System.out.println("Line number 3");
		System.out.println("Line number 4");
	}
	
	
	@Test
	void test_softAssertions()
	{
		System.out.println("Line number 1");
		System.out.println("Line number 2");
		
		SoftAssert as = new SoftAssert();		// Need to create an object first....rest all methods are the same as hard assertion...
		as.assertEquals(1,2);
		
		System.out.println("Line number 3");
		System.out.println("Line number 4");
		
		as.assertAll();			// This method is compulsory to add at the end of method code as last line.... to show the method execution status.
		
	}

}
