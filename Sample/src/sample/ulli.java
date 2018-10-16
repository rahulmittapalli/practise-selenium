package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ulli {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-pim.dermalogica.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("mittapalli.rahul@gmail.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("sidebar")).isDisplayed());
		WebElement a = driver.findElement(By.id("sidebar"));
		List<WebElement> parent = a.findElements(By.tagName("li"));
		//List<WebElement> child = a.findElements(By.tagName("li>a"));
		System.out.println(parent.size());
		for (int i = 1; i < parent.size(); i++) {
			System.out.println(i);
			parent.get(i).click();
			Thread.sleep(2000);
			System.out.println(parent.get(i).getText());
		}
		driver.close();
	}

}
