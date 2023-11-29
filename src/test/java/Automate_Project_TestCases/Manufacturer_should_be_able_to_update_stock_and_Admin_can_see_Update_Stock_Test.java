package Automate_Project_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.POM.AdminHomePage;
import com.POM.AdminViewProductPage;
import com.POM.LoginPage;
import com.POM.ManageStockPage;
import com.POM.ManufacturerAddproductPage;
import com.POM.ManufacturerHomePage;
import com.crm.GenericUtils.BaseClass;
import com.crm.GenericUtils.ExcelUtils;
import com.crm.GenericUtils.FileUtils;
import com.crm.GenericUtils.WebDriverUtils;

@Listeners(com.crm.GenericUtils.ListnerImplementation.class)
public class Manufacturer_should_be_able_to_update_stock_and_Admin_can_see_Update_Stock_Test extends BaseClass{
	//public static WebDriver sdriver;
	//public WebDriver driver;
	//@Parameters("BROWSER")
	@Test
	public void test() throws IOException 
	{
		FileUtils fileutils= new FileUtils();
		WebDriverUtils webdriverutil=new WebDriverUtils();
		WebDriverUtils webdriverutils= new WebDriverUtils(); 
		ExcelUtils excelutils = new ExcelUtils();
		
		String URL = fileutils.readDataFromPropertyFile("url");
		String USERNAME =fileutils.readDataFromPropertyFile("manufacturerusername");
		String PASSWORD =fileutils.readDataFromPropertyFile("manufacturerpassword");
		String ManufacturerLOGINTYPE =fileutils.readDataFromPropertyFile("Manufacturerlogintype");
		String AdminUsername =fileutils.readDataFromPropertyFile("adminusername");
		String Adminpassword =fileutils.readDataFromPropertyFile("adminpassword");
		String AdminLOGINTYPE =fileutils.readDataFromPropertyFile("Adminlogintpe");
	
		//WebDriver driver = new ChromeDriver();
		
		/*
		 * if (BROWSER.equalsIgnoreCase("chrome")) { driver=new ChromeDriver(); } else
		 * if (BROWSER.equalsIgnoreCase("edge")) { driver= new EdgeDriver(); } else if
		 * (BROWSER.equalsIgnoreCase("firefox")) { driver=new FirefoxDriver(); }
		 * sdriver= driver;
		 */
		LoginPage loginpage= new LoginPage(driver);
		ManufacturerHomePage mHomepage = new ManufacturerHomePage(driver);
		ManufacturerAddproductPage mAddproductPage= new ManufacturerAddproductPage(driver);
		ManageStockPage managestockpg=new ManageStockPage(driver);
		AdminHomePage adminhomepage= new AdminHomePage(driver);
		AdminViewProductPage adminproductpage=new AdminViewProductPage(driver);

		//driver.get(URL);
		//webdriverutil.MaximizeWindow(driver);
		//webdriverutil.ImplicitlyWait(driver, 20);
		
		// Enter the username, password, loginType and click on login button
		loginpage.EnterUsernameAndPassword(USERNAME, PASSWORD);
		loginpage.getLogintypeDropdown().sendKeys(ManufacturerLOGINTYPE);
		loginpage.ClickOnLoginButton();
		
		// Verify the page title
		String actualtitle = driver.getTitle();
		String expectedtitle = "Manufacturer: Home";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Manufacturer Homepage is displayed... and its verified with title");
		
		// Click On add product Link
		mHomepage.ClickOnaddProductLink();

		// Verify the add product page title
		String actualaddproducttitle = driver.getTitle();
		String expectedproductpagetitle = "Add Product";
		Assert.assertEquals(actualaddproducttitle, expectedproductpagetitle);
		System.out.println("addProduct page is displayed... and its verified with title");
		
        // Read multiple data from excelFile
		mAddproductPage.EnterdataIntoAddTextField(excelutils.readMultipleData("Sheet2"), driver);
		mAddproductPage.getEnableradioButton().click();
		mAddproductPage.getAddButton().click();
		
		// Handle the confirmation popup
		String ctext= driver.switchTo().alert().getText();
		System.out.println(ctext);
		webdriverutils.acceptAlertPopup(driver);
		
		// click on manage stock link
		mHomepage.ClickonmanageStockLink();
		
		// click on chips quantity
		managestockpg.getQuantity().click();
		managestockpg.getQuantity().clear();
		managestockpg.getQuantity().sendKeys("10");
		
		// click on update button
		managestockpg.ClickOnUpdateButton();
		
		// Handle the confirmation popup
		String confirmationMsg = driver.switchTo().alert().getText();
		System.out.println(confirmationMsg);
		driver.switchTo().alert().accept();

		// Click on logout button
		mHomepage.ClickOnLogoutButton();

		// Verify login page should be displayed
		String actualloginpageTitle = driver.getTitle();
		String ExpectedLoginpageTitle1 = "";
		Assert.assertEquals(actualloginpageTitle, ExpectedLoginpageTitle1);
		System.out.println("Login page is displayed and its verified with title");
		
		// Login as Admin And check product is displayed or not
		loginpage.EnterUsernameAndPassword(AdminUsername, Adminpassword);
		loginpage.getLogintypeDropdown().sendKeys(AdminLOGINTYPE);
		loginpage.ClickOnLoginButton();

		// Verify the page title
		String actualtitle1 = driver.getTitle();
		String expectedtitle1 = "Admin: Home";
		Assert.assertEquals(actualtitle1, expectedtitle1);
		System.out.println("Admin Homepage is displayed... and its verified with title");
		
		// click on product link
		adminhomepage.ClickOnproductLink();
		
		// Check product is updated or not
		String Productname=adminproductpage.getUpdatedProductName().getText();
		String prductQuantity = adminproductpage.getUpdatedProductQuantity().getText();
		System.out.println("Product name : " + Productname + " Product Quantity : " + prductQuantity);
		
		// Close the browser
		driver.close();

	}

}
