package Day34;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	static void selectFutureDate(WebDriver driver, String year, String month, String day)
	{
		while(true)
		{			
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
				
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Click on next btn
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']//tbody//tr//td"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
				
			}
		}
	}
	
	static void selectPastDate(WebDriver driver, String year, String month, String day)
	{
		while(true)
		{			
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
				
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Click on next btn
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']//tbody//tr//td"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
				
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		//Method 1 using sendKeys()
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/11/2024");
		
		// Method 2 using date picker
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year ="2023";
		String month = "June";
		String day = "17";
		
		/*LocalDate currentDate = LocalDate.now();
		
		int curr_year = currentDate.getYear();
        int curr_month = currentDate.getMonthValue();
        int curr_day = currentDate.getDayOfMonth();
		
		if(year)
		{
			
		} */
		
		//selectFutureDate(driver,year,month,day);
		selectPastDate(driver,year,month,day);
		
		driver.close();

	}

}
