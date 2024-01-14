package Java_Practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseSentenceExceptSpecialCharacter 
{
	@Test
	public void test()
	{
		String s="ab@x%4$m";
		String s1=s.replaceAll("[^a-zA-Z]", "");
		int count=s1.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z'|| s.charAt(i)>='a'&& s.charAt(i)<='z')
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

	


