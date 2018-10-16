package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffhomepage {
	WebDriver driver;
	public Rediffhomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		}
	By search=By.id("srchword");
	By submit=By.xpath("//*[@id=\"queryTop\"]/input");
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement button()
	{
		return driver.findElement(submit);
	}
}
