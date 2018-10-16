package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import homepage.homepage;

public class loginpage {

@Test
public void login() throws InterruptedException
{
	WebDriver driver=new SafariDriver();
	driver.manage().window().maximize();
	driver.get("https://mobigesture.com:2096/");
	homepage hp=new homepage(driver);
	hp.Emailid().sendKeys("rahul.mittapalli@Mobigesture.com");
	hp.pass().sendKeys("Rahul123");
	hp.submit1().click();
	Thread.sleep(5000);
	driver.close();
}
}
