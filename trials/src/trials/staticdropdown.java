package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Documents/workspace123/trials/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Select s=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		s.selectByValue("DEL");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
//		driver.findElement(By.xpath("//*[@value=''HYD]")).click();
	}

}
