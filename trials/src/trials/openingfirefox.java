package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class openingfirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.firefox.driver", "/Users/rahulmittapalli/Documents/workspace123/INtroduction/geckodriver");
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver =new SafariDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"_eEe\"]/a[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("lst-ib")).sendKeys("helloworld");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a")).click();
		if(driver.getTitle().equals("\"Hello, World!\" program - Wikipedia"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
	}

}
