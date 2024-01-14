package Java_Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class RemoveDuplicateNumberFromArray 
{
	@Test
	public void test()
	{
		int[] a = {10,11,12,13,11,10};
		LinkedHashMap<Integer, Integer>map=new LinkedHashMap<Integer, Integer>();
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
				System.out.println(m.getKey()+m.getValue());
			}
		}
	}
}
