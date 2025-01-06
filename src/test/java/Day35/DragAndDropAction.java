package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act=new Actions (driver);
		
		// drag and drop 1		
		WebElement source_rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target_italy = driver.findElement(By.xpath("//div[@id='box106']"));	
		
		act.dragAndDrop(source_rome, target_italy).perform(); // Perform drag and drop from source to target position.
		
		// drag and drop 2		
		WebElement source_washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement target_uk = driver.findElement(By.xpath("//div[@id='box103']"));		
		
		act.dragAndDrop(source_washington, target_uk).perform(); // Perform drag and drop from source to target position.
				
		//Thread.sleep(3000);
		driver.close();
		
	}

}
