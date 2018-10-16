package trials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class makecalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.get("http://www.tsrtconline.in/");
		driver.findElement(By.className("calOnward hasDatepicker")).click();
		//List dates=driver.findElement(By.className("data-handler"));
		int count =driver.findElements(By.className("ui-state-default")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
			if(text.equals("30"))
			{
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
	}

}
