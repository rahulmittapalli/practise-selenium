package sample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class therapistdelete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://trade-dev.facemapping.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("gmail@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("gmail");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		List<WebElement>anchors=driver.findElements(By.tagName("a"));
		Iterator<WebElement>i=anchors.iterator();
		while(i.hasNext())
		{
			WebElement anchor =i.next();
			System.out.println(anchor.getText());
			if(anchor.getText().equals("inactivate therapist")) {
				anchor.click();
			}
		}
		Thread.sleep(3000);
		int size=driver.findElements(By.cssSelector(".glyphicon.glyphicon-remove.remove-icon")).size();
		System.out.println("total therapists are :"+size);
		System.out.println(driver.findElement(By.cssSelector(".container.mar-bott")).isDisplayed());
		WebElement therapists=driver.findElement(By.cssSelector(".container.mar-bott"));
		List<WebElement> delete=therapists.findElements(By.className("tname"));
		for(int j=0;j<delete.size();j++)
		{
			System.out.println(j);
			System.out.println(delete.get(j).getText());
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.cssSelector(".glyphicon.glyphicon-remove.remove-icon")).isDisplayed());
			driver.findElement(By.cssSelector(".glyphicon.glyphicon-remove.remove-icon")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
			Thread.sleep(1000);
		}
		driver.close();
	}

}
