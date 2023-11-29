package Admin_Module_SCM_Flex;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.AddRetailerPage;
import com.POM.AdminHomePage;
import com.POM.LoginPage;
import com.POM.RetailersPage;
import com.crm.GenericUtils.ExcelUtils;
import com.crm.GenericUtils.FileUtils;
import com.crm.GenericUtils.WebDriverUtils;


public class DeletingRetailer_Test 
{
	@Test
	public void test() throws InterruptedException, Throwable 
	{
		
		FileUtils fileutils= new FileUtils();
		String AdminUsername =fileutils.readDataFromPropertyFile("adminusername");
		String Adminpassword =fileutils.readDataFromPropertyFile("adminpassword");
		String AdminLOGINTYPE=fileutils.readDataFromPropertyFile("Adminlogintpe");
		String URL = fileutils.readDataFromPropertyFile("url");
		
		WebDriver driver = new ChromeDriver();
		AdminHomePage adminhomepage = new AdminHomePage(driver);
		WebDriverUtils webdriverutils= new WebDriverUtils();
		RetailersPage retailerspage= new RetailersPage(driver);
				
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		
		// Create Object For LoginPage 
		LoginPage loginpage= new LoginPage(driver);
		loginpage.EnterUsernameAndPassword(AdminUsername, Adminpassword);
		loginpage.EnterLoginType(AdminLOGINTYPE);
		loginpage.ClickOnLoginButton();
		
		// To check Admin Home Page is displayed 
		String actualtitle1 = driver.getTitle();
		String expectedtitle1 = "Admin: Home";
		Assert.assertEquals(actualtitle1,expectedtitle1 );
		System.out.println("Admin Homepage is displayed... and its verified with title");
		
		// click on add retailer Button
		adminhomepage.getaddRetailer().click();
		// Enter the reatiler details
		AddRetailerPage addretailerpage= new AddRetailerPage(driver);
		ExcelUtils excelutil= new ExcelUtils();
		// Enter all the data
		addretailerpage.EnterdataIntoAddRetailertField(excelutil.readMultipleData("sheet3"), driver);
		// click on submit button
		addretailerpage.getRetailerSubmitButton().click();
		// Handle Alert popup
		String confirmationMsgtext = driver.switchTo().alert().getText();
		System.out.println(confirmationMsgtext);
		webdriverutils.acceptAlertPopup(driver);
		//deleteing the retailer
		adminhomepage.getReatilersLink().click();
		retailerspage.getCheckbox().click();
		retailerspage.getDeleteRetailer().click();
		// check Retailer is deleted or not
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		webdriverutils.acceptAlertPopup(driver);
		// close the browser
		driver.quit();
		
	}

}