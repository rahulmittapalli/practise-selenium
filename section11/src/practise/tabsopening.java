package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class tabsopening {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver =new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/");
		int count=driver.findElements(By.tagName("a")).size();
		System.out.println("total number of links are" +count);
//		WebElement page=driver.findElement(By.id("prefooter"));
//		int anothercount=page.findElements(By.tagName("a")).size();
//		System.out.println(anothercount);
//		WebElement links=page.findElement(By.id("links"));
//		int linkcount=links.findElements(By.tagName("a")).size();
//		System.out.println(linkcount);

		for(int i=0;i<10;i++)
		{
			WebElement page=driver.findElement(By.id("prefooter"));
			WebElement links=page.findElement(By.id("links"));
			String click=Keys.chord(Keys.COMMAND,Keys.ENTER);
			links.findElements(By.tagName("a")).get(i).sendKeys(click);
			System.out.println(links.findElements(By.tagName("a")).get(i).getText());
			Thread.sleep(5000);
		}	
		Thread.sleep(5000);
		driver.close();
	}

}
