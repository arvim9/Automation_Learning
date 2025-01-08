package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\DynamicData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many row want ?");
		int totrow = sc.nextInt();
		
		System.out.println("How many col want ?");
		int totcol = sc.nextInt();
		
		
		for(int r=0; r<=totrow;r++)
		{
			XSSFRow currentrow = sheet.createRow(r);
			
			for(int c = 0; c<totcol; c++)
			{
				System.out.println("Enter the value of  "+(r+1)+" row and "+(c+1)+" cell");
				XSSFCell cell = currentrow.createCell(c);
				cell.setCellValue(sc.next());
				
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		sc.close();
		
		System.out.println("File created successfull....!");
		
	}

}
