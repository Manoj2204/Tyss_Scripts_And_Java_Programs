package JavaPracticePrograms;

import org.testng.annotations.Test;

public class FindMissingNumberInArray 
{
	@Test
	public void test()
	{
		int []a= {1,4,6,9};
		for(int i=2;i<=9;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if (a[j]==i) 
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}

}
