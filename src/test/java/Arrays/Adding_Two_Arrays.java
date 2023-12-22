package Arrays;

import org.testng.annotations.Test;

public class Adding_Two_Arrays 
{
	@Test
	public void test()
	{
		int a[]= {4,5,6,2,3};
		int b[]= {2,3,3,4};
		int length =a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try 
			{
				System.out.print(a[i]+b[i]);
				
			} catch (Exception e) 
			{
				if (a.length<b.length) 
				{
					System.out.print(b[i]);
				} else 
				{
					System.out.print(a[i]);

				}
			}
		}
	}

}
