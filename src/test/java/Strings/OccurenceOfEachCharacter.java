package Strings;

import org.testng.annotations.Test;

public class OccurenceOfEachCharacter 
{
	@Test
	public void test() throws InterruptedException
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
			Thread.sleep(4000);
			if(count>=1)
			{
				System.out.println(ch[i]+" = "+count);
				
			}
		}
	}

}
