package JavaPracticePrograms;

import org.testng.annotations.Test;

public class ImpProgramPractice 
{
	@Test
	public void test()
	{
		String s="aabbabc";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.println(s.charAt(s.length()-1)+""+count);
	}
	
	
	
	@Test
	public void test2()
	{
		String s="aabbabc";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.println(s.charAt(s.length()-1)+""+count);
	}
	
	
	@Test
	public void test3()
	{
		String s="I Love Tyss";
		String s1 = s.replaceAll(" ", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length()-1;i++)
		{
			if (s.charAt(i)!=' ') 
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
	public void test4()
	{
		String s="I Love Tyss";
		String s1=s.replaceAll(" ", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length()-1;i++)
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
	public void test5()
	{
		String s="Tekion234inter52view54";
		String[] s1 = s.split("[A-Z a-z]");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
	
	
	@Test
	public void test6()
	{
		String s="Tekion234inter52view54";
		String[] s1 = s.split("[A-Z a-z]");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
}




