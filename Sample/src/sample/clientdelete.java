package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class clientdelete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://trade-dev.facemapping.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("mittapalli.rahul@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@placeholder='Select or Search client']")).isDisplayed());
		WebElement client = driver.findElement(By.xpath("//*[@placeholder='Select or Search client']"));
		client.click();
		WebElement dropdown = driver.findElement(By.className("dropdown-menu"));
		List<WebElement> clients = dropdown.findElements(By.tagName("li"));
		System.out.println("size is " + clients.size());
		for (int i = 0; i < clients.size(); i++) {
			WebElement dropdown1 = driver.findElement(By.className("dropdown-menu"));
			List<WebElement> clients1 = dropdown1.findElements(By.tagName("li"));

			System.out.println(i);
			Thread.sleep(1000);
			clients1.get(0).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/aside/div/div[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"vue-zydialog-default\"]/div[2]/div[2]/input[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.tagName("i")).click();
			Thread.sleep(1000);
			WebElement client1 = driver.findElement(By.xpath("//*[@placeholder='Select or Search client']"));
			Thread.sleep(2000);
			client1.click();
		}
		driver.close();
	}

}
