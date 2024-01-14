package Java_Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CountAndPrintVowelAndConsonentFromString 
{
	@Test
	public void test()
	{
		String s="manoj";
		int vowel=0;
		int consonent=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				vowel++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("Vowel Count is "+vowel);
		System.out.println("Consonent count is "+consonent);
	}
	
	
	
	@Test
	public void Tekion()
	{
		String s="This is Tekion India Pvt Ltd";
		String s1 = s.toLowerCase();
	    //String[] s2 = s1.split(" ");
		int vowel=0;
		int consonent=0;
        for(int i=0;i<s1.length();i++)
        {
        	char s2 = s1.charAt(i);
        	if(s2=='i'||s2=='e'||s2=='a'||s2=='o'||s2=='u')
        	{
        		vowel++;
        	}
        	else if (Character.isLetter(s2)) 
        	{
        		consonent++;
			}
        	
        }
        System.out.println("vowel " +vowel);
        System.out.println("consonent "+consonent);
	}

}
