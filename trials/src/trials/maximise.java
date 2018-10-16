package trials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class maximise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/Users/rahulmittapalli/Documents/workspace123/trials/geckodriver");
		WebDriver driver =new FirefoxDriver();
		//WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");	
		driver.manage().deleteAllCookies();
	}

}
