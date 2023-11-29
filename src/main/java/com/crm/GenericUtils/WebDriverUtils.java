package com.crm.GenericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils 
{
	/**
	 * This method is used to maximize the window
	 */
	
	public void MaximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to minimize the window
	 */
	
	public void MinimizeWindow(WebDriver driver)
	{ 
		driver.manage().window().minimize();
	}
	
	
	/**
	 * This method is used for implicitlywait
	 * @param sec
	 */
	public void ImplicitlyWait(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	public void waitElementTobeVisible(int sec , WebElement element, WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitElementTobeClickable(int sec,WebElement element, WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForPageLoad(int sec,WebDriver driver)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
	}
	
	
	/**
	 * This method is used for Handle the dropdown
	 * @param element
	 * @param index
	 */
	public void dropdownSelectByIndex(WebElement element,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void dropdownSelectByVisibleText(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void dropdownSelectByValue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	
	/**
	 * This method is used for perform actions class method
	 */
	public void doubleClick(WebDriver driver)
	{
		Actions action= new Actions(driver);
		action.doubleClick().perform();
	}
	public void dragAndDrop(WebElement source ,WebElement target,WebDriver driver)
	{
		Actions action= new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	
	public void doubleClickOnWebElement(WebElement element,WebDriver driver)
	{
		Actions action= new Actions(driver);
		action.doubleClick(element).click().perform();
	}
	
	public void rightClickOnWebpage(WebDriver driver)
	{
		Actions action= new Actions(driver);
		action.contextClick().perform();
	}
	
	public void rightClickOnWebElement(WebElement element,WebDriver driver)
	{
		Actions action= new Actions(driver);
		action.contextClick(element).click().perform();
	}
	
	public void keyPress(WebDriver driver)
	{
	   Actions action= new Actions(driver);
	  action.sendKeys(Keys.ENTER).perform(); 
	} 
	
	public void moveToElement(WebElement element,WebDriver driver)
	{ 
		 Actions action= new Actions(driver);
		 action.moveToElement(element).perform();
	}
	public void ClickandHold(WebElement element,WebDriver driver)
	{
		 Actions action= new Actions(driver);
		 action.clickAndHold(element).perform();
	}
	
	public void releaseElement(WebElement element,WebDriver driver)
	{
		 Actions action= new Actions(driver);
		 action.release(element).perform();
	}
	
	public void scrollToElement(WebElement element,WebDriver driver)
	{
		 Actions action= new Actions(driver);
		 action.scrollToElement(element).perform();
	}
	
	public void scrollByElementIndex(int X,int Y,WebDriver driver)
	{
		 Actions action= new Actions(driver);
		 action.scrollByAmount(X, Y).perform();
	}
	
	
	/**
	 * This method is used for Perform Robot class method
	 * @throws AWTException
	 */
	public void keyPressEnter(WebDriver driver) throws AWTException
	{
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void keyReleaseEnter(WebDriver driver) throws AWTException
	{
		Robot rb= new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	/**
	 * This method is used to Switch The Frame
	 * @param index
	 */
	public void switchToFrameByIndex(int index,WebDriver driver)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameByFramename(String name,WebDriver driver)
	{
		driver.switchTo().frame(name);
	}
	public void switchToFrameByElement(WebElement element,WebDriver driver)
	{
		driver.switchTo().frame(element);
	}
	
	public void acceptAlertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void canceltAlertPopup(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void SwitchToWindow(String partialwinTitle,WebDriver driver)
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			String winId = it.next();
			String currentWinTitle = driver.switchTo().window(winId).getTitle();
			if (currentWinTitle.contains(partialwinTitle)) 
			{
				break;
				
			}
		}
	}
	
	public String getScreenshotAs(WebDriver sdriver,String screenshotName) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)sdriver;
		String timeStamp = LocalDateTime.now().toString().replace(':','-');
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path=".\\Screenshot\\"+screenshotName+""+timeStamp+".png";
		File dst=new File(path);
		FileUtils.copyFile(src, dst);
		
		return dst.getAbsolutePath();
		
	}
	/**
	 * This method is used for Scroll Webpage
	 */
	public void scrollTheWebPage(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	}
	
	/**
	 * This method is used for Dynamic scrolling
	 * @param element
	 */
	public void scrollAction(WebElement element,WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	
	
	

}
