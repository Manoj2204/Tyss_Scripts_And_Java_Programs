package Java_Practice;

import org.testng.annotations.Test;

public class PrintSecondMaximumNumber 
{
	@Test
	public void test()
	{
		int[]a= {7,6,47,25,5};
		int FirstMax=a[0];
		int secondMax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(FirstMax < a[i])
			{
				secondMax=FirstMax;
				FirstMax=a[i];
			}
			else if (secondMax < a[i] && FirstMax > a[i]) 
			{
				secondMax=a[i];
			}
		}
		System.out.println("Second Maximum is :"+ secondMax);
	}

}
