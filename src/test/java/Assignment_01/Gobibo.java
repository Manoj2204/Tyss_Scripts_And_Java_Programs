package Assignment_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Gobibo 
{
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
       WebElement from = driver.findElement(By.xpath("//span[text()='From']/following-sibling::p"));
       from.click();
       Thread.sleep(1000);
       WebElement enterFrom = driver.findElement(By.xpath("//input[@type='text']"));
       enterFrom.sendKeys("Bengaluru");
       
       WebElement bengalore = driver.findElement(By.xpath("//span[text()='Bengaluru, India']"));
       Actions action = new Actions(driver);
       action.moveToElement(bengalore).click().perform();
       
       WebElement To = driver.findElement(By.xpath("//input[@type='text']"));
      
       To.sendKeys("dehradun");
       WebElement deradun = driver.findElement(By.xpath("//span[text()='Dehradun, India']"));
       action.moveToElement(deradun).click().perform();
       
    //   driver.findElement(By.xpath("//span[text()='Departure']")).click();
       
       
       driver.findElement(By.xpath("//div[text()='January 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='13']")).click();
       driver.findElement(By.xpath("//span[text()='Done']")).click();
       
       driver.findElement(By.xpath("//a[text()='Done']")).click();
       driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
       Thread.sleep(4000);
       
       
       
       //action.scrollByAmount(0, 1000).perform();
       
       //List<WebElement> TopChipestFlight = driver.findElements(By.xpath("//div[contains(@class,'srp-card-uistyles__Price') and translate(text(),'₹,','')<15500]"));
       /*for(WebElement price:TopChipestFlight)
       {
    	   String pricetext = price.getText();
    	   System.out.println(pricetext);
       }*/
       
       WebElement multiairline = driver.findElement(By.xpath("//li[text()='our products']"));
       JavascriptExecutor jse =(JavascriptExecutor)driver;
       //jse.executeScript("window.scrollBy(0,1500)");
       jse.executeScript("arguments[0].scrollIntoView(true);", multiairline);
       List<WebElement> TopChipestFlight = driver.findElements(By.xpath("//div[contains(@class,'srp-card-uistyles__Price') and translate(text(),'₹,','')<21200]"));
       for(int i=0;i<TopChipestFlight.size();i++)
       {
    	   String pricetext=TopChipestFlight.get(i).getText();
    	   System.out.println(pricetext);
    	   
       }
       
       
       /*for(; ;)
       {
    	   try 
    	   {
    	       List<WebElement> TopChipestFlight = driver.findElements(By.xpath("//div[contains(@class,'srp-card-uistyles__Price') and translate(text(),'₹,','')<15500]"));
    	       for(int i=0;i<TopChipestFlight.size();i++)
    	       {
    	    	   String pricetext=TopChipestFlight.get(i).getText();
    	    	   System.out.println(pricetext);
    	    	   
    	       }
    	       break;
    	       
		   } 
    	   catch (Exception e) 
    	   {
			    jse.executeScript("window.scrollBy(0,500)");
		   }
       }*/
       
       
       
       
       //driver.quit();
       
	
	}
}
