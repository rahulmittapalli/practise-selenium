package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bnb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new SafariDriver();
		//System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		//System.setProperty("webdriver.chrome.driver","/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.ddicloudqb.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hemakumar");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("OHm9ymQG");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(10000);
		//WebElement el;
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("borderLayout_eGridPanel")));
		//System.out.println(driver.findElement(By.id("borderLayout_eGridPanel")).isDisplayed());
		//Thread.sleep(5000);
		//WebElement element = driver.findElement(By.id("ag-body-container"));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("scroll(0, 250);");
		//jse.executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(5000); 

		//System.out.println(driver.findElement(By.className("ag-body-container")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath("//*[@comp-id='312']")).isDisplayed());
		//WebElement e=driver.findElement(By.xpath("//div[contains(@class,'ag-body-container') and contains(@role,'row')]"));
		//System.out.println(e.isDisplayed());
		//driver.findElement(By.className("ag-body-container")).findElement(By.xpath("//*[@index='0']")).click();
		driver.findElement(By.xpath("//*[@id=\"borderLayout_eGridPanel\"]/div[1]/div/div[4]/div[3]/div/div/div[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"borderLayout_eGridPanel\"]/div[1]/div/div[4]/div[3]/div/div/div[1]")).click();
		//WebDriverWait wait1 = new WebDriverWait(driver, 15);
		Thread.sleep(10000);
		//wait1.until(ExpectedConditions.elementToBeClickable(By.id("root")));
		//System.out.println(driver.findElement(By.id("root")).isDisplayed());
		//System.out.println(driver.findElement(By.xpath("/	a[@contains(text(),'Configuration')]")).isDisplayed());
		//driver.findElement(By.xpath("//a[@contains text(),'Configuration']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'ADD')]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//driver.switchTo().activeElement();
		//System.out.println(driver.findElement(By.className("panel bnb_panel")).isDisplayed());
		//driver.findElement(By.className("panel bnb_panel")).click();
		//System.out.println(driver.findElement(By.className("tab-content tab-content-default")).isDisplayed());
		//driver.findElement(By.tagName("form"));
		//System.out.println(driver.findElement(By.id("ZNWKK_section_name")).isDisplayed());
		//Thread.sleep(2000);
		//System.out.println(driver.findElement(By.id("ZNWKK_section_name")).isDisplayed());
		//WebElement element=driver.findElement(By.xpath("//a[contains text(),'General Settings']"));
		//Thread.sleep(2000);
		WebElement element=driver.findElement(By.tagName("form"));

		//System.out.println(element.isDisplayed());
		element.sendKeys(Keys.TAB);
		element.sendKeys(Keys.TAB);
		element.sendKeys("HELLO1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='button' and contains(text(),'Submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		//driver.findElement(By.xpath("//button[@type='button' and contains(text(),'ADD')]")).click();
		//WebElement element1=driver.findElement(By.tagName("form"));
//		System.out.println(element1.isDisplayed());
//		element1.sendKeys(Keys.TAB);
//		element1.sendKeys(Keys.TAB);
//		element1.sendKeys("HELLO123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@type='button' and contains(text(),'Submit')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div[2]/div[1]/section/div/div[1]/a/button")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//button[contains class='downarrowicon']")).isDisplayed());
//		driver.findElement(By.xpath ("//button[class='btn btn-sm bnb_downarrowicon']")).click();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div[2]/div[1]/section/div/div[1]/a/button")).isDisplayed());
		System.out.println((driver.findElements(By.tagName("i")).size()));
		//System.out.println(driver.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).isDisplayed());
		driver.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).click();
//		WebElement e= driver.findElement(By.tagName("i"));
//		int count =driver.findElements(By.tagName("i")).size();
//		for(int i=0;i<count;i++)
//		{
//			e=driver.findElement(By.tagName("i"));
//			//System.out.println(e.getTagName());
//			//System.out.println(e);
//			e.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).click();
//			System.out.println(e.getText());
//			//System.out.println(e.getClass());
//			//System.out.println(e.getAttribute());
//			if(e.equals("glyphicon glyphicon-menu-down animateArrow"))
//				e.click();
//		}
		Thread.sleep(2000);
		driver.findElement(By.className("glyphicon glyphicon-menu-down animateArrow")).click();
		int d=driver.findElements(By.className("glyphicon glyphicon-trash")).size();
		System.out.println(d);
		if(d!=0)
		{
			System.out.println("Entering");
			driver.findElement(By.className("glyphicon glyphicon-trash")).click();
		}
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//button[@class='button-l btn btn-primary' and contains (text(),'Yes')]")).isDisplayed());
		driver.findElement(By.xpath("//button[@class='button-l btn btn-primary' and contains (text(),'Yes')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary' and contains (text(),'OK')]")).click();
		driver.close();
	}

}
