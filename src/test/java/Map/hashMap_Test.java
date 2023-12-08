package Map;

import java.util.Hashtable;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class hashMap_Test 
{
	@Test
	public void test()
	{
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		map.put(10,"Hello");
		map.put(20,"HI");
		map.put(10,"Bye");
		System.out.println(map);
		
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+ "  "+m.getValue());
		}
		
		// To iterate
		for(Integer i:map.keySet())
		{
			System.out.println(i);
		}
	}
			

}
