package Java_Practice;

import org.testng.annotations.Test;

public class Imp1 
{
	@Test
	public void test()
	{
		String s="I love India";
		String s1 = s.replace(" ", "");
		int count = s1.length()-1;
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
	
	@Test
	public void test2()
	{
		String s="aabb142dc56az@!44";
		String []s1=s.split("[^0-9]");
		System.out.print(s1[s1.length-1]);
		for(int i=s1.length-2;i>0;i--)
		{
			if(s1[i].equals(""))
			{
				
			}
			else
			{
				System.out.print(","+s1[i]);
			}
		}
	}
	
	@Test
	public void test3()
	{
		String s="I am from Bangalore";
		String[] str = s.split(" ");
		
		for (int i=0; i<str.length; i++)
		{
			String temp = str[0];
			
			for(int j=1; j<str.length; j++)
			{
				str[j-1]=str[j];
				System.out.print(str[j]+" ");
			}
			
			str[str.length-1]=temp;
			System.out.println(temp);
		}
	}
	
	@Test
	public void test4()
	{
		String s="Ab@x%4$m";
		String s1=s.replaceAll("[^a-z A-Z 0-9]", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z'|| s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='0' && s.charAt(i)<='9' )
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
