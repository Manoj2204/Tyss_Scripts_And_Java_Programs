package Practice_Pakage_CalenderPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kayak 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.kayak.co.in/flights");
		WebElement returnoption = driver.findElement(By.xpath("//span[text()='Return']"));
		returnoption.click();
		driver.findElement(By.id("oneway")).click();
//		WebElement from = driver.findElement(By.xpath("(//div[contains(@class, 'add-button')])[1]"));
//		from.click();
//		from.sendKeys("Bangalore");
//		WebElement bangalore = driver.findElement(By.xpath("//span[text()='Bengaluru, Karnataka, India']"));
//		Actions action = new Actions (driver);
//		action.moveToElement(bangalore).click();
		driver.findElement(By.xpath("//span[@aria-live='polite']")).click();
		
	}

}
