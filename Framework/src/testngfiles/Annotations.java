package testngfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
@BeforeMethod
public void Userid()
{
System.out.println("Before method");	
}
@AfterMethod
public void reportmethod() 
{
System.out.println("After method");	
}

@BeforeTest
public void  beforetest()
{
System.out.println("Before Test");
}
@AfterTest
public void aftertest()
{
System.out.println("AfterTest");	
}
@Test
public void  test1()
{
System.out.println("test1");
}
@Test
public void test2()
{
System.out.println("test2");	
}
}
