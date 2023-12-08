package Number_Series_Programs;

import org.testng.annotations.Test;

public class Check_7_Is_PrimeNumber_Or_Not 
{
	@Test
	public void test()
	{
		int num=7;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}	
			}
			if(count==2) 
			{
				System.out.println("Its prime Number");
			}
			else
			{
				System.out.println("Not prime Number");
			}
		}
	}
}
