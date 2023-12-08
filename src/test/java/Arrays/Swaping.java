package Arrays;

import org.testng.annotations.Test;

public class Swaping 
{
	@Test
	public void swap2Number()
	{
		int a=20;
		int b=30;
		int c=a;
		
		System.out.println("Before Swaping: "+ "a"+" "+a+"  "+"b"+" "+b);
		a=b;
		b=c;
	
		System.out.println("After Swaping: "+ "a"+" "+a+"  "+"b"+" "+b);
		
	}
	
	@Test
	public void swap2NumberWithoutusing3RdVariable()
	{
		int a=20;
		int b=30;
		System.out.println("Before Swapping :"+"a :"+ a+"   " +"b :"+ b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping :"+"a :"+ a+"   " +"b :"+ b);
	}

}
