package trials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class paytm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.get("https://paytm.com/bus-tickets");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@role='presentation']")).click();
		List<WebElement> dates=driver.findElements(By.className("react-datepicker__day"));
		int datecount=driver.findElements(By.className("react-datepicker__day")).size();
		System.out.println(datecount);
		List<WebElement> month=driver.findElements(By.className("react-datepicker__current-month"));
		int count=driver.findElements(By.className("react-datepicker__current-month")).size();
		System.out.println(count);
		System.out.println(driver.findElement(By.className("react-datepicker__current-month")).getText());
		driver.findElement(By.className("react-datepicker__day"));
		Thread.sleep(3000);
		for(int i=0;i<datecount;i++)
		{
			System.out.println(driver.findElements(By.className("react-datepicker__day")).get(i).getText());
			if(driver.findElement(By.className("react-datepicker__day")).getText().contains("20"))
			{
				driver.findElements(By.className("react-datepicker__day")).get(i).click();
			}
		}
//			for(int i=0;i<count;i++)
//		{
//			System.out.println(driver.findElements(By.className("react-datepicker__navigation react-datepicker__navigation--next")).get(i).getText());
//		}
//		while(!driver.findElement(By.className("react-datepicker__current-month")).getText().contains("February 2018"))
//		{
//		System.out.println("hello");
//		for(int i=0;i<datecount;i++)
//		{
//			String text=driver.findElements(By.className("react-datepicker__day")).get(i).getText();
//			if(text.equals("4"))
//				{
//				System.out.println("hello");
//				driver.findElements(By.className("react-datepicker__day")).get(i).click();
//				break;
//				}					
//			}
//		}
		Thread.sleep(3000);
		driver.close();
	}

}
