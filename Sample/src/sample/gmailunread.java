package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class gmailunread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("rahulmittapalli89");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("password")).sendKeys("sumanthrahul");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(15000);
		// driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[6]/div/a")).click();
		// driver.findElement(By.xpath("//imag[class='amJ T-I-J3']")).click();
		for (int i = 0; i < 50; i++) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=':2r']")).click();
			Thread.sleep(4000);
			driver.findElement(By.id(":2u")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=':139']/div")).click();
			Thread.sleep(4000);
			System.out.println(driver.findElement(By.id(":10n")).isDisplayed());
			driver.findElement(By.id(":10n")).click();
			System.out.println(i);
		}
	}

}
