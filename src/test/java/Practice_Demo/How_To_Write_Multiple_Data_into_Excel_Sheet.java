package Practice_Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class How_To_Write_Multiple_Data_into_Excel_Sheet {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/overview");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> players = driver.findElements(By.xpath("//h4[text()='ODI Batting Rankings']/ancestor::div[@class='rankings-block__banner']/following-sibling::table/descendant::a"));
				
		int count = players.size();

		FileInputStream fis = new FileInputStream("./src/test/resources/Write_Multiple_ExcelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		sheet.createRow(0).createCell(0).setCellValue("Players Name");
		for (int i = 1; i < count; i++) {
			String playersName = players.get(i).getText();
			System.out.println(playersName);
			sheet.createRow(i).createCell(0).setCellValue(playersName);
		}
		FileOutputStream fos = new FileOutputStream("./src/test/resources/Write_Multiple_ExcelData.xlsx");
		wb.write(fos);
		wb.close();
		driver.close();

	}

}
