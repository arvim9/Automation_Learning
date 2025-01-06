package Day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkPractice {

	public static void main(String[] args) throws InterruptedException {
		// Open an url = "https://testautomationpractice.blogspot.com/"
		// Provide some string and search
		// Count total available links,
		// Click on each link using for loop
		// Get window id's for every browser window.
		// Close specific browser window.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open the URL in browser.
		driver.get("https://testautomationpractice.blogspot.com/"); 
		System.out.println("Open this URL in browser: " + driver.getCurrentUrl());
		
		
		// Search the value...
		String searchtxt =  "Automation";
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys(searchtxt); 
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(Duration.ofSeconds(3));
		System.out.println("Searching the text: " + searchtxt);
		
		// Count the total links...
		List<WebElement> link = driver.findElements(By.partialLinkText("Automation"));
		System.out.println("Tota Link count is: " +  link.size());
		
		// Click on each link using for loop.
		for(int i = 0;i<link.size(); i++)
		{
			link.get(i).click();
			System.out.println("Open link is: " +  link.get(i).getText());
		}
		
		// Get window id's for every browser window.
		Set<String> winid = driver.getWindowHandles();
		for(String str:winid)
		{
			System.out.println("Window id is: " + str);
		}
			
		// Close specific browser window.		
		for(String wid:winid)
		{
		String title = driver.switchTo().window(wid).getTitle();
		 
		 if(title.equals("Automation Master - Wikipedia")||(title.equals("Automation (video game) - Wikipedia")))
		 {
			 driver.close();
			 System.out.println("Closing window title: " + title);
		 } 
		 
		 
		} 
		

	}

}
