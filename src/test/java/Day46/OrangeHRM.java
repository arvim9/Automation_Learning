package Day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


// @Listeners(Day46.MyListener.class)  // also add listeners direct in java class.
public class OrangeHRM {
	
WebDriver driver;
	
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		// Launching browser by passing name from xml file.
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		Thread.sleep(5000);
	}
	
	
	@Test(priority= 1)
	void testLogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, false);
		
	}

	@Test(priority= 2)
	void title()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
		
	@Test(priority= 3, dependsOnMethods= "testLogo" )
	void getURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}


}
