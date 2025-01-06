package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to keyboard action");
		
		// ctrl+A Select all 		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		// ctrl + C Copy the text into clip board
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		// TAB  shift cursor into second box.
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// ctrl + V  paste the value in second box.
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
	 	/* // ctrl+shift+A 
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
		// Press ENTER key
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		*/
		
		Thread.sleep(5000);
		driver.close();
	}

}
