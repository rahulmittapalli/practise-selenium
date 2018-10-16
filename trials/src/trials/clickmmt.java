package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickmmt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.gecko.driver", "/Users/rahulmittapalli/Documents/workspace123/trials/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"ui-id-34\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
