package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class isdisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"js-switch__option\"]/div[2]/label")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());
		driver.close();
	}

}
