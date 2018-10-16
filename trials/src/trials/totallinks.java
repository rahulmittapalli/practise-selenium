package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class totallinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new SafariDriver();
		driver.get("https://www.gmail.com");
		String URL=driver.getCurrentUrl();
		int size=driver.findElements(By.tagName("a")).size();
		System.out.println("URL is "+URL);
		System.out.println("Size is "+size);
		System.out.println(driver.getPageSource().getBytes());
		String title=driver.getTitle();
		System.out.println("Title is "+title);
	}

}
