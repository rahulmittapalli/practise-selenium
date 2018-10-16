package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class cal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = new SafariDriver();
		System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Documents/workspace123/trials/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http://192.168.1.78:8080");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("test@mobigesture.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul[3]/li/a")).click();
		Thread.sleep(3000);
		int i;
		for(i=0;i<40;i++)
		{
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div/div/table/tbody/tr[1]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		System.out.println(i);
		
		}
	}

}
