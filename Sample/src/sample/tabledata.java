package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class tabledata {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new SafariDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("rahulmittapalli89");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("password")).sendKeys("sumanthrahul");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(15000);
		WebElement table = driver.findElement(By.id(":34"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		//int i=0;
//		String email = "Freelancer.com";
//		System.out.println("Hello");
//		String t=driver.findElement(By.xpath("//*[@id=\":xv\"]/span/span[2]")).getText();
//		String r=driver.findElement(By.xpath("//*[@id=\":xv\"]/span/span[1]/span[2]")).getText();
//		String[] o=t.split(t);
//		Integer initial =Integer.parseInt(r);
//		Integer total=Integer.parseInt(t);
//		System.out.println(total);
//		System.out.println(initial);
////		int click=total/initial;
//		//System.out.println(click);
//		int i=0;
//		for (WebElement rowelement:rows)
//		{
//			
//		if(driver.findElement(By.id(":xy")).isDisplayed())
//		{
//			Thread.sleep(2000);
//
//			driver.findElement(By.id(":xy")).click();	
//			++i;
//			System.out.println(i);
//		}
//		if(driver.findElement(By.id(":xy")).getAttribute("aria-disabled")==null)
//		{
//			Thread.sleep(2000);
//			driver.findElement(By.id(":xy")).click();
//			++i;
//			System.out.println(i);
//			//System.out.println("ENough");
//		}
//
//		}
		//Get Title of the mail
		int i=0;
		for (WebElement rowelement:rows)
		{
			List<WebElement> colums= rowelement.findElements(By.tagName("td"));
			 String q=colums.get(4).getText();
			 System.out.println(q);
			 String[]p=colums.get(4).getText().split(",");
			if(p[0].equals("unread"))
			{
				System.out.println(p[1]);
			}
			else
			{
				System.out.println(p[0]);
			}
	//		For clicking the > button till it is disabled
			if(driver.findElement(By.xpath("//img[@class='amJ T-I-J3']")).isEnabled())
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//img[@class='amJ T-I-J3']")).click();
				++i;
				System.out.println(i);
			}
			}

	}

	}
