package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\MyData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("Name");
			row1.createCell(1).setCellValue("Mob No");
			row1.createCell(2).setCellValue("Language");
			row1.createCell(3).setCellValue("Type");
			
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Amar");
			row2.createCell(1).setCellValue("9898989898");
			row2.createCell(2).setCellValue("Java");
			row2.createCell(3).setCellValue("Automation");
		XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("Amarjeet");
			row3.createCell(1).setCellValue("9898989800");
			row3.createCell(2).setCellValue("Python");
			row3.createCell(3).setCellValue("Automation");
		XSSFRow row4 = sheet.createRow(3);
			row4.createCell(0).setCellValue("Ramesh");
			row4.createCell(1).setCellValue("9999999999");
			row4.createCell(2).setCellValue("C#");
			row4.createCell(3).setCellValue("Automation");

			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("File created successfully...!");
			
	}

}
