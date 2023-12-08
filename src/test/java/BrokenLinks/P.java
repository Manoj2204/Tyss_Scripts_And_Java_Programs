package BrokenLinks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P 
{
	@Test
	public void test()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		ArrayList<String>list= new ArrayList<String>(allwindow);
		String parent = list.get(0);
		String child = list.get(1);
		driver.switchTo().window(child);
		
		//JavascriptException jse= (JavascriptException)driver;
		WebElement element = driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase fw-bold']"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		//element.click();
		jse.executeScript("arguments[0].click();", element);
		
		
	}

}
