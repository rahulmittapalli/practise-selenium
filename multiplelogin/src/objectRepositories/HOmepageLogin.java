package objectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOmepageLogin {

	WebDriver driver;
	public HOmepageLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
//	By Username=By.xpath("//*[@id=\"user\"]");
//	By password=By.xpath("//*[@id=\"pass\"]");
//	By go=By.name("login");
	
	@FindBy(xpath="//*[@id=\"user\"]")
	WebElement username;
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	@FindBy(name="login")
	WebElement go;
	public WebElement emailid()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement submit()
	{
		return go;
	}	
}
