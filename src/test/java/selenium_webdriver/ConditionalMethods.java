package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed() this methods can be use for all type of web elements.
	//	WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	//	System.out.println("Display Logo is: "+ logo.isDisplayed());
		//OR
		//boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println("displayed logo is: " +status);

		//isEnabled() we can check enable/disable status of an element ... basically working or not
		//boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("First name is available : " +status);
		
		
		//isSelected() we can check web element is selected or not
		//boolean status = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		//System.out.println("checkbox is selected : " +status);
		
		/*System.out.println("Check Radio Button before selection...");
		boolean status = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected(); //false
		System.out.println("Male Radio button is selected : " + status);
		
		
		
		System.out.println("Check Radio Button after selection...");
		WebElement rd_male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		rd_male.click();
		boolean status1 = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected(); //false
		System.out.println("Male Radio button is selected : " + status1);
		*/
		
		// Browser Methods...  to close browser windows....		
		driver.getClass(); // it will be close only one window
		//driver.quit();  // This will be close all opened windows.
		
		
		
		
	}

}
