package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Print_Only_Non_repeated_Char_In_String_By_USing_Map 
{
	
    @Test
	public void test()
	{
		String s1="Tester";
	    String s2 = s1.toLowerCase();
	    char[] s = s2.toCharArray();
	    LinkedHashMap<Character, Integer>map=new LinkedHashMap<Character, Integer>();
	    for(int i=0;i<s.length;i++)
	    {
	    	if(map.containsKey(s[i]))
	        {
	    		map.put(s[i], map.get(s[i])+1);
	    	}
	    	else
	    	{
	    		map.put(s[i],1);
	    	}
	    }
	   
	    for(Entry<Character, Integer> m:map.entrySet())
	    {
	    	if(m.getValue()==1)
	    	{
	    		System.out.println(m.getKey()+" "+m.getValue());
	    	}
	    }
	} 

}
