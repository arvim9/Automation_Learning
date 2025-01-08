package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {


		//FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\TestSelenium.xlsx");
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\TestSelenium.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totrow = sheet.getLastRowNum();
		int totcell = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows: "+totrow);
		System.out.println("Total number of cell: "+totcell);
		
		for (int r = 0; r <= totrow; r++) {
		    XSSFRow currentrow = sheet.getRow(r);

		    for (int col = 0; col < totcell; col++) 
		    { 
		    	if (currentrow != null) 
		    	{
		    	    XSSFCell cell = currentrow.getCell(col); // Access the correct cell
		    	    
		    	    if (cell != null) {
		    	    	System.out.print(cell.toString() + "\t"+"\t");
		    	    }
		    	}
		    
		    }

		    System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
