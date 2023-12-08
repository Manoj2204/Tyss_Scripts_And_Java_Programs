package Map;

import java.util.Map.Entry;
import java.util.TreeMap;

import org.checkerframework.checker.units.qual.m;
import org.testng.annotations.Test;

public class Treemap_Test 
{
	@Test
	public void test()
	{
		TreeMap<String,Integer>map=new TreeMap<String,Integer>();
		map.put("Mango", 20);
		map.put("Apple", 20);
		map.put("Orange", null);
		map.put("Banana", 120);
		System.out.println(map);
		
		for(Entry<String, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
	}

}
