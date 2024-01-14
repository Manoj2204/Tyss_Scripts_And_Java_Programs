package Assignment_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart_Iphone_LessThan_60000 extends BaseClassForSeleniumGrid
{
	@Test
	public void test5()
	{
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("ip");
		WebElement iphone = driver.findElement(By.xpath("//div[text()='hone']"));
		Actions action=new Actions(driver);
		action.moveToElement(iphone).click().perform();
		
		
		List<WebElement> allproductName = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1' and translate(text(),'₹,','')>70000]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_4rR01T']"));
		List<WebElement> allProductPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1' and contains(text(),'₹') and translate(text(),'₹,','')>70000]"));
	
		for(int i=0;i<allproductName.size();i++)
		{
			String productName = allproductName.get(i).getText();
			String productprice = allProductPrice.get(i).getText();
			System.out.println(productName+" : "+productprice);
		}
		driver.quit();
	
	}

}
