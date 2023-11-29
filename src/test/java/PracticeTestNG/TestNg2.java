package PracticeTestNG;

import org.testng.annotations.Test;

public class TestNg2 
{
	@Test
	public void modifytest() 
	{
		System.out.println("modify test");
	}
	
	@Test
	public void updatetest()
	{
		System.out.println("Update test");
	}

	@Test
	public void edittest() 
	
	{
		System.out.println("edit test");
	}

	@Test(dependsOnMethods ="edittest")
	public void deletetest() 
	{
		System.out.println("delete test");
	}
	
	@Test
	public void createtest() 
	{
		System.out.println("Create test");
	}

}
