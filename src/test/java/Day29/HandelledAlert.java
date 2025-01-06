package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelledAlert {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Normal alert with OK button
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		// Confirmation Alert with OK and Cancel Button
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.dismiss();
		*/
		
		// Confirmation Prompt Alert.
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.sendKeys("Welcome");
		//Thread.sleep(3000);
		myalert.accept();
	}

}
