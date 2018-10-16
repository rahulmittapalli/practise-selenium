package Packtwo;

import java.io.IOException;

import org.testng.annotations.Test;

public class dependency extends Testbase {
	
	@Test
	public void  vtest1() throws IOException
	{
		suite();
	System.out.println("test1");
	}
	@Test(dependsOnMethods=("vtest1"),alwaysRun=true)
	public void test2() throws IOException
	{
		suite();
	System.out.println("test2");	
	}
	@Test(enabled=true)
	public void  vtest2()
	{
	System.out.println("test1");
	}

}
