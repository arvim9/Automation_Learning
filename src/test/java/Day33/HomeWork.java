package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Login HRM site
		
		WebElement userName  = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.clear();
		userName.sendKeys("Admin");
		WebElement pass  = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.clear();
		pass.sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Login Successful.");
		
		//Click on 		
		driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
		
		int row = driver.findElements(By.xpath("//div[@role='table']//div[@role='row']")).size();
		System.out.println("Total rows count is: "+row);
		
		// Get all rows User Name and there Role
		for(int i = 1; i<row; i++)
		{
			
			String name =  driver.findElement(By.xpath("//div[@role='rowgroup']//div["+i+"]//div[1]//div[2]//div[1]")).getText();
			String role = driver.findElement(By.xpath("//div[@role='rowgroup']//div["+i+"]//div[1]//div[3]//div[1]")).getText();
			
			System.out.println("Name is: "+name +"\t" + "and role is: "+role);
			
			driver.findElement(By.xpath("//div[@role='rowgroup']//div["+i+"]//div[1]//div[1]//div[1]")).click();
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
