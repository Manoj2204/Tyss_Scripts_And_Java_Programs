package Number_Series_Programs;

import org.testng.annotations.Test;

public class Fibonacci_Series 
{
	@Test
	public void test()
	{
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}

}