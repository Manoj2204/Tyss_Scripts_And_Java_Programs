package Java_Practice;

import org.testng.annotations.Test;

public class SwapTwoNumber 
{
	@Test
	public void Swap2NumberWithout3rdVraibale()
	{
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void Swap2Numberusing3rdvariable()
	{
		int a=10;
		int b=20;
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
	}

}
