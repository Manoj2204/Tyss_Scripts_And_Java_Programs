package Java_Practice;

import org.testng.annotations.Test;

public class Find_Maximum_Length_Value_In_String_Array 
{
	@Test
	public void test()
	{
		String s[]= {"Hello","HelloWorld","bye"};
		String MaxLength=s[0];
		for(int i=0;i<s.length;i++)
		{
			if (MaxLength.length() < s[i].length()) 
			{
				MaxLength=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if (MaxLength.length() == s[i].length()) 
			{
				System.out.println(s[i]);
			}
		}
	}

}
