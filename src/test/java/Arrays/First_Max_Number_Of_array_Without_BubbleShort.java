package Arrays;

import org.testng.annotations.Test;

public class First_Max_Number_Of_array_Without_BubbleShort 
{
	@Test
	public void max()
	{
		int a[]= {28,9,6,88};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
