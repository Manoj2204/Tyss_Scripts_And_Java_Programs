package Practice_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class practice {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
		WebElement bakery = driver.findElement(By.xpath("//div[@aria-labelledby='headlessui-menu-button-:Rn69b6:']/descendant::a[contains(.,'Dairy')]"));
				

		// Actions class object
		Actions action = new Actions(driver);
		action.moveToElement(bakery).build().perform();

		List<WebElement> alloptions = driver.findElements(By.xpath("//a[@class='CategoryTree___StyledLink3-sc-8wbym9-2 kTPRNM' and contains(@href, 'hygiene')]"));		
		for (WebElement option : alloptions) 
		{
			String text = option.getText();
			System.out.println(text);
		}

		driver.close();

	}

}
