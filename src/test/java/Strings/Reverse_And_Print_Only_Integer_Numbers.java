package Strings;

import org.testng.annotations.Test;

public class Reverse_And_Print_Only_Integer_Numbers 
{
	@Test
	public void reverse()
	{
		String s="Tekion234inter52view54";
		String[] st = s.split("[A-Z a-z]");
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
	}

}
