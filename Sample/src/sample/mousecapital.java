package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class mousecapital {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new SafariDriver();
		driver.get("https://www.amazon.in");
		WebElement move=driver.findElement(By.id("nav-link-yourAccount"));
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().sendKeys("HELLO").doubleClick().build().perform();
		Thread.sleep(3000);
		a.moveToElement(move).build().perform();
	}

}
