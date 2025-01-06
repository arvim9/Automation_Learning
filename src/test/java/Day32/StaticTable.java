package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		//find the total number of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //if have multiple table at the page
		//int rows = driver.findElements(By.tagName("tr")).size(); //if have multiple table at the page
		
		System.out.println("Number of rows: " +rows);
		
		// Find the total number of column in a table
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols = driver.findElements(By.tagName("th")).size(); //if have multiple table at the page
		System.out.println("Number of columns: " +cols);
		
		//Read specific cell data of a table
		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(value);
		
		// Read all cell data of a table
		/*System.out.println("BookName"+"\t\t"+"Author"+"\t\t"+"Subject"+"\t\t"+"Price");
		for(int i=2; i<=rows; i++)
		{
			for(int p =1; p<=cols; p++)
			{
				
				String strvalue = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+p+"]")).getText();
				System.out.print(strvalue +"\t\t");
			}
			System.out.println();
		}  */
		
		// Print book name whos author is Mukesh
		for(int p =2; p<=rows; p++)
		{
			
			String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+p+"]//td[2]")).getText();
			if(authorname.equals("Mukesh"))
			{
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+p+"]//td[1]")).getText();	
				System.out.println(bookname + "\t"+ authorname);
			}
				
		}
		// find the total price of the books
		int totprice =0;
		for(int p =2; p<=rows; p++)
		{
					
				String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+p+"]//td[4]")).getText();	
				totprice = totprice + Integer.parseInt(price);			
			
				
		}
		System.out.println("Total Amout of all books: " + totprice);
		
		//Thread.sleep(2000);
		
		driver.close();

	}

}
