package Number_Series_Programs;

import org.testng.annotations.Test;

public class PrimeNumber_From_1_30 
{
	@Test
	public void test()
	{
		int n=1;
		int m=30;
		for(int i=n;i<=m;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
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
