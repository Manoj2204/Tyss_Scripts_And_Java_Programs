package PracticeTestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import com.crm.GenericUtils.ExcelUtils;

public class ExecuteDPByGeneric 
{
	@DataProvider
	public Object[][] getdataFromExcel() throws EncryptedDocumentException, IOException
	{
		ExcelUtils exceutil= new ExcelUtils();
		Object[][] value = exceutil.getMultipleSetofData("Sheet2");
		return value;
				
	}

}
