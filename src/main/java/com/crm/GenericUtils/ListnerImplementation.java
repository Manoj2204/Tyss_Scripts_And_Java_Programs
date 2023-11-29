package com.crm.GenericUtils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementation implements ITestListener  
{
	WebDriverUtils wblib= new WebDriverUtils();
	ExtentReports report;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"-------- TestScript execution starts from here---");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+"--> Passed");
		Reporter.log(MethodName+"--------TestScript Executed Sucessfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String Fs = result.getMethod().getMethodName();
		String failedScript = Fs+ new JavaUtils().systemDateInFormat();
		
		test.addScreenCaptureFromPath(failedScript);
		try 
		{
			wblib.getScreenshotAs(BaseClass.sdriver, failedScript);
		} 
		catch (IOException e) 
		{
			//e.printStackTrace();
		}
		test.log(Status.FAIL, result.getThrowable()); 
		test.log(Status.FAIL, failedScript+"----- Failed");
		Reporter.log(failedScript+"----- Script Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
	
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+"----- Skip");
		Reporter.log(MethodName+"---------- TestScript execution is skip");
	}

	@Override
	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter htmlreport= new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("Scm");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("Scm_Flex");
		
		report= new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base-Browser","chrome");
		report.setSystemInfo("url", "http://rmgtestingserver/domain/Supply_Chain_Management/");
		report.setSystemInfo("Reporter", "Manoj");
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		report.flush();
	
	}

}
