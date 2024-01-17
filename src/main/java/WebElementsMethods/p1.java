package WebElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class p1 
{
	@Test
   public void test()
   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		Dimension emailSize = email.getSize();
		System.out.println(emailSize);
		
		int emailHeight = emailSize.getHeight();
		System.out.println(emailHeight);
		
		int emailWidth = emailSize.getWidth();
		System.out.println(emailWidth);
		
		Point emailLocation = email.getLocation();
		System.out.println(emailLocation);
		driver.quit();
		
		
		
   }
}
