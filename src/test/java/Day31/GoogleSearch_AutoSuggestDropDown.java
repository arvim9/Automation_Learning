package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // add implicit wait 
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium"); // enter the search text in the search box.
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		
		System.out.println("Total Number of options: "+options.size());
		for(WebElement op:options)
		{
			System.out.println(op.getText());
			if(op.getText().equals("selenium")||op.getText().equals("Selenium"))
			{
				op.click();
				break;
			}
		}
		

	}

}
