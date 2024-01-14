package DataDrivenTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
public class ReadDataFromTextFile 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

		// Read test data from the text file
		String filePath = "C:\\Users\\91995\\Desktop\\DDTByusingPlainTextFile.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
		{
			String line;
			while ((line = reader.readLine()) != null) 
			{
				// Split the commas from FirstName and LastName
				String[] data = line.split(",");
				String username = data[0];
				String LastName = data[1];
				String Email    =   data[2];

				// Execute the test with the current set of data
				Login(driver, username, LastName,Email);
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public static void Login(WebDriver driver, String username, String LastName,String Email) 
	{

		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement usernameField = driver.findElement(By.name("firstname"));
		WebElement LastNameField = driver.findElement(By.name("lastname"));
		WebElement p = driver.findElement(By.name("reg_email__"));

		// Enter username and LastName
		usernameField.sendKeys(username);
		LastNameField.sendKeys(LastName);
		p.sendKeys(Email);

	}
}



