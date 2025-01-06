package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSLocators {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver(); // Launching the Chrome browser.		
		driver.manage().window().maximize();	// Maximize the browser.
		
		//driver.get("https://practice.automationtesting.in/");		
		driver.get("http://3.7.98.68/loginAsUser/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYzMTE4YThhNDNlMzc5M2NlOTZhNmQ2YSIsIm5hbWUiOiJzdW5kZXIgc2luZ2giLCJlbWFpbCI6InN1bmRlci5zaW5naDIxQG1haWxpbmF0b3IuY29tIiwicm9sZSI6IndmYyIsInNhYXNfcGFyZW50X2lkIjoiNjMxMThhOGE0M2UzNzkzY2U5NmE2ZDZhIiwic2Fhc19hbGlhcyI6InRlc3RzIiwic3luZGljYXRvcl90eXBlIjoicHVibGljIiwiYWRtaW5Vc2VySWQiOiI2MmE4MThjMGEwYzU5NzY2NGEyY2IxMDQiLCJ0b2tlbkdlbmVyYXRlZEZyb20iOiJrZXkiLCJpYXQiOjE3Mjk1ODMxMjA5MTgsImV4cCI6MTcyOTYxNDY3Nzg0NH0.JtaygCp_m8d1JCJ3vmanMvWnpbZU83QBQqlIXOby_fs");	
		
		// tag id 		[tag]#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");		
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts"); 
		//driver.findElement(By.cssSelector(""));
		
		// Tag class		tag.class
		//driver.findElement(By.cssSelector("button.btn btn-primary")).clear();
		//driver.findElement(By.cssSelector(".search-box-text"));
		
				
		
	}

}
