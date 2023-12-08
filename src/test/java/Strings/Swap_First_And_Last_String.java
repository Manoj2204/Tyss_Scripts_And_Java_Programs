package Strings;

import org.testng.annotations.Test;

public class Swap_First_And_Last_String 
{
	@Test
	public void test()
	{
		String s="i am software engineer";
		String[] st = s.split(" ");
		//st[0]=i st[1]=am st[2]=software st[3]=engineer
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
	}

}
