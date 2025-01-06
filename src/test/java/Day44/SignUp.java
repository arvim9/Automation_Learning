package Day44;

import org.testng.annotations.Test;

public class SignUp {
	

	@Test(priority=1, groups= {"regression"})
	void signUpByEmail()
	{
		System.out.println("SignUp by Email");
	}


	@Test(priority=2, groups= {"regression"})
	void signUpByFacebook()
	{
		System.out.println("SignUp by Facebook");
	}
	

	@Test(priority=3, groups= {"regression"})
	void signUpByTwitter()
	{
		System.out.println("SignUp by Twitter");
	}
	
}
