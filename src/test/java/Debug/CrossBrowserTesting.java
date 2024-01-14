package Debug;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting 
{
	public static WebDriver  driver;
	public static void main(String[] args) 
	{
		
	
	    
		String browserName="edge";
		if(browserName.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if (browserName.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Sucessfully launch the URL");
		//driver.close();
		
	}

}
