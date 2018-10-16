package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class ticket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_display_checkbox_text");
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("myCheck")).click();
		System.out.println(driver.findElement(By.id("myCheck")).isSelected());
		Thread.sleep(3000);
		driver.close();
	}

}
