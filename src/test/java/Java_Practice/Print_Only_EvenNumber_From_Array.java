package Java_Practice;

import org.testng.annotations.Test;

public class Print_Only_EvenNumber_From_Array 
{
	@Test
	public void test()
	{
		int []a= {2,5,6,7,8,6};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
