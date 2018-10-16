package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	WebDriver driver;
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	By username=By.id("user");
//	By password=By.name("pass");
//	By submit=By.id("login_submit");
	
//	public WebElement Emailid()
//	{
//		return driver.findElement(username);
//	}
//	public WebElement pass()
//	{
//		return driver.findElement(password);
//	}
//	public WebElement submit1()
//	{
//		return driver.findElement(submit);
//	}
	@FindBy(id="user")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(id="login_submit")
	WebElement submit;
	
	public WebElement Emailid()
	{
		return username;
	}
	public WebElement pass()
	{
		return password;
	}public WebElement submit1()
	{
		return submit;
	}	
}
