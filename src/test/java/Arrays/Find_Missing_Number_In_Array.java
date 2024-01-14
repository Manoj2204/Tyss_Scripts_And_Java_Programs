package Arrays;

import org.testng.annotations.Test;

public class Find_Missing_Number_In_Array 
{
	@Test
	public void missingNOBetween1To9() 
	{
		int[] a = { 1, 9, 6, 4 };
		for (int i = 1; i <=9; i++) 
		{
			int count = 0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[j] == i) 
				{
					count++;
					break;
				}
			}
			if (count == 0) 
			{
				System.out.println(i);
			}
		}
	}
}


