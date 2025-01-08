package Day29;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkAssignment {

	public static void main(String[] args) throws InterruptedException {
		// 1. Radio button and check boxes
		// 2. https://testautomationpractice.blogspt.com
		// 3. Click on login with out filling any field and handle the alert "https://mypage.rediff.com/login/dologin"
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://testautomationpractice.blogspot.com/");		
		driver.get("https://mypage.rediff.com/login/dologin");
		
		Thread.sleep(2000);
		
		/*
		List<WebElement> checkbox =  driver.findElements(By.xpath("//input[@type='checkbox']"));
					
		for(int i= 7; i<checkbox.size(); i++)
		{
						
			checkbox.get(i).click();
			System.out.println("Checkbox " + (i + 1) + " checked.");
			
		}
		*/
		
		// 3. Click on login with out filling any field and handle the alert "https://mypage.rediff.com/login/dologin"
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		// driver.switchTo().alert().accept();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		
	}

}
