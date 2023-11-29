package com.crm.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ExcelUtils 
{
	WebDriver driver;
	/**
	 * This Method is used to read data from ExcelUtility
	 * @param sheetname
	 * @param rowInt
	 * @param cellInt
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String ReadDataFromExcelUtility(String sheetname, int rowInt, int cellInt ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		String value = sheet.getRow(rowInt).getCell(cellInt).getStringCellValue();
		return value;
	}
	/**
	 * This method is used to get last row count in ExcelFile
	 * @param sheetname
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public int GetLastRowNum(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstants.FilePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int count = sheet.getLastRowNum();
		return count;
	}
	
	/**
	 * This method is used to Write data into ExcelSheet
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String WriteDataIntoExcelUtility(String sheetname, int row,int cell,String data ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
	    sheet.createRow(row).createCell(cell).setCellValue(data);
	    FileOutputStream fos = new FileOutputStream(IPathConstants.ExcelPath);
	    wb.write(fos);
	    wb.close();
		
		return null;
		
	}
	/**
	 * This method is used to read multiple data into Excelsheet
	 * @param sheetname
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public HashMap<String, String>readMultipleData(String sheetName) throws EncryptedDocumentException, IOException
	{
		JavaUtils jlib=new JavaUtils();
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int count = sheet.getLastRowNum();
		HashMap<String, String>map=new HashMap<String ,String>();
		for(int i=0;i<=count;i++)
		{
			String key = sheet.getRow(i).getCell(0).getStringCellValue();
			String value = sheet.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
        return map;
		
	}
	
	public Object[][] getMultipleSetofData(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getPhysicalNumberOfRows();
		int cellCount=sh.getRow(0).getLastCellNum();
		Object[][]obj=new Object[rowCount][cellCount];
		for (int i = 0; i < rowCount; i++) 
		{
			for (int j = 0; j < cellCount; j++) 
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		return obj;
		
	}
	
	

}
