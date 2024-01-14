package Debug;

import org.testng.annotations.Test;

public class Sum 
{
	@Test
	public void SumOfElement()
	{
		int a=10;
		int b=20;
		int sum=0;
		sum=a+b;
		
		System.out.println("Execution start");
		System.out.println(sum);
	}

}
