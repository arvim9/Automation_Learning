package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
			
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pass) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if (status == true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);			
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDemo()
	{
		driver.close();
	}
	
	
	@DataProvider(name="dp", indices= {0,3,2}) /// indices paramete is used for providing specific values....
	Object[][] loginData()
	{
		// Taking Object type because data can be in multiple format like string and integer etc....
		Object data[][] = {
				{"abcd@gmail.com","test@123"},
				{"xyz@yopmail.com","test@123"},
				{"onlytestmail22@gmail.com","Testing@123"},
				{"test123@gmail.com","Pass@123"}			
				
		};
		return data;
		
	}
	
}
