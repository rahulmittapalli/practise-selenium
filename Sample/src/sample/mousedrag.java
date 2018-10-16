package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class mousedrag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector(".label_text.flight-trip-type")).isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"js-switch__option\"]/div[2]/label")).click();
		driver.findElement(By.id("hp-widget__depart")).click();
		while (driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e")).isEnabled()) {
			WebElement month = driver.findElement(By.className("ui-datepicker-title"));
			System.out.println(month.getText());
			if (month.getText().equals("November 2018")) {
				WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));
				List<WebElement> date = table.findElements(By.tagName("td"));
				int count = date.size();
				for (int i = 0; i < count; i++) {
					String s = date.get(i).getText();
					System.out.println(s);
					if (s.equals("12")) {
						date.get(i).click();
						Thread.sleep(1000);
					}
					if(s.equals("22"))
					{
						Actions a =new Actions(driver);
						a.moveToElement(table);
						a.doubleClick();
						System.out.println("Inside");
//						date.get(i).click();
//						Thread.sleep(1000);

					}
				}
			}
			driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e")).click();
		}
		
		
	}

}
