package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class forgotpasssword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Documents/workspace123/trials/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://dev-pim.dermalogica.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/p/a")).click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/form/div[2]/p/a")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
