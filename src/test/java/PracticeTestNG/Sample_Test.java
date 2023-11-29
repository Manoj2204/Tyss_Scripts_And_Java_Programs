package PracticeTestNG;

import org.testng.annotations.Test;

import com.crm.GenericUtils.BaseClass;
import com.crm.GenericUtils.BaseClass2;

public class Sample_Test extends BaseClass2
{
	
	@Test(groups = "regression")
	public void Sample1()
	{
		System.out.println("Sample1");
	}
	
	@Test(groups = "regression")
	public void Sample2()
	{
		System.out.println("Sample2");
	}


}
