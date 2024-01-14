package Admin_Module_SCM_Flex;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.AdminHomePage;
import com.POM.LoginPage;
import com.crm.GenericUtils.BaseClass;
import com.crm.GenericUtils.FileUtils;
import com.crm.GenericUtils.WebDriverUtils;

@Listeners(com.crm.GenericUtils.ListnerImplementation.class)
public class To_check_add_retailers_page_is_displayed_Test extends BaseClass {

	
	@Test
	public void test() throws InterruptedException, IOException
	{
		FileUtils flib= new FileUtils();
		String USERNAME = flib.readDataFromPropertyFile("adminusername");
		String PASSWORD = flib.readDataFromPropertyFile("adminpassword");
		String LOGINTYPE = flib.readDataFromPropertyFile("Adminlogintpe");
		LoginPage lp=new LoginPage(driver);
		
		lp.EnterUsernameAndPassword(USERNAME, PASSWORD);
		lp.EnterLoginType(LOGINTYPE);
		lp.ClickOnLoginButton();
		AdminHomePage adminhomepage= new AdminHomePage(driver);
		//Verify The title
		String actualtitle = driver.getTitle();
		String expectedtitle="Admin: Home";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Homepage is displayed... and its verified with title");
		
		// click on add retailer link
		adminhomepage.getaddRetailer().click();
		
		// To check Whether Add retailer page should displayed..
		String addproductactualtitle = driver.getTitle();
		String addproductexpectedtitle="Add Retailer";
		Assert.assertEquals(addproductactualtitle, addproductexpectedtitle);
		
		System.out.println("AddRetailer is displayed... and its verified with title");
		
		
				
	}

}
