package Practice_Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleMap 
{
	@Test
	public void test() throws InterruptedException, AWTException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose from location");
		String from = sc.nextLine();
		System.out.println("Enter the To Location");
		String To = sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/maps/");
		WebElement directionBtn = driver.findElement(By.xpath("//button[@aria-label='Directions']"));
		directionBtn.click();
		WebElement choseDirection = driver.findElement(By.xpath("//input[contains(@placeholder,'Choose starting point')]"));
		choseDirection.sendKeys(from);
		//Thread.sleep(3000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement Todest = driver.findElement(By.xpath("//input[@aria-label='Choose destination...']"));
		//Todest.click();
		Todest.sendKeys(To);
		
		
	}

}
