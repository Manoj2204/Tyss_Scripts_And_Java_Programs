package Arrays;

import org.testng.annotations.Test;

public class First_Min_And_Second_MinAnd_First_Max_And_Second_Max 
{
	@Test
	public void test()
	{
		int a[]= {4,5,6,2,3,98,95};
		int firstMax=a[0];
		int secondMax=a[0];
		int firstMin=a[0];
		int secondMin=a[0];
		for (int i = 0; i < a.length; i++)
        {
            if (firstMax < a[i])
            {
                secondMax = firstMax;
                firstMax = a[i];
            }
            else if (secondMax < a[i] && firstMax > a[i])
            {
                secondMax = a[i];
            }

            if (a[i] < firstMin)
            {
                secondMin = firstMin;
                firstMin = a[i];
            }
            else if (a[i]<secondMin && a[i]>firstMin)
            {
                secondMin = a[i];
            }
        }

        System.out.println("First Maximum: " + firstMax);
        System.out.println("Second Maximum: " + secondMax);
        System.out.println("First Minimum: " + firstMin);
        System.out.println("Second Minimum: " + secondMin);
	}
	

}
