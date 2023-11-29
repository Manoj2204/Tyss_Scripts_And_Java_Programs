package Assignment_01;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Spicejet 
{
	public static void main(String[] args) throws InterruptedException {
		Scanner sc= new Scanner(System.in);
		//Departure Date
		System.out.println("Enter the Date");
		int date =sc.nextInt();
		System.out.println("Enter the month");
		String month = sc.next();
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		//Return Date
		System.out.println("Enter the Return Date");
		int ReturnDate =sc.nextInt();
		System.out.println("Enter the Return Month");
		String ReturnMonth = sc.next();
		System.out.println("Enter the Return Year");
		int ReturnYear = sc.nextInt();
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		WebElement from = driver.findElement(By.xpath("//div[text()='From']"));
		from.click();
		WebElement delhi = driver.findElement(By.xpath("//div[text()='Delhi']"));
		Actions action= new Actions(driver);
		action.moveToElement(delhi).click().perform();
		WebElement bangalore = driver.findElement(By.xpath("//div[text()='Bengaluru']"));
		action.moveToElement(bangalore).click().perform();
		
		while(true)
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='"+month+" ' and text()='"+year+"']/../..//div[text()='"+date+"']")).click();
				break;
			}
			catch (NoSuchElementException e) 
			{
				driver.findElement(By.xpath("((//div[@data-testid='undefined-calendar-picker']//*[local-name()='svg' and @preserveAspectRatio='none'])[1]")).click();
			}
		}
		
		//Return Date	
		Thread.sleep(2000);
		
		
		while(true)
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='"+ReturnMonth+" ' and text()='"+ReturnYear+"']/../..//div[text()='"+ReturnDate+"']")).click();
				break;
			}
			catch (NoSuchElementException e) 
			{
				driver.findElement(By.xpath("(//div[@data-testid='undefined-calendar-picker']//*[local-name()='svg' and @preserveAspectRatio='none'])[1]")).click();
			}
		}
		
		//Passenger
		
		WebElement passenger = driver.findElement(By.xpath("//div[text()='Passengers']"));
		passenger.click();
		
		
		WebElement AdultPlusIcon = driver.findElement(By.xpath("//div[text()='Adult']/ancestor::div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6']/descendant::div[@data-testid='Adult-testID-plus-one-cta']"));
		AdultPlusIcon.click();
		WebElement doneButton = driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']"));
		action.scrollByAmount(0, 400);
		doneButton.click();
		
		//Currency
		WebElement Currency = driver.findElement(By.xpath("//div[text()='Currency']"));
		Currency.click();
		driver.findElement(By.xpath("//div[text()='INR']/parent::div[@data-focusable='true']")).click();
		
		
		WebElement searchFlight = driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		Thread.sleep(2000);
		searchFlight.click();
		Thread.sleep(3000);
		//driver.quit();
	}

}
