package Day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB); // Switch and open a new tab
		
		driver.switchTo().newWindow(WindowType.WINDOW); // Switch in new window 
		
		driver.get("https://demo.nopcommerce.com/");

	}

}
