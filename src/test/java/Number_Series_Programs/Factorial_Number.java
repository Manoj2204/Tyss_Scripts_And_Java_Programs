package Number_Series_Programs;

import org.testng.annotations.Test;

public class Factorial_Number 
{
	@Test
	public void test()
	{
		int num=5;
		int sum=0;
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	}

}
