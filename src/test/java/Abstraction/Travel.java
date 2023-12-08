package Abstraction;

public class Travel 
{
	public static void main(String[] args) 
	{
		Visa v = new Visa();
		v.bhutan();
		v.nepal();
		v.uk();
		System.out.println("------------");
		
		Visa2 v2= new Visa2();
		v2.Canada();
		v2.India();
		v2.switzerland();
		
		
	}

}
