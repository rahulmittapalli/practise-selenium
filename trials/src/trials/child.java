package trials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class child {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","/Users/rahulmittapalli/Documents/workspace123/trials/geckodriver");
		//WebDriver driver =new FirefoxDriver();
		WebDriver driver =new SafariDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/p/a")).click();
		Set <String> ids=driver.getWindowHandles();
		Iterator <String>it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().window(parentid);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.close();
	}

}
