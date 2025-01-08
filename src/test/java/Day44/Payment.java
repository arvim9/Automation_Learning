package Day44;

import org.testng.annotations.Test;

public class Payment {
	
	@Test(priority=1, groups= {"sanity","regression", "Functional"})
	void paymentByCreditCard()
	{
		System.out.println("Payment by Credit Card...");
	}
	
	@Test(priority=2, groups= {"sanity","regression", "Functional"})
	void paymentByDabitCard()
	{
		System.out.println("Payment by Dabit Card...");
	}


}
