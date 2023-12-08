package BrokenLinks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nikhil1 
{
	@Test
	public void test() throws InterruptedException

	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.open('https://www.myntra.com/')");
		jse.executeScript("window.open('https://www.cleartrip.com/')");
		jse.executeScript("window.open('https://www.kayak.co.in/')");
		jse.executeScript("window.open('https://www.facebook.com/signup')");
		
		
		Set<String> allWindowId = driver.getWindowHandles();
		ArrayList<String>list= new ArrayList<String>(allWindowId);
		String amazonwindowid = list.get(0);
		String Mynthrawindowid = list.get(1);
		String ClearTripwindowid = list.get(2);
		String Kayakwindowid = list.get(3);
		String Facebookwindowid = list.get(4);
		driver.close();
		//Thread.sleep(2000);
		//driver.switchTo().window(ClearTripwindowid);
		for (String w : allWindowId) 
		{
			String url = driver.switchTo().window(w).getCurrentUrl();
			if(url.equals("https://www.facebook.com"))
			{
				break;
			}
			Thread.sleep(2000);
			
		}
		
	}
	
}
