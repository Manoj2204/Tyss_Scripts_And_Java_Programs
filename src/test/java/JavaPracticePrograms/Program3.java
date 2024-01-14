package JavaPracticePrograms;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class Program3 
{
	@Test
	public void test()
	{
		LinkedHashMap<String, String>map=new LinkedHashMap<String,String>();
		map.put("Apple", "Available");
		System.out.println(map);
	
	}
}
