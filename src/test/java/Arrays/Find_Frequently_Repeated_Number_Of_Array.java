package Arrays;

import org.testng.annotations.Test;

public class Find_Frequently_Repeated_Number_Of_Array 
{
	@Test
	public void repeatedNumber()
	{
		int a[]= {1,28,28,1,28};
		int max=0;
		int val=0;
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
			if(count>max)
			{
				max=count;
				val=a[i];
			}
			System.out.print(val+" "+"Repeating is"+" "+max+" "+"times");
		}
		//System.out.print(val+" "+"Repeating is"+" "+max+" "+"times");
	}
		


		
		
	}


