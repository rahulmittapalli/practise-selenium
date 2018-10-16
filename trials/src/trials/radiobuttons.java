package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/rahulmittapalli/Documents/workspace123/trials/chromedriver");
		WebDriver driver =new SafariDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int count =driver.findElements(By.name("group1")).size();
		System.out.println(count);
		for (int i=0;i<count;i++)
		{
			String text=driver.findElements(By.xpath("//*[@name='group1']")).get(i).getAttribute("value");
			System.out.println(text);
			if (text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//*[@name='group1']")).get(i).click();
			}
		}
		Thread.sleep(4000);
		driver.close();

	}

}
