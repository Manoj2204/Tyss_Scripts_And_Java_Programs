package JavaPracticePrograms;

import org.testng.annotations.Test;

public class SwapFirstAndLastWord 
{
	@Test
	public void test()
	{
		String s="i am software engineer";
		String[] st = s.split(" ");
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
	}
	
	@Test
	public void test2()
	{
		String s="i am software engineer";
		String []st=s.split(" ");
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}
	}

}
