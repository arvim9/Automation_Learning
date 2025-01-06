package Day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[(contains(@class,'multiselect'))]")).click();
		
		
		// Select single check box
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		// Capture all the options and find the size.
		List<WebElement> option = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println("Total options is: " + option.size());
		
		
		/* printing the options of drop down lists
		for(int i =0; i<option.size(); i++)
		{
			System.out.println(option.get(i).getText());
		}
		
		// printing the options of drop down lists using enhance for loop
		for(WebElement op :option)
		{
			System.out.println(op.getText());
		}
		*/
		
		// Select multiple option using choices...
		
		for(WebElement op :option)
		{
			String opt = op.getText();
			if(opt.equals("Java")|| opt.equals("Python"))
				{
					op.click();
				}
				
		}

		Thread.sleep(5000);
		driver.close();
	}

}
