package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();
		ops.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		//driver.get("https://www.invstt.com");
		
		
		System.out.println("Title of the page: "+driver.getTitle());

	}

}
