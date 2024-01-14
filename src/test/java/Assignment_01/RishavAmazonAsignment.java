package Assignment_01;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RishavAmazonAsignment 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("iphone");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		
		WebElement iphoneN = driver.findElement(By.xpath("//a[@aria-label='Midnight']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[text()='iPhone 14 (128 GB) - Midnight']"));

		for(; ;)
		{
			try 
			{
				iphoneN.click();
				break;
			} catch (Exception e) 
			{
				jse.executeScript("arguments[0].scrollIntoView(true);", iphoneN);
			}
		}
		
		Set<String> allWindowId = driver.getWindowHandles();
		ArrayList<String>list= new ArrayList<String>(allWindowId);
		String parentWindow = list.get(0);
		String childwindow = list.get(1);
		driver.switchTo().window(childwindow);
		
		WebElement colour = driver.findElement(By.xpath("//img[@alt='Blue']"));
		jse.executeScript("arguments[0].scrollIntoView();", colour);
		Thread.sleep(2000);
		colour.click();
		Thread.sleep(3000);
		WebElement blue = driver.findElement(By.xpath("//span[text()='Blue']"));
		Actions action = new Actions(driver);
		List<WebElement> allColours = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
		for(WebElement c:allColours)
		{
			action.moveToElement(c).perform();
			String t = blue.getText();
			System.out.println(t);
		}
		
		driver.quit();
	}
}
