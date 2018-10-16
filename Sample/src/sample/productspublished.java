package sample;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productspublished {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rahulmittapalli/Downloads/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://pim.dermalogica.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("gmail");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		Select s = new Select(driver.findElement(
				By.xpath("//*[@id=\"Products\"]/section/div/div/div/div[3]/div/div/div[2]/div/label/select")));
		s.selectByValue("20");
		Thread.sleep(3000);
		WebElement size = driver.findElement(By.name("Pagination"));
		int a = size.findElements(By.tagName("li")).size();
//		System.out.println(a);
		for (int j = 0; j < a - 1; j++) {
//			System.out.println(j + "\t" + a);
			WebElement table = driver.findElement(By.name("SimpleTable"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			for (int i = 1; i <= rows.size() - 2; i++) {
				List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
				if(column.get(5).getText().equals("published"))
				{
					System.out.println(column.get(1).getText());
				}
			}
			try {
				if (driver.findElement(By.cssSelector(".svg-inline--fa.fa-chevron-double-right.fa-w-12"))
						.isDisplayed()) {
					WebElement svgObj = driver
							.findElement(By.cssSelector(".svg-inline--fa.fa-chevron-double-right.fa-w-12"));
					Actions actionBuilder = new Actions(driver);
					actionBuilder.click(svgObj).build().perform();
				}
			} catch (Exception ex) {
				for (int i = 1; i <= rows.size() - 2; i++) {
					
					List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
					
					if(column.get(5).getText().equals("published"))
					{
						System.out.println(column.get(1).getText());
					}
				}
			}
			Thread.sleep(3000);
		}
		Thread.sleep(4000);
		driver.close();
	}

}
