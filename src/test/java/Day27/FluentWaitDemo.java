package Day27;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	//Declaration of fluent wait...
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		
		
		// using the fluent wait...
				WebElement txtuser = mywait.until(new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver driver) 
					{	
						return driver.findElement(By.xpath("//input[@placeholder='Username']"));
					}
				});
		
		//txtuser.sendKeys("Admin"); 
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

}
