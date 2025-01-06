package Day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// Demo of using Page Factory Model.


public class LoginPage2 
{
	WebDriver driver;
	
	
	// Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  	// this is Mondatory line in page factory mode.
	}
	
	// Locators

		// 1) @FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username_loc;
	
		@FindBy(how = How.XPATH, using="//input[@placeholder='Username']") WebElement txt_username_loc;
		
		@FindBy(xpath="//input[@placeholder='Password']")	WebElement txt_password_loc;
		@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login_loc;
		
		
		
		// if need to fine multiple element then we can use ...
		@FindBy(tagName = "a") List<WebElement> links;
		
		
		
	// Action Methods
		
		public void setUserName(String username)
		{
			txt_username_loc.sendKeys(username);
		}
		
		
		
		public void setPassword(String password)
		{
			txt_password_loc.sendKeys(password);
		}
		
		
		
		
		public void clickLogin()
		{
			btn_login_loc.click();
		}

}
