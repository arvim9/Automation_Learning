package Day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("http://www.deadlinkcity.com/");
		driver.get("https://www.neurointeractive.com/");	
		
		// Capture all the link from website page
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+alllinks.size());
		int brokenlinks = 0;
		
		for(WebElement links:alllinks)
		{
			//get href attribute value...
			
			String value = links.getAttribute("href");
			
			if(value == null || value.isEmpty())
			{
				System.out.println("Href value is null or empty. Not possible to check.");
				continue;
			}
			
			try
			{
			URL linkurl = new URL(value);
			HttpURLConnection cnn = (HttpURLConnection)linkurl.openConnection();
			cnn.connect();
			
			if(cnn.getResponseCode() >= 400)
			{
				System.out.println(value + " - Found Broken link");
				brokenlinks++;
			}
			else
			{
				System.out.println(value + " - Not Found Broken link");
			}
			} 
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Total no of broken links:  "+brokenlinks);

	}

}
