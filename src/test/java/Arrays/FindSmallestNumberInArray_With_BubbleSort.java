package Arrays;

import org.testng.annotations.Test;

public class FindSmallestNumberInArray_With_BubbleSort 
{
	@Test
	public void MinimumNumber()
	{
		int a[]= {10,55,2,48};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Minimum Number of array is :"+" "+a[0]);
	}
	
	@Test
	public void FirstMaximumNumber() 
	{
		int a[]= {88,77,53,98};
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
		System.out.println("Maximum Number of array is :"+"  "+a[0]);
		
	}

}
