package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btnclick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//Clear the box and put a new word.
		box1.clear();
		box1.sendKeys("Welcome");
		
		//Double click action on the button  
		// doubleClick(element)
		
		Actions act = new Actions(driver);
		act.doubleClick(btnclick).perform();
		
		// Validate box1 text with box2 text --- it should be equals.
		String txt2 = box2.getAttribute("value");
		
		if(txt2.equals("Welcome"))
		{
			System.out.println("Text copied successfully...");
		}
		else
		{
			System.out.println("Text is not copied properly...");
		}
		
		//Thread.sleep(3000);
		
		driver.close();

	}

}
