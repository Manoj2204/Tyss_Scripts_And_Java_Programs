package Collection;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class Arraylist 
{
	@Test
	public void arraylist()
	{
		ArrayList<Object>list = new ArrayList<Object>();
		list.add(20);
		list.add(50);
		list.add("Hi");
		list.add(20);
		list.add(null);
		list.add(null);
		list.add("hello");
		System.out.println(list);
		
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(50);
		list1.add(30);
		list1.add(60);
		list1.add(10);
		Collections.sort(list1);
		System.out.println(list1);
		
		for(Integer inte:list1)
		{
			System.out.println(inte);
		}
	}

}
