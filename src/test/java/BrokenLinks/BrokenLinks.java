package BrokenLinks;



import java.io.IOException;
import java.net.HttpURLConnection;
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

public class BrokenLinks 
{
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in/oprs-web/");
		ArrayList <String> list= new ArrayList<String>();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		//int size = allLinks.size();
		//System.out.println(size);
		for(int i=0;i<allLinks.size();i++)
		{
			String eachLink = allLinks.get(i).getAttribute("href");
			URL url=null;
			int statusCode= 0;
			try {
				url=new URL(eachLink);
				HttpsURLConnection httpurlConn = (HttpsURLConnection) url.openConnection();
				statusCode = httpurlConn.getResponseCode();
				if (statusCode>=400) 
				{
					list.add(eachLink);
					System.out.println(eachLink+"-----"+statusCode);
				}
				
			}
			catch (MalformedURLException e) 
			{
				System.out.println(eachLink+"-----"+statusCode);
			}
			
		}
		driver.quit();
	}
	

}
