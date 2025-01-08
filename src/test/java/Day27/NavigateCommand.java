package Day27;

import java.net.URL;
import java.time.Duration;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	driver.get("https://demo.nopcommerce.com/");  // this method accept url only string format.
		
		// this method can be accept url in string and object format both.
		//driver.navigate().to("https://demo.nopcommerce.com/");
		
		//URL myurl = new URL("https://demo.nopcommerce.com/");
		//driver.navigate().to(myurl);
		
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().refresh();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
