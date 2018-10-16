package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class firefoxgoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Helloworld");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
