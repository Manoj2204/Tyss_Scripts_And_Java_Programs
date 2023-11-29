package Practice_Pakage_CalenderPopup;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MachesAndConditions 
{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> pos = driver.findElements(By.xpath("//td[@class='table-body__cell table-body__cell--position u-text-right']|/span[@class='u-hide-phablet']"));
		 List<WebElement> countryname = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		for(int i=0;i<countryname.size();i++)
		{
			String position = pos.get(i).getText();
			String Country = countryname.get(i).getText();
			System.out.println(position +" ---"+Country);
		}
	}

}
