package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		// Mouse hover the particular option.
		
		act.moveToElement(desktop).moveToElement(mac).build().perform(); 
		
		// click on particular option.
		act.moveToElement(desktop).moveToElement(mac).click().build().perform(); 
		act.moveToElement(desktop).moveToElement(mac).perform(); // to perform the action immediately we can user direct perform action.
		
	}

}
