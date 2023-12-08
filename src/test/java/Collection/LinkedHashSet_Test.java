package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class LinkedHashSet_Test 
{
	@Test
	public void test()

	{
		LinkedHashSet<Object>set= new LinkedHashSet<Object>();
		set.add(10);
		set.add("Hi");
		set.add(20);
		set.add(10);
		set.add("Hello");
		set.add(20);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		Iterator<Object> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
}
