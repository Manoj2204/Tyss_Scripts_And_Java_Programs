package PracticeTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj = new Object[1][3];
		
		obj[0][0]="Manoj";
		obj[0][1]="Kumar";
		obj[0][2]="Mahto";
		
		/*
		 * obj[1][0]="Chennai"; obj[1][1]="Bangalore";
		 */
		return obj;
	}
	@DataProvider
	public Object[][] store()
	{
		Object[][] obj = new Object[2][3];
		
		obj[0][0]="Mumbai";
		obj[0][1]="chennai";
		obj[0][2]=120;
		
		obj[1][0]="Muysure";
		obj[1][1]="Kolkata";
		obj[1][2]=500;
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void get(String From,String To, int price)
	{
		System.out.println("From---"+From +" "+  "To---"+To+ price);
	}

}
