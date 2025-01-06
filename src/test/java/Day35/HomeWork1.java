package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Double click and Drag and Drop 
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement clickbtn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		String msgtext = "Welcome in automation";
		
		field1.clear();
		field1.sendKeys(msgtext);
		
		Actions act = new Actions(driver);
		act.doubleClick(clickbtn).perform();
		
		// Validate field 1 and field 2 text.
		
		String txt2 ;
		//txt2 = field2.getText();
		txt2 = field2.getAttribute("value");
		
		if(txt2.equals(msgtext))
		{
			System.out.println("Message coppied successfully...");
			
		}
		else
			System.out.println("Message is not coppied...");
	

		
		// Drag and Drop 
		Thread.sleep(3000);
		try
		{
			WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
			
			System.out.println(target.getText());
			
			Actions drg = new Actions(driver);
		
			drg.dragAndDrop(src, target).perform();
		}
		catch(Exception e)
		{
			System.out.println("Error msg is "+ e.getMessage());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
