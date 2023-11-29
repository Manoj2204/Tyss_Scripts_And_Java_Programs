package PracticeTestNG;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.openqa.*;
public class SoftAssertTest 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		String expectedTitle="goole";
		SoftAssert s= new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		driver.close();
		s.assertAll();
		
	}

}
