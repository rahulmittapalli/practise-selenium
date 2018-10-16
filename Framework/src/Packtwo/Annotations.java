package Packtwo;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations extends Testbase{
	
@BeforeMethod
public void Userid() throws IOException
{
	suite();
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
@Test(dataProvider="getdata")
public void  test1(String Username,String Password,String id)
{
	System.out.println("THis will pint");
	System.out.println(Username);
	System.out.println(Password);
	System.out.println(id);
}
@Test
public void test2()
{
System.out.println("test2");	
}
@DataProvider
public Object[][] getdata()
{
Object[][] data=new Object[4][3];
data[0][0]="1abcd";
data[0][1]="1def";
data[0][2]="1ghi";
data[1][0]="2abcd";
data[1][1]="2def";
data[1][2]="2ghi";
data[2][0]="3abcd";
data[2][1]="3def";
data[2][2]="3ghi";
return data;


}
}
