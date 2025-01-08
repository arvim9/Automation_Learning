package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	
	@Test
	void testTitle()
	{
		
		String ecp_title = "OpenCart";
		String act_title = "OpenMart";
		
		/*
		 *
		if(ecp_title.equals(act_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		*/
		
		// Assert.assertEquals(ecp_title, act_title);
		
		if(ecp_title.equals(act_title))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
	}
}
