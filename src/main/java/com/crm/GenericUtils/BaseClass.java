package com.crm.GenericUtils;
import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.POM.LoginPage;
import com.POM.ManufacturerHomePage;

public class BaseClass 
{
	public WebDriver driver;
	public static WebDriver sdriver;
	DatabaseUtils db= new DatabaseUtils();
	ExcelUtils excel= new ExcelUtils();
	FileUtils flib= new FileUtils();
	JavaUtils jlib= new JavaUtils();
	WebDriverUtils wd= new WebDriverUtils();
	
	
	@BeforeSuite
	public void Config_BeforeSuite() throws Throwable
	{
		db.connectDB();
		System.out.println("--Database connected--");
	}
	
	//@Parameters("BROWSER")
	@BeforeClass
	public void Config_BeforeClass() throws IOException
	{
		String BROWSER = flib.readDataFromPropertyFile("browser");
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
		sdriver= driver;
		wd.MaximizeWindow(driver);
		
		
	}
	
	
	//@Parameters("URL")
	@BeforeMethod
	public void Config_BeforeMethod() throws IOException, InterruptedException
	{
		String URL = flib.readDataFromPropertyFile("url");
		driver.get(URL);
		
		
		 
	}
	
	@AfterMethod
	public void Config_AfterMethod()
	{
		ManufacturerHomePage Mhomepage= new ManufacturerHomePage(driver);
		Mhomepage.ClickOnLogoutButton();
	}
	
	@AfterClass
	public void Config_AfterClass()
	{
		wd.MinimizeWindow(driver);
		driver.quit();
		
	}
	
	@AfterSuite
	public void Config_AfterSuite() throws Throwable 
	{
		
		db.disconnectDB();
		System.out.println("--Database is clsed--");
		
		
	}

}
