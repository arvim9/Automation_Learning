package Day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
		
	
	@Test()
	void loginTest()
	{
		//LoginPage lp = new LoginPage(driver);
		LoginPage2 lp = new LoginPage2(driver); 	// Using Page Factory model
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

	
	
}
