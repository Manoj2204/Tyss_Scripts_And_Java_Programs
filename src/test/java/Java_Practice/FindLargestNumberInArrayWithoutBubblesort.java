package Java_Practice;

import org.testng.annotations.Test;

public class FindLargestNumberInArrayWithoutBubblesort 
{
	@Test
	public void test()
	{
		int[]a= {47,89,7,9,86};
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
