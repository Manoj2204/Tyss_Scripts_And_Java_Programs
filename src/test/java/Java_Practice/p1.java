package Java_Practice;

import org.testng.annotations.Test;

public class p1 
{
	@Test
	public void test()
	{
		int a[]= {2,98,65,7};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
