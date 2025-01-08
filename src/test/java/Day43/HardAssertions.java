package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	
	@Test
	void test()
	{
		// Assert.assertEquals("Rajesh", "Rajesh");
		//Assert.assertEquals("Rajesh", "12345");
		//Assert.assertEquals("Rajesh", 12345);
		//Assert.assertEquals(1234, "Rajesh");
		//Assert.assertEquals("123", 123);
		
		// Assert.assertNotEquals(123, 123); // Failed
		//Assert.assertNotEquals(123, 345); // True
		
		//Assert.assertTrue(true); // True
		//Assert.assertTrue(false); //false
		
		Assert.assertTrue(1==1); // Passed
		Assert.assertTrue(1==2); // Failed
		
		
		Assert.assertFalse(true); // Failed
		Assert.assertFalse(false); // Passed
		
		Assert.assertFalse(1==2); // Passed
		Assert.assertFalse(1==1); // Failed
		
		Assert.fail();  // Always Failed
		
		
	}

}
