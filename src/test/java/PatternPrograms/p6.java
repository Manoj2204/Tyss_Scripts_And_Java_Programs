package PatternPrograms;

import org.testng.annotations.Test;

public class p6 
{
	
//	5 4 3 2 1 
//	5 4 3 2 
//	5 4 3 
//	5 4 
//	5
	
	@Test
	public void test()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=5;
			for(int j=i;j<=n;j++)
			{
				System.out.print(k--+" ");
			}
			System.out.println();
		}
	}

}
