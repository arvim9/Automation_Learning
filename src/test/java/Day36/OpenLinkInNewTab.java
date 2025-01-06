package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		// Normal Click on RegLink		
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		//regLink.click();

		//Second Ways
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		// Switch driver on second windows tab
		List<String> ids = new ArrayList<String>(driver.getWindowHandles());
		
		// Switch to second tab
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Raman Raj");
		
		// Get back on home tab
		driver.switchTo().window(ids.get(0));		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Rose Flower");
		
		
	}

}
