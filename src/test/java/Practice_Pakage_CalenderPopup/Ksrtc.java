package Practice_Pakage_CalenderPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ksrtc 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		WebElement Departure = driver.findElement(By.id("txtJourneyDate"));
		Actions action= new Actions(driver);
		action.scrollByAmount(0, 200).perform();
		Departure.click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/ancestor::div[@id='ui-datepicker-div']/descendant::a[text()='15']")).click();
		
		
		
	}

}
