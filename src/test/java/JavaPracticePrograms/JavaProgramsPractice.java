package JavaPracticePrograms;

public class JavaProgramsPractice 
{
	public static void main(String[]args)
	{
		String s= "Manoj";
		rev(s,s.length()-1);
	}
	public static void rev(String s,int length)
	{
		if(length>=0)
		{
			System.out.print(s.charAt(length--));
			rev(s,length);
		}
	}

}
