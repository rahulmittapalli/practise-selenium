package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class yahoomail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("https://twitter.com/login?lang=en");
		System.out.println(driver.findElement(By.name("remember_me")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.name("remember_me")).click();
		System.out.println(driver.findElement(By.name("remember_me")).isSelected());
		
	}

}
