package Practice_Demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLink_Practice 
{
	@Test
	public void BrokenLink() throws IOException
	{
		ArrayList<String> list= new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
	    for(int i=0;i<allLinks.size();i++)
	    {
	    	String link = allLinks.get(i).getAttribute("href");
	        URL url = null;
	        int statusCode=0;
	        try 
	        {
	        	url =new URL(link);
	        	HttpsURLConnection httpsurlconn= (HttpsURLConnection)url.openConnection();
	        	statusCode = httpsurlconn.getResponseCode();
	        	if(statusCode>=400)
	        	{
	        		list.add(link);
	        		System.out.println(link +"------"+statusCode);
	        		
	        	}
	        }
	        catch (MalformedURLException e) 
	        {
				System.out.println(link + "------"+statusCode);
			}
	    }
	    driver.quit();
	
	}

}
