package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.headphonezone.in/collections/in-ear-earphones?wf=mm&sort=price-ascending");
		Thread.sleep(2000);
		Actions a =new Actions(driver);
		int count=driver.findElements(By.xpath("//*[contains(text(),'Brands')]")).size();
		System.out.println(count);
		//a.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Brands ')]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/div[1]/ul/li[1]/a"))).build().perform();
		Thread.sleep(3000);
		driver.close();

	}

}
