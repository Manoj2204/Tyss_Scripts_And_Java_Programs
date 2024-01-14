package Java_Practice;

import org.testng.annotations.Test;

public class MockProgram5 
{
	@Test
	public void test()
	{
		String s="I Am Not String";
		String s1 = s.replace(" ", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(count--));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
