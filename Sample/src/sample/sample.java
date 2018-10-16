package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.out.println("HEllo world");
	WebDriver driver =new SafariDriver();	
	driver.get("http://www.google.com");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	driver.navigate().to("https://www.gmail.com");
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.close();
	}

}
