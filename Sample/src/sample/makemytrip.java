package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector(".label_text.flight-trip-type")).isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.id("hp-widget__depart")).click();
		while (driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e")).isEnabled()) {
			WebElement month = driver.findElement(By.className("ui-datepicker-title"));
			System.out.println(month.getText());
			if (month.getText().equals("November 2018")) {
				WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement> date = table.findElements(By.tagName("td"));
				int count = date.size();
				System.out.println(count);
				for (int i = 0; i < count; i++) {
					String s = date.get(i).getText();
					System.out.println(s);
					if (s.equals("12")) {
						System.out.println("s value is "+s);
						date.get(i).click();
					}
				}
				break;
			}
			System.out.println(driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e")).isDisplayed());
			driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"js-switch__option\"]/div[2]/label")).click();
		Thread.sleep(3000);
		
		//return date
		
		driver.findElement(By.id("hp-widget__return")).click();
		Thread.sleep(3000);
			WebElement month1 = driver.findElement(By.className("ui-datepicker-title"));
			System.out.println(month1.getText());
			if (month1.getText().equals("November 2018")) {
				System.out.println(driver.findElement(By.className("ui-datepicker-calendar")).isEnabled());
				WebElement table1 = driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement> date1 = table1.findElements(By.tagName("td"));
				int count1 = date1.size();
				System.out.println(count1);
				for (int j =0 ; j < count1; j++) {
					String s1 = date1.get(j).getText();
					System.out.println(s1);
					if (s1.equals("22")) {
						System.out.println("s value is "+s1);
						date1.get(j).click();
						date1.get(j).click();
					}
				}
			}
			Thread.sleep(10000);
		driver.close();

	}
}
