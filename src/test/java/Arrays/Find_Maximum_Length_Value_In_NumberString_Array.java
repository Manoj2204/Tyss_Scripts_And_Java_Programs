package Arrays;

import org.testng.annotations.Test;

public class Find_Maximum_Length_Value_In_NumberString_Array 
{
	@Test
	public void MaxNumberValue()
	{
		String []s= {"12","235","8569","32655","98"};
		String Maxlength = s[0];
		for(int i=0;i<s.length;i++)
		{
			if(Maxlength.length()< s[i].length())
			{
				Maxlength=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(Maxlength.length()==s[i].length())
			{
				System.out.print(s[i]+" ");
			}
		}

	}

}
