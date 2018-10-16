package objectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HOmepage {

	WebDriver driver;
	public HOmepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By Username=By.xpath("//*[@id=\"user\"]");
	By password=By.xpath("//*[@id=\"pass\"]");
	By go=By.name("login");

	public WebElement emailid()
	{
		return driver.findElement(Username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement submit()
	{
		return driver.findElement(go);
	}
}
