package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Asign_Remove_Duplicate_Characters_From_String_By_LinkedHashMap 
{
	@Test
	public void Remove_Duplicate()
	{
		String s1="hi hello hi hello welcome";
		String[] s = s1.split(" ");
		LinkedHashMap<String, Integer>map=new LinkedHashMap<String, Integer>();
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
	   
	    for(Entry<String, Integer> m:map.entrySet())
	    {
	    	if(m.getValue()==1)
	    	{
	    		System.out.println(m.getKey()+" "+m.getValue());
	    	}
	    }
	} 

}
