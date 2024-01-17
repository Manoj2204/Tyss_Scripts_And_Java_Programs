package Assignment_01;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GobiboTest 
{
	@Test
	public void test()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
       WebElement from = driver.findElement(By.xpath("//span[text()='From']/following-sibling::p"));
       from.click();
       //Thread.sleep(1000);
       WebElement enterFrom = driver.findElement(By.xpath("//input[@type='text']"));
       enterFrom.sendKeys("Bengaluru");
       
       WebElement bengalore = driver.findElement(By.xpath("//span[text()='Bengaluru, India']"));
       Actions action = new Actions(driver);
       action.moveToElement(bengalore).click().perform();
       
       WebElement To = driver.findElement(By.xpath("//input[@type='text']"));
      
       To.sendKeys("dehradun");
       WebElement deradun = driver.findElement(By.xpath("//span[text()='Dehradun, India']"));
       action.moveToElement(deradun).click().perform();
      
       driver.findElement(By.xpath("//div[text()='January 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='18']")).click();
       driver.findElement(By.xpath("//span[text()='Done']")).click();
       
       driver.findElement(By.xpath("//a[text()='Done']")).click();
       driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
       
       for(;;)
       {
    	   WebElement fligthCount = driver.findElement(By.xpath("//span[@class='greyCnt']"));
   		   String strFligthCount = fligthCount.getText().replaceAll("[^0-9]", "");
   		   int numFligthCount = Integer.parseInt(strFligthCount);
    	   List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='srp-card-uistyles__Price-sc-3flq99-17 kxwFaC alignItemsCenter dF f600' ]"));
		  
           if(numFligthCount==allPrices.size())
           {
               List<WebElement> TopChipestFlight = driver.findElements(By.xpath("//div[contains(@class,'srp-card-uistyles__Price') and translate(text(),'₹,','')<9000]"));
               for(WebElement price:TopChipestFlight)
               {
            	   String p = price.getText();
//            	   TreeSet<String>t=new TreeSet<String>();
//            	   t.add(p);
            	   System.out.println(p);
               }
               break;
           }
           else
           {
        	   //action.sendKeys(Keys.PAGE_DOWN).perform();
               JavascriptExecutor jse =(JavascriptExecutor)driver;
               jse.executeScript("window.scrollBy(0,200)");
           }
       } 
       driver.quit();
       
	}
}
