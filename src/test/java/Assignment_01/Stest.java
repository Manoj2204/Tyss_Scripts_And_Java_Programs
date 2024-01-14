package Assignment_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Stest 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.skyscanner.co.in/");
		WebElement from = driver.findElement(By.xpath("//input[@id='originInput-input']"));
		from.click();
		from.sendKeys("Bangalore");
		from.sendKeys(Keys.ENTER);
		WebElement To = driver.findElement(By.xpath("//input[@id='destinationInput-input']"));
        To.click();
        To.sendKeys("Dehradun");
        To.sendKeys(Keys.ENTER);
        
        WebElement date = driver.findElement(By.xpath("//span[text()='Depart']"));
        date.click();
        Actions action= new Actions(driver);
        action.scrollByAmount(0, 500);
        
        driver.findElement(By.xpath("//button[@aria-label='Saturday, 13 January 2024. Select as return date']")).click();
        
		driver.findElement(By.xpath("//div[@class='SearchControls_directFlights__YWNjM']/following-sibling::button")).click();
		Thread.sleep(3000);
		
		
	}


	

}