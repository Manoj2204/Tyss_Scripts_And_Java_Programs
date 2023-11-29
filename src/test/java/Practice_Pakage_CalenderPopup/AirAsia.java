package Practice_Pakage_CalenderPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirAsia
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.airindia.in/");
		
		
		Thread.sleep(2000);
		WebElement oneWay = driver.findElement(By.xpath("//label[@for='mat-radio-2-input']/descendant::span[@class='mat-radio-container']"));
		oneWay.click();
		WebElement DepartingCalenderButton = driver.findElement(By.xpath("//div[@class='date-field col-6 col-lg-5']"));
		DepartingCalenderButton.click();
		driver.findElement(By.xpath("//div[@aria-label='Friday, November 17, 2023']")).click();
		
	}

}
