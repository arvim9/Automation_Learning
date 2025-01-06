package Day42;

import org.testng.annotations.Test;

public class FirstTestCase 
{
	@Test(priority=1)
	void openApp() {
	    System.out.println("Open the application...!");
	}

	@Test(priority=2)
	void login() {
	    System.out.println("Login successful...");
	}

	@Test(priority=3)
	void logout() {
	    System.out.println("Logout from the application...");
	}

}
