package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.id("txtJourneyDate")).click();
		Thread.sleep(3000);
		WebElement journeydate=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>day=journeydate.findElements(By.tagName("td"));
		int count=day.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=day.get(i).getText();
			System.out.println(text);
			if(text.equals("18"))
			{
				day.get(i).click();
				Thread.sleep(4000);
				break;
			}
		}
		driver.findElement(By.id("txtReturnJourneyDate")).click();
		WebElement returndate=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>days=returndate.findElements(By.tagName("td"));
		int counts=days.size();
		System.out.println(counts);
		for(int i=0;i<counts;i++)
		{
			String text=days.get(i).getText();
			System.out.println(text);
			if(text.equals("25"))
			{
				days.get(i).click();
				Thread.sleep(4000);
				break;
			}
		}
		driver.close();
		
	}

}
