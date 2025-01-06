package Day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		
		// Choose your departure city:
		 driver.findElement(By.xpath("//select[@name='fromPort']")).click();
		 List<WebElement> fromPort = driver.findElements(By.xpath("//select[@name='fromPort']//option"));
		 
		 for(WebElement op:fromPort)
		 {
			 if(op.getText().equals("Boston"))
			 {
				 op.click();
				 break;
			 }
			 
			 
		 }
		 //Choose your destination city:
		 driver.findElement(By.xpath("//select[@name='toPort']")).click();
		 List<WebElement> toPort = driver.findElements(By.xpath("//select[@name='toPort']//option"));
		 
		 for(WebElement op:toPort)
		 {
			 if(op.getText().equals("London"))
			 {
				 op.click();
				 break;
			 }
			 
		 }
		 
		 // Click on Find Flight button
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		
		 //Get all price value.		
		 
			List<WebElement> priceElements =  driver.findElements(By.xpath("//tr//td[6]"));
			
			
			// Store all price values in a list of integers
	        
			List<Float> prices = new ArrayList<>();
	        
	        for (WebElement element : priceElements)
	        {
	            String priceText = element.getText().replace("$", "").trim();	            
	            prices.add(Float.parseFloat(priceText));
	        }
		
		 
		 // Find the lowest price and click on flight booking button.
	        
	        float lowestPrice = Collections.min(prices);
	        System.out.println("Lowest price is: $" + lowestPrice);
		 
	     String lPrice = String.valueOf(lowestPrice);
	        
	        int rows = driver.findElements(By.xpath("//tr")).size();	        
	        for(float i = 2; i<rows; i++)
	        {
	        	String prc = driver.findElement(By.xpath("//table//tr["+i+"]//td[6]")).getText();
	        	if(prc.contains(lPrice))
	        	
	        	{
	        		driver.findElement(By.xpath("//tr["+i+"]//td[1]")).click();
	        		break;
	        	}
	        	
	        }
		 
		 
		 
		 // Fill all the field and submit the form.
		 
		 driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Mohan");
		 driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123, Tara Apartment");
		 driver.findElement(By.xpath("//input[@id='city']")).sendKeys("New Delhi");
		 driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New Delhi");
		 driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("110059");
		 driver.findElement(By.xpath("//div//select[@id='cardType']")).click();
		 driver.findElement(By.xpath("//div//select[@id='cardType']//option[2]")).click();
		 driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("1234 5678 8910 1112");
		 driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("10");
		 driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		 driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Mohan Kumar Awasthi");
		 driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		 driver.findElement(By.xpath("//input[@type='submit']")).click(); // Submitting the form.
		 
		 
		 // Validate the Thank you message.
		 
		String thankmessage =  driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
		boolean message =  driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).isDisplayed();
		if(thankmessage.equals("Thank you for your purchase today!"))
		{
			System.out.println("Confirmation message is displayed: "+message+", And message is : "+ thankmessage);
		}
		
		 //Thread.sleep(2000); 
		 driver.close();  
	}

}
