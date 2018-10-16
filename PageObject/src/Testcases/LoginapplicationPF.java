package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import Objectrepository.Pagefactorylogin;
import Objectrepository.loginpagePF;

public class LoginapplicationPF {
	@Test
	public void login() throws InterruptedException
	{
	WebDriver driver=new SafariDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	loginpagePF rd=new loginpagePF(driver);
	rd.Emailid().sendKeys("hello");
	rd.Password().sendKeys("12345678");
	//rd.submit().click();
	rd.home().click();
	Pagefactorylogin rh=new Pagefactorylogin(driver);
	Thread.sleep(3000);
	rh.search().sendKeys("helloworld");
	rh.button().click();
	driver.close();
}
}
