package Arrays;

import org.testng.annotations.Test;

public class Print_Only_EvenNumber_From_Array 
{
	@Test
	public void evenNumberFromArray()
	{
		int []a= {2,8,3,7,1,11};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{	
				System.out.println(a[i]);
			}
		}
	}
}
