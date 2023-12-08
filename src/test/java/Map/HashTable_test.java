package Map;

import java.util.Hashtable;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashTable_test 
{
	@Test
	public void test()
	{
		Hashtable<String,Integer> map= new Hashtable<String,Integer>();
		map.put("Mango", 20);
		map.put("apple",10);
		map.put("Banana", 100);
		map.put("orange", 20);
		map.put("Mango", 20);
		System.out.println(map);
		
		for(Entry<String, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}
