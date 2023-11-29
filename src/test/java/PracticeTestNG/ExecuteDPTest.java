package PracticeTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDPTest 
{
	@Test(dataProviderClass = DataProviderExcelTest.class,dataProvider = "data")
	public void getData(String name, String value )
	{
	   // WebDriver driver= new ChromeDriver();	
	   // driver.manage().window().maximize();
	    //driver.get("");
	    System.out.println(name + "----"+ value );
	}
	
	

}
