package Assignment_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonPrakshSirTest 
{
	@Test

	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("apple iphone 14");
		search.sendKeys(Keys.ENTER);



		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		int count=0;
		for(; ;)
		{

			try 
			{

				List<WebElement> phones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				int Sizecount = phones.size();
				count=count+Sizecount;
				//wait.until(ExpectedConditions.titleContains("Best Price in India"));
				wait.until(ExpectedConditions.visibilityOf(nextButton));
				nextButton.click();

			}

			catch (Exception e) 
			{
				jse.executeScript("window.scrollBy(0,7000);");
				break;
			}
			Thread.sleep(2000);
			
		}
		System.out.println(count);
		String expectedCount=count+"";
		String result = driver.findElement(By.xpath("//span[contains(.,'results for')]")).getText();
		if(result.contains(expectedCount))
		{
			System.out.println("we are getting same result");
		}
		else
		{
			System.out.println("Failed...");
		}
		driver.quit();
	}
	
}

