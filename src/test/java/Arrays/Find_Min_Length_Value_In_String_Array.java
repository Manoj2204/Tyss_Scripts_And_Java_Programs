package Arrays;

import org.testng.annotations.Test;

public class Find_Min_Length_Value_In_String_Array 
{
	@Test
	public void minLengt()
	{
		String []s= {"ab","abc","abcd","edcf","ef"};
		String minlength = s[0];
		for(int i=0;i<s.length;i++)
		{
			if(minlength.length()>s[i].length())
			{
				minlength=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(minlength.length()==s[i].length())
			{
				System.out.print(s[i]+" ");
			}
		}

	}
	

}
