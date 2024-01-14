package Debug;

public class ReverseStringWithoutUsingLoop 
{
	public static void main(String[] args) 
	{
		String s="india";
		rev(s,s.length()-1);
		
	}
	public static void rev(String s,int length)
	{
		if(length>=0)
		{
			System.out.print(s.charAt(length--));
			//length--;
			rev(s,length);
		}
	}

}
