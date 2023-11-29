package Manufacturer_Module_SCM_Flex;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.POM.LoginPage;
import com.POM.ManufacturerAddproductPage;
import com.POM.ManufacturerHomePage;
import com.crm.GenericUtils.BaseClass;
import com.crm.GenericUtils.ExcelUtils;
import com.crm.GenericUtils.FileUtils;
import com.crm.GenericUtils.WebDriverUtils;

@Listeners(com.crm.GenericUtils.ListnerImplementation.class)
public class Manufacturer_should_be_able_to_add_products_Test extends BaseClass
{
	//public static WebDriver sdriver;
	//WebDriver driver;
	//@Parameters("BROWSER")
	@Test
public void test() throws IOException
{
	// Create objects for Generic Utility			
	FileUtils fileutils = new FileUtils();		
	WebDriverUtils webdriverutils= new WebDriverUtils(); 
	ExcelUtils excelutils = new ExcelUtils();
	
	//String URL=fileutils.readDataFromPropertyFile("url");
	String MUSERNAME=fileutils.readDataFromPropertyFile("manufacturerusername");
	String MPASSWORD=fileutils.readDataFromPropertyFile("manufacturerpassword");
	String MLOGINTYPE=fileutils.readDataFromPropertyFile("Manufacturerlogintype");
		
	LoginPage loginpage= new LoginPage(driver);
	ManufacturerHomePage mHomepage = new ManufacturerHomePage(driver);
	ManufacturerAddproductPage mAddproductPage= new ManufacturerAddproductPage(driver);
	
	// Enter username and password and click on login button
	loginpage.EnterUsernameAndPassword(MUSERNAME, MPASSWORD);
	loginpage.EnterLoginType(MLOGINTYPE);
	loginpage.ClickOnLoginButton();
	
	// Compare the actual and expected page
	String actualtitle = driver.getTitle();
	String expectedtitle="Manufacturer: Home";
	Assert.assertEquals(actualtitle, expectedtitle);
	System.out.println("Homepage is displayed... and its verified with title");
	
	// Click on add product link
	mHomepage.ClickOnaddProductLink();
	
	String actualaddproducttitle = driver.getTitle();
	String expectedproductpagetitle= "Add Produc";
	Assert.assertEquals(actualaddproducttitle, expectedproductpagetitle);
	System.out.println("addProduct page is displayed... and its verified with title");
	
	
	mAddproductPage.EnterdataIntoAddTextField(excelutils.readMultipleData("Sheet2"), driver);
	mAddproductPage.getEnableradioButton().click();
	mAddproductPage.getAddButton().click();
	
	// Handle the confirmation popup
	String ctext= driver.switchTo().alert().getText();
	System.out.println(ctext);
	webdriverutils.acceptAlertPopup(driver);
	
	// minimize the browser
	webdriverutils.MinimizeWindow(driver);
	
	// close the browser
	driver.quit();
	
	
   }

}
