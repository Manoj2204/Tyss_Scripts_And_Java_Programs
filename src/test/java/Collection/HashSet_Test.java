package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class HashSet_Test
{
	@Test
	public void hast()
	{
		HashSet<Object>set= new HashSet<Object>();
		set.add(10);
		set.add("Hi");
		set.add(20);
		set.add("Hello");
		set.add(20);
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		ArrayList<Object>list= new ArrayList<Object>();
		list.add(10);
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		Iterator<Object>it= list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
