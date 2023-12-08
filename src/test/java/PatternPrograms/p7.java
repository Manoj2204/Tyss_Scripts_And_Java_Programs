package PatternPrograms;

import org.testng.annotations.Test;

public class p7 
{
	@Test
	public void test()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("2 ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}
