package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownfb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Select s=new Select(driver.findElement(By.id("day")));
		s.selectByValue("2");
		Thread.sleep(3000);
//		s.selectByVisibleText("22");
//		Thread.sleep(3000);
//		Select m=new Select(driver.findElement(By.id("month")));
//		m.selectByVisibleText("Apr");
//		Thread.sleep(3000);
//		m.selectByValue("5");
//		Thread.sleep(3000);
//		Select y=new Select(driver.findElement(By.id("year")));
//		y.selectByValue("2002");
//		Thread.sleep(3000);
//		y.selectByVisibleText("2004");
//		Thread.sleep(3000);	
		boolean bool=s.isMultiple();
		System.out.println(bool);
		List<WebElement> drop=s.getOptions();
		int isize=drop.size();
		for (int i=0;i<isize;i++)
		{
			String Sample=drop.get(i).getText();
			System.out.println(Sample);}
		driver.close();
		
	}

}
