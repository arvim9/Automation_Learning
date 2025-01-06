package Day43;

import org.testng.annotations.*;
public class AllAnnotations {
	
	@BeforeSuite
	void Bst()
	{
		System.out.println("BeforeSuite method are executed....");
	}
	
	@AfterSuite
	void Ast()
	{
		System.out.println("AfterSuite method are executed....");
	}
	
	@BeforeTest
	void Bt()
	{
		System.out.println("Before Test Method executed...");
	}
	
	@AfterTest
	void At()
	{
		System.out.println("After Test Method executed...");
	}
	
	@BeforeClass
	void Bcl()
	{
		System.out.println("Before Class Method executed...");
	}
	
	@AfterClass
	void Acl()
	{
		System.out.println("After Class Method executed...");
	}
		
	@BeforeMethod
	void Bmt()
	{
		System.out.println("BeforeMethod executed...");
	}
	
	@AfterMethod
	void Amt()
	{
		System.out.println("AfterMethod executed...");
	}
	
	
	@Test
	void Search()
	{
		System.out.println("Main method executed....");
	
	}
	
	

}
