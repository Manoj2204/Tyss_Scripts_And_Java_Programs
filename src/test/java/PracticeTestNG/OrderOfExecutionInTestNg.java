package PracticeTestNG;

/*import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;*/
import org.testng.annotations.*;

public class OrderOfExecutionInTestNg 
{
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Bs");
	}
	@BeforeClass
	public void Beforeclass1()
	{
		System.out.println("BC1");
	}
	@BeforeClass
	public void Beforeclass2()
	{
		System.out.println("BC2");
	}
	@Test
	public void test1()
	{
		System.out.println("t1");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BM");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("AM");	
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("AC");
	}
	@Test
	public void test2()
	{
		System.out.println("t2");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod2()
	{
		System.out.println("BM2");
	}
	@AfterClass
	public void AfterClass2()
	{
		System.out.println("AC2");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod3()
	{
		System.out.println("BM3");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod2()
	{
		System.out.println("AM");
	}
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("AS");
	}
	

}
