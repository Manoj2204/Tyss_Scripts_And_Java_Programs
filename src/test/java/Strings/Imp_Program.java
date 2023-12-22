package Strings;

import org.testng.annotations.Test;

public class Imp_Program 
{
	@Test
	public void test()
	{
		String s="aabbabc";
		int count=1;
		for(int i =0;i<s.length()-1;i++)
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

		String s="I Love india";
		// ssyt evoL 0I
//      o/p ----- s syte voLI
	    String s1 = s.replaceAll(" ", "");   // Ilovetyss
	    int count=s1.length()-1;
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
	public void test3()
	{
		String s="Tekion234inter52view54";
		// o/p --- 54,52,234
		 String[] s1 = s.split("[A-Za-z]");
		 
		 for (int i = s1.length-1; i <=0; i++) {
			if (!s1[i].isEmpty()) {
				System.out.println(s1[i]+",");
		
			}
		}
		
		
		
	}
	@Test
	public void name() {
		String s="Tekion234int#$%^&*(er52view54";
		String s1 = "";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
				s1=s1+s.charAt(i);
			} else if(!s1.isEmpty()){
				res=","+s1+res;
				s1="";
			}
		}
		System.out.println(s1+res);
		
		
	}
}
