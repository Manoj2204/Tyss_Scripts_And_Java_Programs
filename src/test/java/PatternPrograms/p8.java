package PatternPrograms;

import org.testng.annotations.Test;

public class p8 
{
//	A 
//	B C 
//	D E F 
//	G H I J 
//	K L M N O 
	
	@Test
	public void test()
	{
		int n=5;
		char ch='A';
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
