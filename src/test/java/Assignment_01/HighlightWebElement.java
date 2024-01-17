package Assignment_01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighlightWebElement 
{
	@Test
	public void HightLigthAndTakeScreenShot() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("https://www.facebook.com/signup/");
		WebElement CustomButton = driver.findElement(By.xpath("//label[text()='Custom']"));
		jse.executeScript("arguments[0].scrollIntoView(true);", CustomButton);
		
		jse.executeScript("arguments[0].style.border='3px solid red'", CustomButton);
		System.out.println(CustomButton.getText());
		// Capture ScreenShot of CustomButton 
		//Thread.sleep(3000);
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File temp=CustomButton.getScreenshotAs(OutputType.FILE);
		TakesScreenshot ts = (TakesScreenshot)CustomButton;
		//File temp = ts.getScreenshotAs(OutputType.FILE);
	//	File dest = new File("C:\\Users\\91995\\git\\repository15\\Com.SCM_FlexSDTE-52\\scShots" +timeStamp+ "custom.png");
		FileUtils.copyFile(temp, new File("./scShots/"+timeStamp+"s1.png"));
		driver.quit();

		
		
	}

}
