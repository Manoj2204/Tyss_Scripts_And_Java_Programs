package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Data_Into_ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data");
		String data = sc.next();
		FileInputStream fis = new FileInputStream("./src/test/resources/WriteExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		sheet.createRow(5).createCell(0).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./src/test/resources/WriteExcelData.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("data is entered.....");
		
	}

}
