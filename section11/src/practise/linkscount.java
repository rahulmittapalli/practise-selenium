package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class linkscount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();
		driver.get("https://www.cricbuzz.com");
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println("total number of links" + count);
		WebElement page = driver.findElement(By.className("page"));
		int anothercount = page.findElements(By.tagName("a")).size();
		System.out.println("Another count is " + anothercount);
		driver.close();
	}

}
