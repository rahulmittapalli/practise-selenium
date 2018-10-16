package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.get("http://www.facebook.com");
//		driver.findElement(By.id("email")).sendKeys("rahul_sachn67@yahoo.com");
//		driver.findElement(By.id("pass")).sendKeys("naveenrahul");
//		driver.findElement(By.id("loginbutton")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rahul_sachin67@yahoo.com");
//		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("naveenrahul");
//		driver.findElement(By.id("loginbutton")).click();
//		driver.findElement(By.id("userNavigationLabel")).click();
//		driver.close();	
		driver.findElement(By.cssSelector("*[id='email']")).sendKeys("123@gmail.com");
	}

}
