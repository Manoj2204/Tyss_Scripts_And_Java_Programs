package Practice_Demo;

import java.util.Scanner;

import org.testng.annotations.Test;

public class test 
{
	@Test
	public void test1()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("My Name is : "+name);
	}

}
