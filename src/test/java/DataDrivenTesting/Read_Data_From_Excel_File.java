package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_From_Excel_File 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
	}

}
