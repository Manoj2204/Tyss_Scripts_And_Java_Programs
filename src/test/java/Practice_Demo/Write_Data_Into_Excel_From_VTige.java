package Practice_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_Data_Into_Excel_From_VTige {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		WebElement lastname = driver.findElement(By.xpath("//a[text()='Go to Advanced Search']"));
		String lname = lastname.getText();

		FileInputStream fis = new FileInputStream("./src/test/resources/WriteExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		sheet.createRow(0).createCell(0).setCellValue(lname);
		FileOutputStream fos = new FileOutputStream("./src/test/resources/WriteExcelData.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("data is entered.....");
		
		
		
		

	}

}
