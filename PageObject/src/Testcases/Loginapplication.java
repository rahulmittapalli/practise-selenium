package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import Objectrepository.Rediffhomepage;
import Objectrepository.loginpage;

public class Loginapplication {
	@Test
	public void login() throws InterruptedException
	{
	WebDriver driver=new SafariDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	loginpage rd=new loginpage(driver);
	rd.Emailid().sendKeys("hello");
	rd.Password().sendKeys("12345678");
	//rd.submit().click();
	rd.home().click();
	Rediffhomepage rh=new Rediffhomepage(driver);
	Thread.sleep(3000);
	rh.search().sendKeys("helloworld");
	rh.button().click();
	driver.close();
}
}
