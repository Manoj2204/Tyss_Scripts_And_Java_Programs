package Strings;

import org.testng.annotations.Test;

public class Reverse_Complete_String 
{
	@Test
	public void test()
	{
		String s="i am software engineer";
		String[] st = s.split(" ");
		
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
	}

}
