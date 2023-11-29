package com.crm.GenericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils 
{
	/**
	 * This method is used to read data from property File
	 * @author Manoj
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstants.FilePath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}
	
	public String WriteDataIntoPropertyFile(String key,String value) throws IOException
	{ 
		FileInputStream fis = new FileInputStream(IPathConstants.FilePath);
		Properties pobj= new Properties();
		pobj.setProperty(key, value);
		pobj.load(fis);
		
		FileOutputStream fos = new FileOutputStream(IPathConstants.FilePath);
		pobj.store(fos, "write data");
		return null;
		
		
	}

}
