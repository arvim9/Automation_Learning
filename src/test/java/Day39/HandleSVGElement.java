package Day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSVGElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		// Login the page
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// abs xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/*[name()='svg'][1]")).click();
	
		
		// rel xpath
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();
		
		//identify svg element
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//*[name()='svg']")).click();
	}

}
