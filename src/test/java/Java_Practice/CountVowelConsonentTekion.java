package Java_Practice;

import org.testng.annotations.Test;

public class CountVowelConsonentTekion 
{
	@Test
	public void test()
	{
		String s="This is Tekion India Pvt Ltd";
		String s1 = s.toLowerCase();
		int vowel=0;
		int consonent=0;
		String s2=s1.replace(" ", "");
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='a'||s2.charAt(i)=='e'|| s2.charAt(i)=='i'|| s2.charAt(i)=='o'|| s2.charAt(i)=='u')
			{
				vowel++;
			}
			else
			{
				consonent++;
			}
		}
		System.out.println("vowel count is : "+vowel);
		System.out.println("consonent count is : "+consonent);
	}
}
