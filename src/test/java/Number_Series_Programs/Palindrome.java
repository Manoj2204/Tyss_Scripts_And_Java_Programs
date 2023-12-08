package Number_Series_Programs;

import org.testng.annotations.Test;

public class Palindrome 
{
	@Test
	public void test()
	{
		int num=121;
		int rev=0;
		int originNumber=num;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==originNumber)
		{
			System.out.println("Palindrome Number..");
		}
		else
		{
			System.out.println("Not Palindrome Number..");
		}
	}

}
