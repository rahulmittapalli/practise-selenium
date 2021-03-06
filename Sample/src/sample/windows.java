package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten account?")).click();
		System.out.println(driver.getCurrentUrl());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it =ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);	
		driver.switchTo().window(parentid);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
