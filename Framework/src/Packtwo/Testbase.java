package Packtwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testbase {
	public WebDriver driver=null;

@BeforeSuite

public void suite() throws IOException
{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("/Users/rahulmittapalli/Documents/workspace123/Framework/src/Packtwo/datadriven.properties");
	System.out.println("Suite");
	prop.load(fis);
	System.out.println(prop.getProperty("username"));
	if(prop.getProperty("browser").equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "/Users/rahulmittapalli/Documents/workspace123/Framework/geckodriver");
	driver=new FirefoxDriver();
	}
	else if(prop.getProperty("browser").equals("chrome"))
	{
		driver=new ChromeDriver();	
	}
	else
	{
		driver=new SafariDriver();	
	}
	driver.get(prop.getProperty("url"));
}	
@Test
public void test()
{
	System.out.println("Test");
}
@AfterSuite
public void suite2()
{
System.out.println("Aftertest");

}
}
