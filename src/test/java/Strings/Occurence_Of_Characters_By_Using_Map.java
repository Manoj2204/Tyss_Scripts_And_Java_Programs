package Strings;

import java.util.HashMap;
import java.util.Map.Entry;

import org.checkerframework.checker.units.qual.m;
import org.testng.annotations.Test;

public class Occurence_Of_Characters_By_Using_Map 
{
	@Test
	public void test()
	{
		String s1="Tester";
	    String s = s1.toLowerCase();
	    HashMap<Character, Integer>map=new HashMap<Character, Integer>();
	    for(int i=0;i<s.length();i++)
	    {
	    	if(map.containsKey(s.charAt(i)))
	        {
	    		map.put(s.charAt(i), map.get(s.charAt(i))+1);
	    	}
	    	else
	    	{
	    		map.put(s.charAt(i),1);
	    	}
	    }
	    System.out.println(map);
	    for( Entry<Character, Integer> m:map.entrySet())
	    {
	    	if(m.getValue()>=1)
	    	{
	    		System.out.println(m.getKey()+" "+m.getValue());
	    	}
	    }
	   
}
}
