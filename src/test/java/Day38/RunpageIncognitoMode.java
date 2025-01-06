package Day38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunpageIncognitoMode {

	public static void main(String[] args) {
		
		// Creating headless settings
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);  // Launching incognito browser window.
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//Single file upload
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Admin\\Desktop\\TGWC ITR.docx");
		
		// Put validate weather file is uploaded or not ?		
		if(driver.findElement(By.xpath("//ul[@id = 'fileList']")).getText().equals("TGWC ITR.docx"))
		{
			System.out.println("File Uploaded Successfully...");
		}
		else
		{
			System.out.println("File is not upladed ...!");
		}
				
		driver.quit();
		System.out.println("Driver is closed...");
	}

}
