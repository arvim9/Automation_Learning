package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Select Specific Check Box
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// Select All check Box
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
	/*	for(int i = 0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		} */
		
		
		// Enhance for loop
		/*
		for(WebElement chb:checkboxes)
		{
			chb.click();
		} 
		
		// Select Last 3 check Boxes
		
		for(int i = 4; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		
		*/
		// Select first 3 check boxes
		for(int i = 0; i<3; i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		// Unselected check boxes if they are selected.
		for(int i = 0; i<checkboxes.size(); i++)
		{
			
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
	}

}
