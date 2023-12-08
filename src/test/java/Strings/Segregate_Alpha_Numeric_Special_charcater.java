package Strings;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Segregate_Alpha_Numeric_Special_charcater 
{
	@Test
	public void test()
	{
		//String s="a1C$d3R%^";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		String alphabates="  ";
		String num="  ";
		String special="  ";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alphabates=alphabates+s.charAt(i);
				
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				num=num+s.charAt(i);
			}
			else 
			{
				special=special+s.charAt(i);
			}
		}
		System.out.println(alphabates+num+special);
	}

}
