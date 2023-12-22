package Practice_Demo;

import org.testng.annotations.DataProvider;

public class DataProvider_Demo 
{
	@DataProvider
	public Object[][]test1()
	{
		Object[][]obj=new Object[4][4];
		obj[0][0]="manoj";
		obj[0][1]="kumar";
		obj[0][2]="9875432145";
		obj[0][3]="Manoj12345";
		
		obj[1][0]="salma";
		obj[1][1]="salu";
		obj[1][2]="8695236575";
		obj[1][3]="salma@3653";
		
		obj[2][0]="mujeeb";
		obj[2][1]="rehman";
		obj[2][2]="8695784235";
		obj[2][3]="mujju@123";
		
		obj[3][0]="divya";
		obj[3][1]="kumari";
		obj[3][2]="9865234722";
		obj[3][3]="divya@123";
		
		
		
		
		return obj;
	}

}
