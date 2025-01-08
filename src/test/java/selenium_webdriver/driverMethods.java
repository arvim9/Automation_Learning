package selenium_webdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // Launching the Chrome browser.		
		
		driver.manage().window().maximize();	// Maximize the browser.
		
		//driver.get("https://practice.automationtesting.in/");	// open the url in browser.
		
		driver.get("http://3.7.98.68/loginAsUser/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYzMTE4YThhNDNlMzc5M2NlOTZhNmQ2YSIsIm5hbWUiOiJzdW5kZXIgc2luZ2giLCJlbWFpbCI6InN1bmRlci5zaW5naDIxQG1haWxpbmF0b3IuY29tIiwicm9sZSI6IndmYyIsInNhYXNfcGFyZW50X2lkIjoiNjMxMThhOGE0M2UzNzkzY2U5NmE2ZDZhIiwic2Fhc19hbGlhcyI6InRlc3RzIiwic3luZGljYXRvcl90eXBlIjoicHVibGljIiwiYWRtaW5Vc2VySWQiOiI2MmE4MThjMGEwYzU5NzY2NGEyY2IxMDQiLCJ0b2tlbkdlbmVyYXRlZEZyb20iOiJrZXkiLCJpYXQiOjE3Mjk1ODMxMjA5MTgsImV4cCI6MTcyOTYxNDY3Nzg0NH0.JtaygCp_m8d1JCJ3vmanMvWnpbZU83QBQqlIXOby_fs");	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("fade modal-backdrop show")));
		modal.click();
		
		/*WebElement saveButton = modal.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/button"));
		saveButton.click();
		
		// Get Title of the open page.
		String title = driver.getTitle();
		System.out.println(title);
		//or
		System.out.println(driver.getTitle());
		
		// Get current urls.
		
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		//or
		System.out.println(driver.getCurrentUrl());
		
		// Get page source
		/*String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
		//or
		System.out.println(driver.getPageSource());
		
		
		
		// Get Window Handle 
		
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		//or
		System.out.println("Window ID: " + driver.getWindowHandle());
		*/
		
		//Get Multiple window handles
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-linkedin']")).click();;
		Thread.sleep(1000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

	}

}
