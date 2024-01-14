package JavaPracticePrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Test4 
{
	@Test
	public void Occurence()
	{
		String s="DDABCD";
		char[] s1 = s.toCharArray();
		
		LinkedHashMap<Character, Integer>map=new LinkedHashMap<>();
		for(int i=0;i<s1.length;i++)
		{
			if(map.containsKey(s1[i]))
			{
				map.put(s1[i], map.get(s1[i])+1);
			}
			else
			{
				map.put(s1[i], 1);
			}
		}
		for(Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()>=1)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
	}

}
