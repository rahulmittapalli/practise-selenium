package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class skutil {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("gmail");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("password")).sendKeys("naveenrahul");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(15000);
		Screen s =new Screen();
		Pattern image =new Pattern("/Users/rahulmittapalli/Downloads/naveen.jpg");
		s.click(image);
		Thread.sleep(3000);
		driver.close();
	}

}
