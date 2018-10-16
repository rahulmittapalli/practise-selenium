package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javaalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath("//*[@id=\"bookingflightTab\"]/div[2]/div[1]/ul[1]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"globalModal\"]/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.quit();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		String s=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		WebDriverWait d= new WebDriverWait(driver,5);
		d.until(	ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("/html/body/button"))));
;		driver.findElement(By.id("hello")).sendKeys(Keys.TAB);
		System.out.println(s);
		driver.switchTo().defaultContent();
		int count=driver.findElements(By.tagName("button")).size();
		System.out.println(count);
		//String s=driver.switchTo().alert().getText();
		driver.close();
	}

}
