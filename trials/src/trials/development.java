package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class development {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.get("http://139.59.3.114/#!/signup");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"signup\"]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys("hello@mobigesture.com");
	}

}
