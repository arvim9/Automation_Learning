package selenium_webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//System.out.println("Automation Testing...")		
		//ChromeDriver driver = new ChromeDriver();
		//Launch the browser.
		WebDriver driver = new ChromeDriver();
		// Open the url from browser.
		driver.get("https://demo.opencart.com");
		// Get the Title of webpage.
		String act_title = driver.getTitle();
		
		// Compare the title and print the result in console.
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// Close the browser.
		//driver.close();
		//driver.quit();

	}

}
