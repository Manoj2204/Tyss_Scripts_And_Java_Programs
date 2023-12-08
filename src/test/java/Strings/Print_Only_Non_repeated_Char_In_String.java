package Strings;

import org.testng.annotations.Test;

public class Print_Only_Non_repeated_Char_In_String 
{
	@Test
	public void test()
	{
		String s1="Tester";
		String s = s1.toLowerCase();
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
			if(count==1)
			{
				System.out.println(ch[i]+ " = "+count);
			}
		}
	}
	
}
