package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
		// Learning about the dependency methods.
		
		
	@Test(priority=1)
	void openApp()
		{
			System.out.println("Open the app ...");
			Assert.assertTrue(true);
		}

	@Test(priority=2, dependsOnMethods= {"openApp"})
	void loginApp()
		{
			System.out.println("login in the app ...");
			Assert.assertTrue(false);
		}

	@Test(priority=3, dependsOnMethods= {"openApp"})
	void Search()
		{
			System.out.println("Search is executed ...");
			Assert.assertTrue(true);
		}
	
	@Test(priority=4, dependsOnMethods= {"loginApp","openApp"})
	void AdvSearch()
		{
			System.out.println("AdvSearch executed ...");
		}
}
