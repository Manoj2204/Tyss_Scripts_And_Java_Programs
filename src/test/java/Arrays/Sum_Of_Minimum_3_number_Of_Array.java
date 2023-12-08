package Arrays;

import org.testng.annotations.Test;

public class Sum_Of_Minimum_3_number_Of_Array 
{
	@Test
	public void sumOfMini3()
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
		
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
     }
}

