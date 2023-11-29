package Practice_Pakage_CalenderPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemyTrip 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Actions action= new Actions(driver);
		action.doubleClick().perform();
		Thread.sleep(5000);
		action.doubleClick().perform();
		//WebElement close = driver.findElement(By.xpath("//a[@class='close']"));
		Thread.sleep(5000);
		
		//action.click(close).perform();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		while(true)
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='November 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='7']")).click();
				break;
			}
			catch (NoSuchElementException e) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
	}

}
