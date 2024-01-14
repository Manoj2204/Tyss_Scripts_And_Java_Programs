package Assignment_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CrickBuzz_Live_Score 
{
	@Test
	public void test12() 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@id='women-tab']")).click();
		driver.findElement(By.xpath("(//a[@class='cb-lv-scrs-well cb-lv-scrs-well-live'])[5]")).click();
		
		//Batter
		WebElement Batesman = driver.findElement(By.xpath("(//a[@class='cb-text-link ng-binding'])[1]"));
		String BatesmanName = Batesman.getText();
		
		
		//Run
		WebElement R = driver.findElement(By.xpath("(//div[@ng-bind='batsmen.batRuns'])[1]"));
		String Run = R.getText();
		
		//Ball
		WebElement B = driver.findElement(By.xpath("(//div[@ng-bind='batsmen.batBalls'])[1]"));
		String Ball = B.getText();
		
		//4S
		WebElement F  = driver.findElement(By.xpath("(//div[@ng-bind='batsmen.batFours'])[1]"));
		String Four = F.getText();
		
//		//6S
		WebElement S = driver.findElement(By.xpath("(//div[@ng-bind='batsmen.batSixes'])[1]"));
		String Six = S.getText();
		
		System.out.println("BatesManName= "+BatesmanName    +   "   Run= "+Run +  "    Ball= " +Ball   + "   Four= "+Four+"  Six= "+Six);
        driver.quit();		
		
		
		
		
		
		
	}

}
