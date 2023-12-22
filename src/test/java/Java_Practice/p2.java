package Java_Practice;

import org.testng.annotations.Test;

public class p2 
{
	@Test
	public void test()
	{
		String s="my name is manoj";
		String[] word = s.split(" ");
		String revreseword="";
		for(String w:word )
		{
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			revreseword= revreseword+sb.toString()+" ";
			
		}
		System.out.println(revreseword);
	}

}
