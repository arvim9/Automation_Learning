package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkAssignment {

	public static void main(String[] args) throws InterruptedException {
		/*
		 *  Goto this url - https://ui.vision/demo/webtest/frames
		 *  switch frame 5
		 *  click on link - Open new Frame
		 *  Switch to inner iframe5
		 *  Get logo present in inner iframe or not		
		*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames");
		//Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		 // Switch to the outer frame (frame 5)
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        
     // Click on the "Open new Frame" link
       // WebElement openNewFrameLink = driver.findElement(By.xpath("//a[contains(text(),'Open new Frame')]"));
        //openNewFrameLink.click();
		
		driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
		
		
		// GETTING SOME ISSUE IN  BELOW CODE
				
     /* Switch to the inner frame
        WebDriver innerIframe =
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@allow='join-ad-interest-group']")));
       // driver.switchTo().frame(innerIframe);
        
        System.out.println("Driver switched to the inner iframe successfully." );
        
        // Check for the presence of the logo
        //WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")));
        //boolean status = logo.isDisplayed();
        boolean status = innerIframe.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software-Image-Driven Automation']")).isDisplayed();
        System.out.println("Logo is displayed status is: " + status);
		
		Thread.sleep(5000);
		
		driver.close();
		innerIframe.close(); */
		
		driver.get("https://ui.vision/");
		boolean logo = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		System.out.println("Logo is displayed status is: " + logo);
		
		
	}

}
