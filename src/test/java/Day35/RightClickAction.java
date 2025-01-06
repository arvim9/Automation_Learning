package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//contextClick(element).perform(); // To Right Click Action
		// First Method...
		/*WebElement we = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(we).perform(); // To right click option.
		*/
		
		// Second Method 
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).perform(); //to right click option
		
		
		// Click an option.
		driver.findElement(By.xpath("//ul[@class = 'context-menu-list context-menu-root']//li[3]")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
