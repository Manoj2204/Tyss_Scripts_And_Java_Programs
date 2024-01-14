package Java_Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CountVowelAndConsonent 
{
    @Test
    public void test()
    {
        String s = "manoj";
        int vowelCount = 0;
        int consonentCount = 0;
        String vowel="";
        String consonent="";
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        	{
        		vowelCount++;
        		vowel=vowel+s.charAt(i);
        	}
        	else
        	{
        		consonentCount++;
        		consonent=consonent+s.charAt(i);
        	}
        }
        System.out.println(vowel+" "+vowelCount);
        System.out.println(consonent+" "+consonentCount);
        
        
    }
}
