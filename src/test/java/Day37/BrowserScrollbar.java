package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserScrollbar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		// 1) scroll down the page by pixel number
		//js.executeScript("window.scrollBy(0,1500)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		// 2) scroll down the page till element visible 
		/*
		//WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='News']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		*/
		
		// 3) scroll the page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		// 4) Come back to top again from bottom.
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
