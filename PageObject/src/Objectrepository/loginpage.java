package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	WebDriver driver;
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By username=By.id("login1");
	By password=By.name("passwd");
	By go=By.name("proceed");
	By home=By.linkText("Home");
	
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement submit()
	{
		return driver.findElement(go);
	}
	public WebElement home()
	{
		return driver.findElement(home);
	}
}
