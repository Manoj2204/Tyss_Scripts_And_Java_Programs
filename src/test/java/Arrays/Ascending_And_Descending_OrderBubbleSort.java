package Arrays;

import java.util.Collections;

import org.testng.annotations.Test;

public class Ascending_And_Descending_OrderBubbleSort 
{
	@Test
	public void ascendingOrder()
	{
		int[]a= {10,20,50,18};
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
			System.out.print(a[i]+" ");
		}
		
		
	}
	
	@Test
	public void descendingOrder()
	{
		int[]a= {10,20,50,18};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]<a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
