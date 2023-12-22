package Arrays;

import org.testng.annotations.Test;

public class First_Min_Number_Without_using_BubbleShort 
{
	@Test
	public void min()
	{
		int[]a= {20,88,98,36,11};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
			 else if (max<a[i]) 
			 { 
				 max=a[i]; 
		     }
			 
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
