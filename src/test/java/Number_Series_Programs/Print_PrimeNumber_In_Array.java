package Number_Series_Programs;

import org.testng.annotations.Test;

public class Print_PrimeNumber_In_Array 
{
	@Test
	public void test()
	{
		int a[]= {7,4,2,1,5,9,8,3};
		for(int i=1;i<a.length;i++)
		{
			int count=0;
			for(int j=1;j<a.length;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
