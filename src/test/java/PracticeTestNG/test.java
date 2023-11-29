package PracticeTestNG;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.GenericUtils.json;

import DataDrivenTesting.JsonGenericMethod;

public class test 
{
	@Test
	public void test() throws IOException, ParseException
	{
		WebDriver driver= new ChromeDriver();
		json j = new json();
		JsonGenericMethod js= new JsonGenericMethod();
		/*
		 * driver.get("https://www.google.com"); j.MaximizeWindow();
		 */
		System.out.println(js.readDataFromJson("browser"));
	}

}
