package Practice_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DataProvider_Facebook_Sign_Test 
{
	@Test(dataProviderClass = DataProvider_Demo.class,dataProvider = "test1")
	public void test(String firstname,String lastName)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		WebElement fname = driver.findElement(By.name("firstname"));
		WebElement lname = driver.findElement(By.name("lastname"));
		fname.sendKeys(firstname);
		lname.sendKeys(lastName);
		driver.quit();
	}

}
