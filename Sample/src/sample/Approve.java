package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approve {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://dev-pim.dermalogica.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("gmail@gmail.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("gmail");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		WebElement sidebar = driver.findElement(By.xpath("//nav[@id='sidebar']"));
		List<WebElement> elems = sidebar.findElements(By.tagName("li"));
		for (int i = 0; i < elems.size(); i++) {
			System.out.println(elems.get(i).getText());
			if (elems.get(i).getText().equals("Review")) {
				System.out.println(i);
				elems.get(i).click();
				Thread.sleep(2000);
				System.out.println(sidebar.findElement(By.xpath("//*[contains (text(),'Products')]")).isDisplayed());
				sidebar.findElement(By.xpath("/html/body/div/nav/ul/li[3]/ul/li[1]/a")).click();
				break;
			}
		}
		Thread.sleep(3000);
		List<WebElement> table = driver.findElements(By.tagName("th"));
		for (int i = 0; i < table.size(); i++) {
			Thread.sleep(2000);
			String name = table.get(i).getText();
			System.out.println(name);
			if (table.get(i).findElement(By.tagName("a")) != null) {
				System.out.println(i);
				if (name.equals("Modified On")) {
					table.get(i).findElement(By.tagName("a")).click();
				}
				// System.out.println(driver.findElement(By.xpath("(//a[@name='HeadSort'])[2]")).isDisplayed());
				// System.out.println("HElloWOrld");
				// Thread.sleep(2000);
				// driver.findElement(By.xpath("(//a[@name='HeadSort'])[2]")).click();
				Thread.sleep(5000);
			}
			System.out.println("number is "+i);	
		}
		driver.close();
	}

}
