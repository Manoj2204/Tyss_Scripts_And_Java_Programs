package PatternPrograms;

import org.testng.annotations.Test;

public class p1 
{
//	*
//	**
//	***
//	****
//	*****
	
	@Test
	public void test()
	{
		int row=5;
		char ch='*';
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
			   System.out.print(ch);
			}
			System.out.println();
		}
	}

}
