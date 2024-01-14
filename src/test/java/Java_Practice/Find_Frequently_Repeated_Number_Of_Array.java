package Java_Practice;

import org.testng.annotations.Test;

public class Find_Frequently_Repeated_Number_Of_Array 
{
	@Test
	public void test()
	{
		int[]a= {55,48,11,55,45};
		int max=0;
		int num=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=max)
			{
				max=count;
				num=a[i];
			}
		}
		System.out.println(num+" Repeted "+max);
	}

}
