package Assignment_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class redbus 
{
	@Test
	public void test4() throws InterruptedException

	{
		ChromeOptions  option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement from = driver.findElement(By.xpath("//label[text()='From']/preceding-sibling::input"));
		from.click();
		from.clear();
		from.sendKeys("Bangalore");
		
		Actions action=new Actions(driver);
		WebElement bangalore = driver.findElement(By.xpath("//text[text()='Bangalore']"));
		action.moveToElement(bangalore).click().perform();
		
		
		
		driver.findElement(By.xpath("//label[text()='To']/preceding-sibling::input")).sendKeys("Mangaluru");
		WebElement mangalore = driver.findElement(By.xpath("//text[text()='Mangaluru' and @class='placeHolderMainText']"));
		action.moveToElement(mangalore).click().perform();
		
		WebElement date = driver.findElement(By.xpath("//span[text()='Date']"));
		//
		date.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,500);");
		
		for(; ;)
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='Feb']/ancestor::div[contains(@class,'DatePicker__M')]/descendant::span[@class='DayTilesWrapper__SpanContainer-sc-19pz9i8-0 hQhlTG']/descendant::span[text()='3' and contains(@class,'bwoYtA')]")).click();
			    break;
			} catch (Exception e) 
			{
				driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']/*[local-name()='svg' and @id='Layer_1']/parent::div")).click();
			}
			Thread.sleep(1000);
		}
		
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		Thread.sleep(2000);
		
		for(;;)
		{
			
		
		WebElement allBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		String buses = allBuses.getText().replaceAll("[^0-9]", "");
		int busCount = Integer.parseInt(buses);
		
		List<WebElement> AllBuses = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		//System.out.println(busCount);
		/*WebElement  BusSIze=driver.findElement(By.xpath("//span[@class='f-bold busFound' and (translate(text(),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ'))>=72]"));
		System.out.println(BusSIze.getText());*/
		 
        if(busCount==AllBuses.size())
        {
        	for(WebElement BusesName:AllBuses)
        	{
        		 String bus = BusesName.getText();
        		 System.out.println(bus);
        		 //System.out.println(BusesName.getSize());
        		
        	}
        	  break;
        }
        else
        {
        	JavascriptExecutor jse2 =(JavascriptExecutor)driver;
            jse2.executeScript("window.scrollBy(0,200)");

        }
		}
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//jse.executeScript("window.scrollBy(0,300);");
		/*driver.findElement(By.xpath("//div[text()='Got It']")).click();
		Thread.sleep(5000);
		int count=0;
		
		
		
		
		
		WebElement element = driver.findElement(By.xpath("//td/child::a[text()='Sugama  Tourist']"));
		action.scrollToElement(element).perform();
		
		List<WebElement> AllBuses = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		int Sizecount = AllBuses.size();
		count=count+Sizecount;
		System.out.println(count);*/
		
		
		/*for(; ;)
		{
			try 
			{
				List<WebElement> AllBuses = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
				int Sizecount = AllBuses.size();
				count=count+Sizecount;
					//driver.findElement(By.xpath("//td/child::a[text()='Sugama  Tourist']")).click();
					
				
				
			} catch (Exception e) 
			{
				jse.executeScript("window.scrollBy(0,200);");
				break;
			}
			
		}
		System.out.println(count);
		
		
		
		/*for(WebElement bus:AllBuses)
		{
			String BusName = bus.getText();
			System.out.println(BusName);
			
		}
		System.out.println("Buses Count is =  "+count);*/
		
		
		
		
		
	}
}
