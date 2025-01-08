package Day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOutDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='125%'"); //set zoom level 125%
		
		js.executeScript("document.body.style.zoom='100%'"); //set zoom level 100% 

	}

}
