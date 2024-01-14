package JavaPracticePrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class printOnly_UniqueCharacter 
{
	@Test
	public void test()
	{
		int []a= {54,24,54,58,24,58,65};
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
	    for(int i=0;i<a.length;i++)
	    {
	    	if(map.containsKey(a[i]))
	    	{
	    		map.put(a[i], map.get(a[i])+1);
	    	}
	    	else
	    	{
	    		map.put(a[i], 1);
	    	}
	    }
	    for(Entry<Integer, Integer> m:map.entrySet())
	    {
	    	if(m.getValue()==1)
	    	{
	    		System.out.println(m.getKey()+" "+m.getValue());
	    	}
	    }
	
	}

}
