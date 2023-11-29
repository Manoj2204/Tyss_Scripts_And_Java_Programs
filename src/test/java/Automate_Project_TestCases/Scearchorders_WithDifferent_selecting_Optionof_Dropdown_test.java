package Automate_Project_TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.GenericUtils.ExcelUtils;
import com.crm.GenericUtils.FileUtils;
import com.crm.GenericUtils.WebDriverUtils;

//import com_ObjectRepo.LoginPage;
//import com_ObjectRepo.Myorderpage;
//import com_ObjectRepo.RetailerHomepage;
//import genericUtilities.ExcelUtilities;
//import genericUtilities.PropertyFileUtilities;
//import genericUtilities.WebDriverUtilies;

public class Scearchorders_WithDifferent_selecting_Optionof_Dropdown_test {


	@Test
	public void test() throws Throwable 
	{
		/*//ExcelUtilities elib=new ExcelUtilities();
		ExcelUtils elib= new ExcelUtils();
		//PropertyFileUtilities plib=new PropertyFileUtilities();
		FileUtils plib=new FileUtils();
		WebDriverUtils wlib = new WebDriverUtils();
		
		
		//WebDriverUtilies wlib=new WebDriverUtilies();

		WebDriver driver=new ChromeDriver();
		wlib.MaximizeWindow(driver);
		//LoginPage login= new LoginPage(driver);
		
		//Fetching data from property file
		
		String BROWSER=plib.readDataFromPropertyFile("browser");
		String URL=plib.readDataFromPropertyFile("url");
		String username=plib.readDataFromPropertyFile("Retailerusername");
		String password=plib.readDataFromPropertyFile("Retailerurerpassword");
		

		//login to application
		driver.get(URL);
		//LoginPage login= new LoginPage(driver);
		//login.loginTOApplication(username,password,"Retailer");
		System.out.println(driver.getTitle() + " is displayed");

		//search with itemID
		System.out.println("//search with itemID//");
		//RetailerHomepage Rhome=new RetailerHomepage(driver);
		//Rhome.getMyorderslink().click();
		
		System.out.println(driver.getTitle() + " is displayed");
	
		//Myorderpage orderpage=new Myorderpage(driver);
		//orderpage.searchbyitemId(elib.readDataFromExcel("searchorder", 1, 0),elib.readDataFromExcel("searchorder", 1, 1));
		//String actualid=elib.readDataFromExcel("searchorder", 1, 1);
		String expectedid = driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[1]")).getText();
		//if(actualid.equals(expectedid))
		{
			System.out.println("searched with correct id");
		}
		//else
		{
		//	String errormsg =orderpage.getErrormessage().getText();
			//System.out.println(errormsg);
		} 
	
		//search with  item order date 

		System.out.println("//search with  item order date//");
		WebElement link = Rhome.getMyorderslink();
		wlib.javascriptclick(driver, link);
		
		
		System.out.println(driver.getTitle() + " is displayed");
		orderpage.searchbyitemDate(elib.readDataFromExcel("searchorder", 2, 0),"Nov");
		String expdate = "10-11-2023";
		String actualdate= driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[2]")).getText();
		if(actualdate.contains(expdate))
		{
			System.out.println("searched with correct date");
		}
		else
		{
			String errormsg =orderpage.getErrormessage().getText();
			System.err.println(errormsg);
		}
	
		//search with item status as  Pending  
		System.out.println("//search with item status as  Pending//");
		Rhome.getMyorderslink().click();
		System.out.println(driver.getTitle() + " is displayed");
		
		orderpage.seachbyitemstatus(elib.readDataFromExcel("searchorder", 3, 0),elib.readDataFromExcel("searchorder", 3, 2));
		String expstatus = elib.readDataFromExcel("searchorder", 3, 2);
		String actualstatus= driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[4]")).getText();

		if(expstatus.contains(actualstatus))
		{
			System.out.println("searched with  correct pending status");
		}
		else
		{
			String errormsg =orderpage.getErrormessage().getText();
			System.err.println(errormsg);
		}
	
		//search with item status as completed
		System.out.println("//search with item status as completed//");
		
		wlib.waituntilElementtoVisible(driver, link,10);
		Rhome.getMyorderslink().click();
		System.out.println(driver.getTitle() + " is displayed");
		
		orderpage.seachbyitemstatus(elib.readDataFromExcel("searchorder", 3, 0),elib.readDataFromExcel("searchorder", 3, 3));
		String exptstatus = elib.readDataFromExcel("searchorder", 3, 3);
		String actstatus =elib.readDataFromExcel("searchorder", 3, 2);
		if(actstatus.equals(exptstatus))
		{
			System.out.println("searched with completed status");
		}
		else
		{
			String errormsg = orderpage.getErrormessage().getText();
			System.err.println(errormsg);
		}
	
		//search with item approval as approved option
		System.out.println("//search with item approval as approved option//");
		Rhome.getMyorderslink().click();
		System.out.println(driver.getTitle() + " is displayed");
		
		orderpage.seachByItemApprovedoption(elib.readDataFromExcel("searchorder", 4, 0),elib.readDataFromExcel("searchorder", 4, 3));
		String expapp =elib.readDataFromExcel("searchorder", 4, 2);
		String actapp=elib.readDataFromExcel("searchorder", 4, 3);
		if(expapp.equals(actapp))
		{
			System.out.println("searched with  correct approved option");
		}
		else
		{
			String errormsg = orderpage.getErrormessage().getText();
			System.err.println(errormsg);
		}
	
		//search with item approval as not approved option
		System.out.println("//search with item approval as not approved option//");
		Rhome.getMyorderslink().click();
		
		System.out.println(driver.getTitle() + " is displayed");
		orderpage.seachByItemApprovedoption(elib.readDataFromExcel("searchorder", 4, 0),elib.readDataFromExcel("searchorder", 4, 2));
		String exptapp = elib.readDataFromExcel("searchorder", 4, 2);
		String actualapp = driver.findElement(By.xpath("//table[@class='table_displayData']/tbody/tr[2]/td[3]")).getText();
		
		if(exptapp.contains(actualapp))
		{
			System.out.println("searched with correct not approved option");
		}
		else
		{
			String errormsg =orderpage.getErrormessage().getText();
			System.err.println(errormsg);
		}
		driver.quit();*/
		}

		
	
}