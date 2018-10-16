package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","/Users/rahulmittapalli/Documents/workspace123/trials/geckodriver");
		//WebDriver driver =new FirefoxDriver();
		WebDriver driver=new SafariDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='txtJourneyDate']")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		Thread.sleep(6000);
		driver.close();
	}

}

