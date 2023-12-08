package Number_Series_Programs;

import org.testng.annotations.Test;

public class Print_Smallest_EvenNumber_In_Array 
{
	@Test
	public void test()
	{
		int a[]= {5,3,2,1,7,8,4,12};
		int small=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]%2==0)
			{
			   if(small>a[i])
				{
				   small=a[i];
				}
			   if(max<a[i])
			   {
				   max=a[i];
			   }
			}
		  
		}
		System.out.println("Smallest Even Number is: "+small);
		System.out.println("Maximum Even Number is :"+max);
	}
}
