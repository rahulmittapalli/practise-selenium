package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.get("http://www.spicejet.com");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
//		driver.findElement(By.xpath("//*[@value='GOI']")).click();
//		driver.findElement(By.xpath("(//*[@value='HYD'])[2]")).click();	
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		Select o =new Select (driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		List<WebElement> values=o.getOptions();
		for(int i=0;i<values.size();i++)
		System.out.println(values.get(i).getText());
		o.selectByVisibleText("Goa (GOI)");
		o.selectByVisibleText("(Rajahmundry (RJA))[2]");
		
	}

}
