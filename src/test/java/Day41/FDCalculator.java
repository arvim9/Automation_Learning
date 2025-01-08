package Day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		driver.findElement(By.xpath("//button[@id ='wzrk-confirm']")).click();
		
		String filePath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i = 1; i<=rows; i++)
		{
			//1) Read the data from excel sheet
			String princ = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rate_of_interest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String fre = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);			
			String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			
			//2) Pass above data into the application.
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rate_of_interest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			Select dropdn = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			dropdn.selectByVisibleText(per2);
			
			Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(fre);
			//Thread.sleep(3000);
			// Click on calculate button
			driver.findElement(By.xpath("//div[@class = 'CTR PT15']//a[1]")).click();
			
						
			//3) Validate and write result in excel sheet
			
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i,7);				
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i,7);				
			}
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
		
		driver.quit();

	}

}
