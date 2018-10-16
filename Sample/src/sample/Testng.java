package sample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {

	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
	}
	@Test
	public void display2()
	{
		System.out.println("Testing 2");
	}
	@Test
	public void display1()
	{
		System.out.println("Testing1");
	}
}
