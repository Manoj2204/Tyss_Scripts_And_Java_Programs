package Strings;

import org.testng.annotations.Test;

public class ReverseString 
{
	@Test
	public void reverse_1() throws Throwable
	{
		String s= "Manoj";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			s2=s.charAt(i)+s2;
		}
		System.out.println(s2);
	}
	
	
	@Test
	public void reverse_2()
	{
		String s= "Manoj";
		char[] ch = s.toCharArray();
		String s2="";
		for(int i=0;i<ch.length;i++)
		{
			s2=s.charAt(i)+s2;
		}
		System.out.println(s2);
		
	}
	
	@Test
	public void revese_3()
	{
		String s="Software";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	@Test
	public void reverse_4()
	{
		String s= "Manoj";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}
	
	public void reverse_5()
	{
		String s= "Software";
		String s2="";
		//for(int i=0)
	}
	
	@Test
	public void reverse_6()
	{
		String s= "Software";
		char[] ch = s.toCharArray();
		int count = 0;
		for(char c: ch)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}
	@Test
	public void reverseString_WithoutUsingForloop_7()
	{
		String s="manoj";
		String s1="";
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		s1=sb.toString();
		System.out.println(s1);
	}
	
	@Test
	public void ReverseString_WithoutUsingForLoop_8()
	{
		String s="manoj";
		StringBuffer sb= new StringBuffer(s);
		sb.reverse();
		System.out.println(sb.toString());
	}

}
