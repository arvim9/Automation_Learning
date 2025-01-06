package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HSliderDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		
		// Min Slider
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("default min value is: " + min_slider.getLocation());
		
		try
		{
			act.dragAndDropBy(min_slider, 100, 249).perform();
			System.out.println("After change new min value is: " + min_slider.getLocation());
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong "+ e.getMessage());
		}
		
		// Min Slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("default min value is: " + max_slider.getLocation());
		
		try
		{
			act.dragAndDropBy(max_slider,-100,249).perform();
			System.out.println("After change new max value is: " + max_slider.getLocation());
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong "+ e.getMessage());
		}
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
