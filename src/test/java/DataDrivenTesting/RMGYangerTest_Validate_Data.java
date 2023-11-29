package DataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mysql.cj.jdbc.Driver;

public class RMGYangerTest_Validate_Data 
{
	@org.testng.annotations.Test
	public void Test() throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the project name");
		String pName = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.id("usernmae"));
		//username.click();
		username.sendKeys("rmgyantra");
		WebElement password = driver.findElement(By.id("inputPassword"));
		//password.click();
		password.sendKeys("rmgy@9999");
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signin.click();
		WebElement Project = driver.findElement(By.xpath("//a[text()='Projects']"));
		Project.click();
		WebElement createproject = driver.findElement(By.xpath("//span[text()='Create Project']"));
		createproject.click();
		WebElement projectName = driver.findElement(By.xpath("//input[@name='projectName']"));
		projectName.click();
		projectName.sendKeys(pName);
		WebElement projectManager = driver.findElement(By.xpath("//input[@name='createdBy']"));
		projectManager.click();
		projectManager.sendKeys("Deepak HR");
		WebElement dropdown = driver.findElement(By.xpath("//option[text()='Select Value']/parent::select"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByValue("Created");
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Add Project']"));
		submitButton.click();
		WebElement createdProject = driver.findElement(By.xpath("//td[text()='"+pName+"']"));
		System.out.println("Project is created.....");
		
		Driver driver1= new Driver();
		DriverManager.registerDriver(driver1);
		Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		Statement state = con.createStatement();
		try
		{
		//Validation in backend
		String query="select * from project;";
		ResultSet result = state.executeQuery(query);
		boolean flag = false;
		while(result.next())
		{
			String actual = result.getString(4);
			if (actual.equalsIgnoreCase(pName)) 
			{
				flag=true;
				break;
				
			}
		}
			if (flag)
			{
				System.out.println("project is created.......in database");
			}
			else 
			{
				System.out.println("Project is not created");
				
			}
		}
	
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally 
		{
			
			con.close();
		}
	
		
		
		
	}

}
