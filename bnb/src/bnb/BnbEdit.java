package bnb;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class BnbEdit {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//*[@id=\"borderLayout_eGridPanel\"]/div[1]/div/div[4]/div[3]/div/div/div[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Configuration")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'ADD')]")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.name("addSectionFormcloudqbadmin"));
		element.sendKeys(Keys.TAB);
		element.sendKeys(Keys.TAB);
		element.sendKeys("HELLOERROR");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/section/div/div/form/div[2]/button")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'ADD')]")).click();
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.name("addSectionFormcloudqbadmin"));
		element1.sendKeys(Keys.TAB);
		element1.sendKeys(Keys.TAB);
		element1.sendKeys("HELLOERROR123");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/section/div/div/form/div[2]/button")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		Thread.sleep(3000);
		//For finding how many sections
		
		int count =driver.findElements(By.tagName("section")).size();
		System.out.println(count);
		while(count>0)
		{
		System.out.println(driver.findElement(By.tagName("section")).isDisplayed());	
			System.out.println("Entering");
			System.out.println("Value of count is "+count);
			driver.findElement(By.className("glyphicon glyphicon-trash")).click();
		count--;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-l btn btn-primary' and contains (text(),'Yes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		Thread.sleep(2000);
		}
		driver.close();
	}

}
