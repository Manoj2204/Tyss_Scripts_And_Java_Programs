package PracticeTestNG;

import org.testng.annotations.Test;

import com.crm.GenericUtils.BaseClass;
import com.crm.GenericUtils.BaseClass2;

public class Demo_Test extends BaseClass2
{
	@Test(groups = "smoke")
	public void Demo1()
	{
		System.out.println("Demo1");
	}
	
	@Test(groups = "regression")
	public void Demo2()
	{
		System.out.println("Demo2");
	}


}
