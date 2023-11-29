package Practice_Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_and_Read_Data_From_PropertyFile 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/Practice_demo_Read_propertyData.properties");
		Properties pobj=new Properties();
		pobj.setProperty("url", "https://google.com");
		pobj.setProperty("username", "admin");
		pobj.load(fis);
		FileOutputStream fos= new FileOutputStream("./src/test/resources/Practice_demo_Read_propertyData.properties");
		pobj.store(fos,"Write data");
		
		// Launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String URL = pobj.getProperty("url");
		driver.get(URL);
		WebElement Gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		String GmailText = Gmail.getText();
		pobj.setProperty("GmailText", GmailText);
		driver.close();
	}

}
