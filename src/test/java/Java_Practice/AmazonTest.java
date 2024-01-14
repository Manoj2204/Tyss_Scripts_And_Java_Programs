package Java_Practice;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest 
{
	@Test
	public void test() throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the page number");
		String page = sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.click();
		searchBox.sendKeys("Iphone 13 pro max");
		searchBox.sendKeys(Keys.ENTER);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		WebElement pg = driver.findElement(By.xpath("//a[text()='"+page+"']"));
		
		for(; ;)
		{
			try 
			{
				pg.click();
			} catch (Exception e) 
			{
				jse.executeScript("arguments[0].scrollIntoView(true);", pg);
			}
			Thread.sleep(3000);
		}
	


	
	}

}
