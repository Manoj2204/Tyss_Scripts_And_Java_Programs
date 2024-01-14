package Java_Practice;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class syntaxForFluentwait 
{
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		FluentWait wait = new FluentWait<>(driver);
		wait.pollingEvery(Duration.ofMillis(2));
	}

}
