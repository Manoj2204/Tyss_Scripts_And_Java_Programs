package PracticeTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {
	@Test()
	public void modifytest() 
	{
		System.out.println("modify test");
	}

	@Test()
	public void edittest() 
	{
		System.out.println("edit test");
	}

	@Test(priority = 0)
	public void deletetest() 
	{
		System.out.println("delete test");
	}
	
	@Test(dependsOnMethods = "deletetest")
	public void createtest() 
	{
		System.out.println("Create test");
	}
	
	

}
