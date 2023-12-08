package Arrays;

import org.testng.annotations.Test;

public class Assign_Occurence_Of_Each_Characters_In_Array 
{
	@Test
	public void test()
	{
		int []a= {5,4,4,2,5,4,2,1,3};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
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
				System.out.println(a[i]+" "+count);
			}
		}
	}

}
