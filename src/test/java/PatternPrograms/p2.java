package PatternPrograms;

import org.testng.annotations.Test;

public class p2 
{
	@Test
	public void test()
	{
		
     /*	 ******
		 ****
		 ***
		 **
		 *     */
		
		int n=5;
		char ch='*';
		for(int col=0;col<=n;col++)
		{
			for(int row=0;row<=n;row++)
			{
				if(col<row)
				{
					System.out.print(ch+" ");   
					                            
				}
				
			}
			System.out.println(" ");
		}
		
	}

}
