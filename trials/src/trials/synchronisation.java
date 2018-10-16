package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronisation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("helloworld");
		WebDriverWait wd= new WebDriverWait(driver,5);
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sbse2\"]/div[2]/b[2]")));
		driver.findElement(By.xpath("//*[@id=\"sbse2\"]/div[2]/b[2]")).click();
		Thread.sleep(3000);
		driver.close();
	
	}

}
