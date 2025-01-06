package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions act = new Actions(driver);
		
		WebElement src_bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement trgt_bank = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		act.dragAndDrop(src_bank, trgt_bank).perform();
		
		WebElement src_amt = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement trgt_amt = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		act.dragAndDrop(src_amt, trgt_amt).perform();
		
		Thread.sleep(5000);
		
		WebElement src_sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement trgt_sales = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		act.dragAndDrop(src_sales, trgt_sales).perform();
		
		WebElement src_sale_amt = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement trgt_sale_amt = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		act.dragAndDrop(src_sale_amt, trgt_sale_amt).perform();
		//act.dragAndDrop(src_amt, trgt_amt).perform();
		
		// Confirmation 
		String msg = driver.findElement(By.xpath("//div[@class='table4_result']//a")).getAttribute("text");
		//System.out.println(""+msg);
		
		if(msg.equals("Perfect!"));
		{
			System.out.println("Everything is ok..."+ msg);
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
