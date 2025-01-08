package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		// open this site "https://www/bjs.com" 
		// enter search text in the serch box 
		// capture all auto suggest options and print them and click on one of them/
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.bjs.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("");
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class=\"list-item list-group-item\"]"));
		
		for(WebElement op:options)
		{
			System.out.println("Selected option is: "+op.getText());
			if(op.getText().equals("eggs") || op.getText().equals("water"))
				op.click();
			break;
		}

	}

}
