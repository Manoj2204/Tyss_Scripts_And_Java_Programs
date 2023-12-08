package Practice_Demo;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.annotations.VisibleForTesting;

public class DynamicScrollTheWebPage 
{
	@Parameters("url")
	@Test
	public void ptest(String url)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.google.com");
		driver.get(url);
		String actualTitle = driver.getTitle();
		String expectedTitle="google";
		SoftAssert s= new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		driver.close();
		//s.assertAll();
		
	}

}
