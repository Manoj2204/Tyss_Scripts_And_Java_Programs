package com.crm.GenericUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass2 
{
	WebDriver driver;
	@Parameters({"BROWSER","URL"})
	@BeforeMethod
	public void Config_BeforeClass(String BROWSER, String URL) throws IOException
	{
		//String BROWSER = flib.readDataFromPropertyFile("browser");
		if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) 
		{
			driver= new EdgeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	@AfterMethod
	public void Config_AfterMethod()
	{
		driver.manage().window().minimize();
		driver.close();
	}

}
