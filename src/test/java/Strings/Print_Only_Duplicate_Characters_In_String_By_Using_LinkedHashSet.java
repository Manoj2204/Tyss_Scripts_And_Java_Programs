package Strings;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Print_Only_Duplicate_Characters_In_String_By_Using_LinkedHashSet 
{
	@Test
	public void test()
	{
		String s1= "Tester";
		String s = s1.toLowerCase();
		LinkedHashSet<Character>set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch+" "+count);
			}
		}
	}

}
