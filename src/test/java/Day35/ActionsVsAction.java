package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {

		/*
		 * 
			Actions Vs Action
			Actions -- class, will be used to perform mouse actions,
			Action -- interface, will be used to store created actions.
		
		*/

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']")); 
		Actions act= new Actions (driver);
		
		Action myaction = act.contextClick(button).build(); // building/creating an action and storing into a variabl myaction.perform(); // we are performing completing action
		
		myaction.perform();
		
		
		
	}

}
