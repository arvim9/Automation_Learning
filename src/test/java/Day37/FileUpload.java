package Day37;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//Single file upload
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Admin\\Desktop\\TGWC ITR.docx");
		
		// Put validate weather file is uploaded or not ?		
		if(driver.findElement(By.xpath("//ul[@id = 'fileList']")).getText().equals("TGWC ITR.docx"))
		{
			System.out.println("File Uploaded Successfully...");
		}
		else
		{
			System.out.println("File is not upladed ...!");
		}
		
		*/
		
		// Multiple files upload
		String file1 = "C:\\Users\\Admin\\Desktop\\TGWC ITR.docx";
		String file2 = "C:\\Users\\Admin\\Desktop\\Invstt-ToDo-27Nov24.docx";
		
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 +"\n"+file2);
		
		List<WebElement> allfiles = driver.findElements(By.xpath("//ul[@id = 'fileList']//li"));
		
		for(WebElement ele:allfiles)
		{
			String fname = ele.getText();
						
			if(!fname.equals("TGWC ITR.docx") || !fname.equals("Invstt-ToDo-27Nov24.docx") )
			{
				System.out.println("Weldone correct File Uploaded...");
				
			}
			else
			{
				System.out.println("Wrong File Uploaded....!");
			}
			
		}
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
