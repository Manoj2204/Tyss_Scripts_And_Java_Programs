package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class LinkedList_test 
{
	@Test
	public void Linked()
	{
		LinkedList<Object>list= new LinkedList<Object>();
		list.add(20);
		list.add(50);
		list.add("HI");
		list.add(20);
		list.add(null);
		list.add(null);
		list.addFirst(32);
		list.addLast("bye-bye");
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
}
