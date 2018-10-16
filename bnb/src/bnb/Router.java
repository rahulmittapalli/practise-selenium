package bnb;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Router {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new SafariDriver();
		//System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.ddicloudqb.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hemakumar");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("OHm9ymQG");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"borderLayout_eGridPanel\"]/div[1]/div/div[4]/div[3]/div/div/div[2]")).click();
		Thread.sleep(10000);
//		System.out.println(driver.findElements(By.tagName("a")).size());
//		System.out.println(driver.findElement(By.className("menu")).isDisplayed());
		driver.findElement(By.linkText("CloudQbAgent")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Configuration")).click();
		Thread.sleep(3000);
//		System.out.println(driver.findElements(By.className("bnb_section")).size());
//		System.out.println(driver.findElements(By.className("bnb_section_table")).size());
		int count=driver.findElements(By.className("row no-margin-hr bnb_sec_title")).size();
		System.out.println(count);
		WebElement heading=driver.findElement(By.className("tab-content tab-content-default"));
		List<WebElement> value=heading.findElements(By.className("heading_title col-sm-8"));
		//System.out.println(value);
		//WebElement button =driver.findElement(By.className("col-sm-4 text-right no-padding-hr"));
		//List <WebElement> Add=button.findElements(By.xpath("//button[@type='button' and contains(text(),'ADD')]"));
		for(int i=0;i<count;i++) 
		{
		System.out.println("ENtering");
		//System.out.println(value);
		System.out.println(value.get(i).getText());
//		System.out.println(count);
		if(value.get(i).getText().equals("Modules"))
		{
		System.out.println("If loop....");
		System.out.println(driver.findElement(By.xpath("//button[@type='button' and contains(text(),'ADD')]")).isDisplayed());
		driver.findElement(By.xpath("//button[@type='button']/div[2]/button")).click();
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("/Users/rahulmittapalli/Desktop/screenshot123.png"));
		//driver.findElement(By.xpath("//*[@type='button' contains text(),'ADD']")).click();
		break;
		}
		}
		//System.out.println(i);
		Thread.sleep(4000);
		driver.close();
	}

}
