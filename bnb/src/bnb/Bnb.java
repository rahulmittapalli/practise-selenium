package bnb;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Bnb {

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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'ADD')]")).click();
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.tagName("form"));
		element.sendKeys(Keys.TAB);
		element.sendKeys(Keys.TAB);
		element.sendKeys("HELLO1AB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='button' and contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		Thread.sleep(2000);
//		System.out.println((driver.findElements(By.tagName("i")).size()));
//		driver.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).click();
//		int d=driver.findElements(By.className("glyphicon glyphicon-trash")).size();
//		System.out.println(d);
//		if(d!=0)
//		{
//			System.out.println("Entering");
//			driver.findElement(By.className("glyphicon glyphicon-trash")).click();
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='button-l btn btn-primary' and contains (text(),'Yes')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
//		Thread.sleep(2000);
		//Another data adding
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'ADD')]")).click();
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.tagName("form"));
		element1.sendKeys(Keys.TAB);
		element1.sendKeys(Keys.TAB);
		element1.sendKeys("HELLO123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='button' and contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		Thread.sleep(2000);
		System.out.println((driver.findElements(By.tagName("i")).size()));
		driver.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).click();
		int d1=driver.findElements(By.className("glyphicon glyphicon-trash")).size();
		System.out.println(d1);
		if(d1!=0)
		{
			System.out.println("Entering");
			driver.findElement(By.className("glyphicon glyphicon-trash")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button-l btn btn-primary' and contains (text(),'Yes')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
