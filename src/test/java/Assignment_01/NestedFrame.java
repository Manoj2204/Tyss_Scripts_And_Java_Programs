package Assignment_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NestedFrame extends BaseClassForSeleniumGrid
{
	@Test
	public void test9() throws InterruptedException
	{
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		jse.executeScript("window.scrollBy(0,1000);");

		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	    WebElement parentFrame = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
	    driver.switchTo().frame(parentFrame);
	    
	    
	
	    WebElement childFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
	    wait.until(ExpectedConditions.elementToBeClickable(childFrame));
	    driver.switchTo().frame(childFrame);

	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manoj Kumar");
	    
	    // Switch Back
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
	    
	    WebElement singleFrame = driver.findElement(By.id("singleframe"));
	    driver.switchTo().frame(singleFrame);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World...");
	    
	   // Thread.sleep(3000);
	    driver.quit();
	
	}

}
