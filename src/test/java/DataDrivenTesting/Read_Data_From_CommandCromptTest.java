package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Read_Data_From_CommandCromptTest
{
	@Test
	public void test() throws IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile= new File(".//Screenshot/screenshot.png");
		FileUtils.copyFile(tempfile, destfile);
		driver.close();
		
	}

}
