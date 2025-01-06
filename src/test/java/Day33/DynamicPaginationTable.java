package Day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int pages = driver.findElements(By.xpath("//ul[@class = 'pagination']//li")).size();
		
		for(int a = 1; a<= pages; a++)
		{
			driver.findElement(By.xpath("//ul[@class = 'pagination']//li["+a+"]")).click();
						
			int rows = driver.findElements(By.xpath("//table[@id ='productTable']//tr")).size();			
			for(int b = 1; b<rows; b++)
			{	
				// Capture all the required data from current open page.
				String names = driver.findElement(By.xpath("//table[@id= 'productTable']//tr["+b+"]//td[2]")).getText();				
				driver.findElement(By.xpath("//tbody/tr["+b+"]/td[4]/input[1]")).click();
				
				System.out.println(names +"\t" +"Checkbox clicked");
				Thread.sleep(1000);
			}
			
			
		}
		
		driver.close();

	}

}
