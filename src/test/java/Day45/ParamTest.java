package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeClass
	void setup(String br, String url) throws InterruptedException
	{
		// Launching browser by passing name from xml file.
		
		switch(br.toLowerCase())
		{
		case "chrome": driver= new ChromeDriver(); break;
		case "edge": driver= new EdgeDriver(); break;
		case "firefox": driver= new FirefoxDriver(); break;
		default: System.out.println("Passing invalid browser name..."); return;
		}
			
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@Test()
	void testLogo()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		Assert.assertEquals(status, true);
		
	}

	@Test
	void title()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
		
	@Test
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
