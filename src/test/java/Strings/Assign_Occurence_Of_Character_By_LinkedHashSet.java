package Strings;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Assign_Occurence_Of_Character_By_LinkedHashSet 
{
	@Test
	public void OccurenceCharacter()
	{
		String s1= "hi hello hi hello welcome";
		String[] s = s1.split(" ");
		LinkedHashSet<String>set= new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String ch:set)
		{
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				if(ch.equals(s[i]))
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(ch+" "+count);
			}
		}
	}

}
