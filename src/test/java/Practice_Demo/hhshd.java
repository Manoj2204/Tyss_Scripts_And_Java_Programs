package Practice_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hhshd 
{
public static void main(String[] args) throws IOException 
{
	Properties pobj= new Properties();
	pobj.setProperty("browser","chrome");
	pobj.setProperty("url","http://rmgtestingserver:8888/");
	pobj.setProperty("username","admin");
	pobj.setProperty("password","admin");
	
	// create obj for fileinputstream
	 FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testdata.properties");
	 pobj.load(fis);
	 FileOutputStream f0s = new FileOutputStream(".\\src\\test\\resources\\testdata.properties");
	 pobj.store(f0s, "write data");
	String BROWSER = pobj.getProperty("browser");
	String URL = pobj.getProperty("url");
	String USERNAME = pobj.getProperty("username");
	String PASSWORD = pobj.getProperty("password");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
	WebElement lastname = driver.findElement(By.xpath("//a[text()='csdww']"));
	String lname = lastname.getText();
	
	
	pobj.setProperty("lastname", lname);
	FileOutputStream f0s1 = new FileOutputStream(".\\src\\test\\resources\\testdata.properties");
	pobj.store(f0s, "write data");
	 FileInputStream fis1 = new FileInputStream(".\\src\\test\\resources\\testdata.properties");
	 pobj.load(fis);
	
	
	System.out.println(lname);
	driver.close();
	
	
}

}
