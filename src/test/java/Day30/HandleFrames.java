package Day30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames");
		Thread.sleep(3000);
		
		//Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']")); 		
		driver.switchTo().frame(frame1); //Move on Frame 1 section. //Passed frame as a web element.		
		//System.out.println(" Entered Frame 1");
		driver.findElement(By.xpath("//input[@name = 'mytext1']")).sendKeys("Welcome");		
		driver.switchTo().defaultContent(); // Go back at main page.
		
		
		// Frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']")); 		
		driver.switchTo().frame(frame2); //Move on Frame 1 section. //Passed frame as a web element.		
		//System.out.println(" Entered Frame 1");
		driver.findElement(By.xpath("//input[@name = 'mytext2']")).sendKeys("Selenium");		
		driver.switchTo().defaultContent(); // Go back at main page.
		
		
		// Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']")); 		
		driver.switchTo().frame(frame3); //Move on Frame 1 section. //Passed frame as a web element.		
		//System.out.println(" Entered Frame 1");
		
		driver.findElement(By.xpath("//input[@name = 'mytext3']")).sendKeys("Java");
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		
		WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rdbutton);
		
		driver.switchTo().defaultContent(); // Go back at main page.
		
		
		/*
		  driver.switchTo().frame("name");
		  driver.switchTo().frame("id");
		  driver.switchTo().frame("WebElement");
		  driver.switchTo().frame("index");
		  driver.switchTo().defaultContent();
		 
			3 type of switching methods
			------------
			1) Browser Windows
				driver.switchTo().window(windowID/window Handle)
			2) Alert
				driver.switchTo().alert();
				driver.switchTo().accept();
				driver.switchTo().dismiss();
				
			3) Frames
				driver.switchTo().frame(id);
				driver.switchTo().frame(name);
				driver.switchTo().frame("WebElement");
				driver.switchTo().frame("index");
		 */

	}

}
