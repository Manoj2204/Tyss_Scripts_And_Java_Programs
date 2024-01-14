package Java_Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class printVowelandConsonent 
{
	@Test
	public void test()
	{
		String s="This is Tekion India Pvt Ltd";
		String s2 = s.toLowerCase();
		String s1 = s2.replace(" ", "");
		int vowel=0;
		int consonent=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				vowel++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println(vowel+" "+consonent);
	}

}
