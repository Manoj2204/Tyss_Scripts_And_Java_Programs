package Java_Practice;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class OccurenceOfEachCharacter 
{
	@Test
	public void test()
	{
		String s="helloworld";
	    for(int i=0;i<s.length();i++)
	    {
	    	int count=0;
	    	for(int j=0;j<s.length();j++)
	    	{
	    		if(s.charAt(i)==s.charAt(j))
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
	    	if(count>=1)
	    	{
	    		System.out.println(s.charAt(i)+" "+count);
	    	}
	    }
	}

}
