package Map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.checkerframework.checker.units.qual.m;
import org.testng.annotations.Test;

public class linkedhashMap_test 
{
	@Test 
	public void test()
	{
		LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
		map.put(10,"Hello");
		map.put(20,"hi");
		map.put(10,"Bye");
		map.put(null, "hi");
		map.put(50, null);
		map.put(60, null);
		System.out.println(map);
		
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
