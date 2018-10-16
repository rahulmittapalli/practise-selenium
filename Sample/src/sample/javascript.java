package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
//		driver.get("http://www.tsrtconline.in/oprs-web/");
//		driver.findElement(By.id("fromPlaceName")).sendKeys("HYD");
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
//		Thread.sleep(3000);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("mob");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
//		String s=driver.findElement(By.id("lst-ib")).getText();
//		System.out.println(s);
		//Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String d="return document.getElementById(\"lst-ib\").value";
		String text=(String) js.executeScript(d);
		int i=0;
		while(!text.equalsIgnoreCase("mobile tracker"))
		{
			i++;
			driver.findElement(By.id("lst-ib")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(d);
			System.out.println(text);
		}
//		if(!text.equals("mobile"))
//		{
//		System.out.println(text);
//		}
		driver.close();	
	}

}
