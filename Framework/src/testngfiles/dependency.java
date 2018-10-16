package testngfiles;

import org.testng.annotations.Test;

public class dependency {
	
	@Test
	public void  vtest1()
	{
	System.out.println("test1");
	}
	@Test(dependsOnMethods=("vtest1"),alwaysRun=true)
	public void test2()
	{
	System.out.println("test2");	
	}
	@Test(enabled=true)
	public void  vtest2()
	{
	System.out.println("test1");
	}

}
