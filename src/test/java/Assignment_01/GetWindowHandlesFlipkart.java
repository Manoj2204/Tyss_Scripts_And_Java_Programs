package Assignment_01;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GetWindowHandlesFlipkart 
{
	@Test
	public void SwitchToNexWindow()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("ip");
		WebElement iphone = driver.findElement(By.xpath("//div[text()='hone']"));
		Actions action=new Actions(driver);
		action.moveToElement(iphone).click().perform();
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 Pro (Natural Titanium, 128 GB)']")).click();
		
		Set<String> allwindowID = driver.getWindowHandles();
		for(String windowid:allwindowID)
		{
			String actaulTitle = driver.getCurrentUrl();
			String expectTitle="APPLE iPhone 15 Pro ( 128 GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com";
			if (actaulTitle.equals(expectTitle)) 
			{
			    String title = driver.getTitle();
			    System.out.println(title);
			}
		}
		
		/*Iterator<String> it = allwindowID.iterator();
		while (it.hasNext()) 
		{
			String windowID = it.next();
			String actaulTitle = driver.switchTo().window(windowID).getTitle();
			String expectTitle="APPLE iPhone 15 Pro ( 128 GB Storage, 0 GB RAM ) Online at Best Price On Flipkart.com";
            if (actaulTitle.equals(expectTitle)) 
            {
            	String title = driver.getTitle();
            	System.out.println(title);
				
			}
			
		}*/
		
		/*ArrayList<String> list= new ArrayList<String>(allwindowID);
		String parentWindow = list.get(0);
		String childWindow = list.get(1);
		driver.switchTo().window(childWindow);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();*/
	}

}
