package Collection;

import java.util.Iterator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSet_Test 
{
	@Test
	public void Integertest()
	{
		TreeSet<Integer>set= new TreeSet<Integer>();
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(6);
		set.add(0);
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
	@Test
	public void StringTest()
	{
		TreeSet<String>set= new TreeSet<String>();
		set.add("A");
		set.add("Z");
		set.add("M");
		set.add("B");
		set.add("U");
		System.out.println(set);
		
		Iterator<String> it1 = set.iterator();
		
	}

}
