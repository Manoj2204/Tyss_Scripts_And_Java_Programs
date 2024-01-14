package Java_Practice;

import org.testng.annotations.Test;

public class FindLargestNumberInArrayWithUsingBubbleSort 
{
	@Test
	public void test()
	{
		int[]a= {47,89,7,9,86};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]);
		
	}

}
