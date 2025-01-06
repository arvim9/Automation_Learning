package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Explicit wait declarition.
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); // Capture alert.
		System.out.println(myalert.getText());
		myalert.accept();

	}

}
