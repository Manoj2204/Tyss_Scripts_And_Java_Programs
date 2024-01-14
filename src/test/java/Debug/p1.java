package Debug;

public class p1
{

public static void  main(String[]args)
{
String []s= {"856","235","1","111111","98","111111"};
String Maxlen = s[0];
for(int i=0;i<s.length;i++)
{
     if(Maxlen.length()< s[i].length())
     {
	Maxlen=s[i];
     }
}
for(int i=0;i<s.length;i++)
{
	if(Maxlen.length()==s[i].length())
	{
		System.out.println(s[i]);
	}
}
    }
}