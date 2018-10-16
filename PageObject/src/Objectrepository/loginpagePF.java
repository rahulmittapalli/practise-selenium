package Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagePF {
	WebDriver driver;
	public loginpagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(id="login1")
	WebElement username;
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(name="proceed")
	WebElement submit;
	@FindBy(linkText="Home")
	WebElement home;
	
	public WebElement Emailid()
	{
		return username;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement submit()
	{
		return submit;
	}
	public WebElement home()
	{
		return home;
	}
}
