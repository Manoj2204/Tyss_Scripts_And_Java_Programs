package Java_Practice;

import org.testng.annotations.Test;

public class RemoveNumberFromString 
{
	@Test
	public void test()
	{
		String s="Tekion123";
		String[] s1 = s.split("[0-9]");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}
}
