package Strings;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Print_Vowel_Without_Duplicate 
{
	@Test
	public void Approach_1_WithDuplicates()
	{
		String st="india";
		char[] s = st.toCharArray();
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=='a'|| s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
			{
				count++;
				System.out.println(s[i]);
			}
		}
	}
	
	@Test
	public void Approach_2()
	{
		String st="india";
		LinkedHashSet<Character>set= new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));
			
		}
			int count=0;
			for(Character ch:set)
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
					System.out.println(ch);
				}
			}
			System.out.println(count);
		}
}
