package Assignment_01;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassForSeleniumGrid 
{
	RemoteWebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void configBeforeMethod(String browser) throws MalformedURLException
	{
		URL url =new URL("http://192.168.216.218:6666/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		if(browser.equals("chrome"))
		{
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if (browser.equals("firefox")) 
		{
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);	
		}
		driver=new RemoteWebDriver(url,cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
