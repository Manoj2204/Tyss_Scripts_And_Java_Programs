package Practice_Pakage_CalenderPopup;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month");
		String month = sc.next();
		System.out.println("Enter the year");
		int year = sc.nextInt();
		System.out.println("Enter the day");
		int day = sc.nextInt();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
		
		WebElement departure = driver.findElement(By.xpath("//span[text()='Departure']"));
		departure.click();
		while(true)
		{
			try {
				    driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']")).click();
				    break;
			    } 
			catch (NoSuchElementException e) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		WebElement doneButton = driver.findElement(By.xpath("//span[text()='Done']"));
		doneButton.click();
		
	}

}
