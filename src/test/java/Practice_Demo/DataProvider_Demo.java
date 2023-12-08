package Practice_Demo;

import org.testng.annotations.DataProvider;

public class DataProvider_Demo 
{
	@DataProvider
	public Object[][]test1()
	{
		Object[][]obj=new Object[4][2];
		obj[0][0]="manoj";
		obj[0][1]="kumar";
		
		obj[1][0]="salma";
		obj[1][1]="salu";
		
		obj[2][0]="mujeeb";
		obj[2][1]="rehman";
		
		obj[3][0]="divya";
		obj[3][1]="kumari";
		
		
		
		
		return obj;
	}

}
