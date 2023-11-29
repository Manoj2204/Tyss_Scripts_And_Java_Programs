package com.crm.GenericUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.POM.AdminHomePage;
import com.POM.LoginPage;
import com.POM.ManufacturerAddproductPage;
import com.POM.ManufacturerHomePage;
import com.POM.ProductEditPage;
import com.POM.productListPage;

public class pomClassObjects 
{
	public static WebDriver driver;
	public  LoginPage loginpage = new LoginPage(driver);
	public  ManufacturerHomePage mHomepage = new ManufacturerHomePage(driver);
	public  ManufacturerAddproductPage mAddproductPage = new ManufacturerAddproductPage(driver);
	public AdminHomePage adminhomepage = new AdminHomePage(driver);
	public productListPage productlistpage = new productListPage(driver);
	public ProductEditPage editproductpage = new ProductEditPage(driver);
}
