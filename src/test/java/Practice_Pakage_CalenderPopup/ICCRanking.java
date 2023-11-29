package Practice_Pakage_CalenderPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCRanking 
{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement southafrica = driver.findElement(By.xpath("//span[text()='South Africa']"));
		if (southafrica.isDisplayed()) 
		{
			System.out.println("South africa is displayed....");
			
		}
		else 
		{
			System.out.println("South africa is not displayed....");
			
		}
	}

}
