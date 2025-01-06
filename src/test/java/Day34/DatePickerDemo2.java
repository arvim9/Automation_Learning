package Day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	//user defined method for converting month from String to month object
	static Month convertMonth(String month)
	{
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		{
			monthMap.put("January", Month.JANUARY);
			monthMap.put("Febuary", Month.FEBRUARY);
			monthMap.put("March", Month.MARCH);
			monthMap.put("April", Month.APRIL);
			monthMap.put("May", Month.MAY);
			monthMap.put("June", Month.JUNE);
			monthMap.put("July", Month.JULY);
			monthMap.put("August", Month.AUGUST);
			monthMap.put("September", Month.SEPTEMBER);
			monthMap.put("October", Month.OCTOBER);
			monthMap.put("November", Month.NOVEMBER);
			monthMap.put("December", Month.DECEMBER);
			
			Month vmonth = monthMap.get(month);
			
			if(vmonth ==null)
			{
				System.out.println("Invalid Month");
			}
			
			return vmonth;
		}
		
	}
	
	static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate)
	{
		//select year
				WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select selectYear = new Select (yearDropDown); 
				selectYear.selectByVisibleText(requiredYear);
				
				// Select Month
				while(true)
				{
					String displaymonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).getText();
					
					// Convert requiredMonth and display month into month object.
					Month expectedMonth = convertMonth(requiredMonth);
					Month currentdMonth = convertMonth(displaymonth);
				
					// Compare...
					int result = expectedMonth.compareTo(currentdMonth);
					
					if(result < 0)
					{
						// Click on past month
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-trangle-w']")).click();
					}
					else if(result>0) 
					{
									
						// Select Future month
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-trangle-w']")).click();
						
					}
					else 
					{
						break;
					}
					
				}
				//Select Date
				List<WebElement> allDates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']//tbody//tr//td"));
				
				for(WebElement dt:allDates)
				{
					if(dt.getText().equals(requiredDate))
					{
						dt.click();
						break;
					}
				}

	}

	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//input DOB
		String requiredYear="2021";
		String requiredMonth = "June";
		String requiredDate = "15";
		
		try
		{
			driver.switchTo().frame("frame-one796456169");
			driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
			
			selectDate(driver, requiredYear, requiredMonth, requiredDate );
		}
		catch(Exception e)
		{
		System.out.println("Somthing went wrong !" + e.getMessage());
		}
		
		driver.close();
	}

}
