package Arrays;

import org.testng.annotations.Test;

public class Combinatio_Sum_Of_Array_11 
{
	@Test
	public void test()
	{
		int a[]= {8,2,3,7,6,4,9,5};
		int sum=11;
		
		for(int i=0;i<a.length;i++)
		{
			int c=sum-a[i];
			System.out.println(a[i]+"+"+c+"="+sum);
		}
	}

}
