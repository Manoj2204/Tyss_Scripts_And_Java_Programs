package WebElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LeftAlignmentForFacebook 
{
	@Test
	public void LeftAlignment()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		// left to right alignment for Username textField
		WebElement email = driver.findElement(By.id("email"));
		Rectangle emailrect = email.getRect();
		int emailStartX = emailrect.getX();
		System.out.println("left alignment for username : "+emailStartX);
		
		// left to right alignment for password textField
		WebElement password = driver.findElement(By.id("pass"));
		Rectangle passwordX = password.getRect();
		int passwordStartX = passwordX.getX();
		System.out.println("left alignment for : "+passwordStartX);
		
		if(emailStartX==passwordStartX)
		{
			System.out.println("Pass: The Left ALignment of Email and password textfield is found correct and it is verified.");
		}
		else
		{
			System.out.println("Fail: The Left ALignment of Email and password textfield is found Incorrect and it is verified.");

		}
		
		// Check username textfield height and width
		Dimension emailSize = email.getSize();
		int emailHeight = emailSize.getHeight();
		//System.out.println(emailHeight);
		
		//emailSize.get
		
		
		
		
		
		//driver.quit();
		
	}

}
