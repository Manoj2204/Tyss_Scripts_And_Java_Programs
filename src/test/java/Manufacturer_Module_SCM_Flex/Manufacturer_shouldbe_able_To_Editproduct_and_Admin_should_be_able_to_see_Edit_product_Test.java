package Manufacturer_Module_SCM_Flex;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.POM.AdminHomePage;
import com.POM.LoginPage;
import com.POM.ManufacturerAddproductPage;
import com.POM.ManufacturerHomePage;
import com.POM.ProductEditPage;
import com.POM.productListPage;
import com.crm.GenericUtils.BaseClass;
import com.crm.GenericUtils.ExcelUtils;
import com.crm.GenericUtils.FileUtils;
import com.crm.GenericUtils.WebDriverUtils;
import com.crm.GenericUtils.pomClassObjects;

public class Manufacturer_shouldbe_able_To_Editproduct_and_Admin_should_be_able_to_see_Edit_product_Test extends BaseClass
{
	
	@Test
	public void test() throws IOException

	{
		FileUtils fileutils = new FileUtils();
		WebDriverUtils webdriverutil = new WebDriverUtils();
		WebDriverUtils webdriverutils = new WebDriverUtils();
		ExcelUtils excelutils = new ExcelUtils();
		
		String URL = fileutils.readDataFromPropertyFile("url");
		String USERNAME = fileutils.readDataFromPropertyFile("manufacturerusername");
		String PASSWORD = fileutils.readDataFromPropertyFile("manufacturerpassword");
		String ManufacturerLOGINTYPE = fileutils.readDataFromPropertyFile("Manufacturerlogintype");
		String AdminUsername = fileutils.readDataFromPropertyFile("adminusername");
		String Adminpassword = fileutils.readDataFromPropertyFile("adminpassword");
		String AdminLOGINTYPE = fileutils.readDataFromPropertyFile("Adminlogintpe");

		//WebDriver driver = new ChromeDriver();
		//  
		//driver.get(URL);
		//webdriverutil.MaximizeWindow(driver);
		//webdriverutil.ImplicitlyWait(driver, 20);
		LoginPage loginpage = new LoginPage(driver);
		ManufacturerHomePage mHomepage = new ManufacturerHomePage(driver);
		ManufacturerAddproductPage mAddproductPage = new ManufacturerAddproductPage(driver);
		AdminHomePage adminhomepage = new AdminHomePage(driver);
		productListPage productlistpage = new productListPage(driver);
		ProductEditPage editproductpage = new ProductEditPage(driver);

		loginpage.EnterUsernameAndPassword(USERNAME, PASSWORD);
		loginpage.getLogintypeDropdown().sendKeys(ManufacturerLOGINTYPE);
		loginpage.ClickOnLoginButton();

		String actualtitle = driver.getTitle();
		String expectedtitle = "Manufacturer: Home";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Manufacturer Homepage is displayed... and its verified with title");

		// Click On add product Link
		mHomepage.ClickOnaddProductLink();

		String actualaddproducttitle = driver.getTitle();
		String expectedproductpagetitle = "Add Product";
		Assert.assertEquals(actualaddproducttitle, expectedproductpagetitle);
		System.out.println("addProduct page is displayed... and its verified with title");
		
		// Enter the data inside the product name textField
		mAddproductPage.EnterdataIntoAddTextField(excelutils.readMultipleData("sheet2"), driver);

		mAddproductPage.getEnableradioButton().click();
		mAddproductPage.getAddButton().click();

		// Handle alert and print the text
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();

		// click on product link
		mHomepage.getProductLink().click();

		// Edit the product
		productlistpage.getProductEditButton().click();

		// update the product
		editproductpage.ClickAndClearPricetextField();
		editproductpage.getPricetextField().sendKeys("29");
		editproductpage.getEnableRadioButton().click();
		editproductpage.getUpdateProductButton().click();

		// Handle alert and print the text
		String text2 = driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().accept();

		// Click on logout button
		mHomepage.ClickOnLogoutButton();

		// Verify login page should be displayed
		String actualloginpageTitle = driver.getTitle();
		String ExpectedLoginpageTitle = "";
		Assert.assertEquals(actualloginpageTitle, ExpectedLoginpageTitle);
		System.out.println("Login page is displayed and its verified with title");

		// enter username, password, loginType and click on login button
		loginpage.EnterUsernameAndPassword(AdminUsername, Adminpassword);
		loginpage.getLogintypeDropdown().sendKeys(AdminLOGINTYPE);
		loginpage.ClickOnLoginButton();
		
        // verify the admin page title
		String actualtitle1 = driver.getTitle();
		String expectedtitle1 = "Admin: Home";
		Assert.assertEquals(actualtitle1, expectedtitle1);
		System.out.println("Admin Homepage is displayed... and its verified with title");
		
		// click on product link
		adminhomepage.getProductLink().click();

		// print product name along with value
		String productname = productlistpage.getProductname().getText();

		// updated product price
		String productPrice = productlistpage.getProductprice().getText();

		System.out.println("Updated Product Name : " + productname + "  " + "Updated Product price : " + productPrice);
		driver.close();

	}

}
