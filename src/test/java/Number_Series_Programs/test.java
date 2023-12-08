package Number_Series_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test 
{
	@Test
	public void t()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	    driver.findElement(By.xpath("//span[text()='Departure']")).click();
	    driver.findElement(By.xpath("//div[text()='December 2023']/parent::div/parent::div/descendant::p[text()='20']")).click();
	    driver.findElement(By.xpath("//span[text()='Done']")).click();
	}
	
	

}
