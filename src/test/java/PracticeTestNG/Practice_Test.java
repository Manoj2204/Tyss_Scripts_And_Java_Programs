package PracticeTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.GenericUtils.BaseClass;
import com.crm.GenericUtils.BaseClass2;

public class Practice_Test extends BaseClass2
{
	
	@Test(groups = "regression")
	public void practice1()
	{
		System.out.println("practice1");
	}
	
	@Test(groups = {"regression","smoke"})
	public void practice2()
	{
		System.out.println("practice2");
	}

}
