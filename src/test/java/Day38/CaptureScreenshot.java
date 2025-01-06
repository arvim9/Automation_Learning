package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://demo.nopcommerce.com/");
		/*
		//1) Take Full page Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver; // get screen shot
		File pagess = ts.getScreenshotAs(OutputType.FILE);	
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");		
		pagess.renameTo(targetfile); // copy ss from pagess to targetfile location
		
		
		//2) Take Screenshot of the specific section.\\		
		WebElement sourcefile = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File pagess = sourcefile.getScreenshotAs(OutputType.FILE);	
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\featuredProduct.png");		
		pagess.renameTo(targetfile); // copy ss from pagess to targetfile location
		
		*/
		
		//3) Take screenshot of the web element.
		WebElement sourcefile = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File pagess = sourcefile.getScreenshotAs(OutputType.FILE);	
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");		
		pagess.renameTo(targetfile); // copy ss from pagess to targetfile location
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
