package Strings;

import org.testng.annotations.Test;

public class Reverse_Each_Word 
{
	@Test
	public void reverse_Word()
	{
		String s1="i am software engineer in TestYantra";
		String[] word = s1.split(" ");
		String reverseword="";
		for(String w:word)
		{
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			reverseword=reverseword+sb.toString()+" ";
		}
		System.out.println(reverseword); // I ma erawtfos reenigne
	}
	
	@Test
	public void revereEach_Word_2()
	{
		String s="I am software engineer";
		String[] st = s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String str = st[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j)); // I ma erawtfos reenigne
			}
			System.out.print(" ");
		}
	}

}
