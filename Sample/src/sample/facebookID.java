package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class facebookID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("rahul_sachin67@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("naveenrahul");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"u_15_7\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
