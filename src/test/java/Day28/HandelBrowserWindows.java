package Day28;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
				
				Set<String> windid =  driver.getWindowHandles();
				for(String winid:windid)
				{
					String title = driver.switchTo().window(winid).getTitle();
					
					if(title.equals("OrangeHRM"))
					{
						driver.close();
						break;
					}
					else 
					{
						System.out.println("This window is not found");
					}
					
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			//driver.quit();
		}
		

	}
	
		  
}
