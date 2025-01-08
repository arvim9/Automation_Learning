package Day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRuntime {

	public static void main(String[] args) {
		
		//Create chrome setting option.
		ChromeOptions options = new ChromeOptions(); 
		
		// create object of extension.
		//File file = new File("F:\\CRXExtensions\\SelectorsHub.crx"); 
		File file = new File("F:\\CRXExtensions\\Lightshot.crx"); 
		
		// assign file object to Chrome setting.
		options.addExtensions(file); 
		
		
		// Applying chrome options settings.
		WebDriver driver = new ChromeDriver(options);  
		
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		
		

	}

}
