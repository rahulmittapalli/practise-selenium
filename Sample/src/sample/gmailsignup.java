package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class gmailsignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("firstName"));
		username.sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("malara1234.ara");
		Thread.sleep(2000);
		driver.findElement(By.name("Passwd")).sendKeys("M12345678$");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("M12345678$");
		Thread.sleep(2000);
		driver.findElement(By.className("WBCose")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("accountDetailsNext")).click();
		Thread.sleep(4000);
//		String s= driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]")).getText();
//		System.out.println(s);
//		Thread.sleep(2000);
//		String p=driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[2]/div[2]")).getText();
//		System.out.println(p);
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[1]/div[1]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//content[contains text(),'Albania ']")).click();
		Thread.sleep(2000);
		//highLightElement(driver,username);
		driver.close();

	}
	// Element highlighter code
//	public static void highLightElement(WebDriver driver, WebElement element)
//	{
//	JavascriptExecutor js=(JavascriptExecutor)driver; 
//	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
//	}

}
