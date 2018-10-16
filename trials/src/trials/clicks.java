package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class clicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
//		WebDriver driver =new ChromeDriver();
		WebDriver driver=new SafariDriver();
		driver.get("https://paytm.com");
		Actions a =new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[1]/div"));
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/input"))).click().sendKeys(Keys.SHIFT,"hello").build().perform();
		a.moveToElement(move).contextClick().build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
