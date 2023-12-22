package Java_Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccurenceOfEachCharacterByLinkedHasMap 
{
	@Test
	public void test()
	{
		String s="helloworld";
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
        	if(map.containsKey(s.charAt(i)))
        	{
        		map.put(s.charAt(i),map.get(s.charAt(i))+1);
        	}
        	else
        	{
        		map.put(s.charAt(i),1);
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
