package Assignment_01;

import java.io.FilterWriter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class PoductName_Along_With_Price 
{
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action= new Actions(driver);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement searchTextField = driver.findElement(By.xpath("//input[@type='text']"));
		searchTextField.click();
		searchTextField.sendKeys("tshirt for men");
		WebElement tshirtForMens = driver.findElement(By.xpath("//div[@class='YGcVZO _2VHNef']/child::div"));
		action.moveToElement(tshirtForMens).click().perform();
		WebElement Men = driver.findElement(By.xpath("//span[text()='Men']"));
		action.moveToElement(Men).perform();
		WebElement fasttrackWatch = driver.findElement(By.xpath("//a[text()='Fastrack']"));
		action.moveToElement(fasttrackWatch).click().perform();
		driver.findElement(By.xpath("//a[text()='Opulence Analog Watch  - For Men 3288QM01']")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		ArrayList<String>windowid=new ArrayList<String>(allWindowId);
		String childWindow = windowid.get(1);
		driver.switchTo().window(childWindow);
		WebElement product = driver.findElement(By.xpath("//span[text()='Opulence Analog Watch  - For Men 3288QM01']"));
		String procductName = product.getText();
		WebElement price = driver.findElement(By.xpath("//span[text()='Opulence Analog Watch  - For Men 3288QM01']/ancestor::div[@class='aMaAEs']/descendant::div[@class='_30jeq3 _16Jk6d']"));
		String productPrice = price.getText();
		System.out.println(procductName+" ----"+productPrice);
		
		
		
		
		driver.quit();
		
		
	
	}

}
