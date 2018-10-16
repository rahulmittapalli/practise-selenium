package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		Dimension dimension = new Dimension(1920, 1024);
		driver.manage().window().setSize(dimension);
		driver.findElement(By.name("option1")).click();
		Thread.sleep(4000);
		System.out.println((driver.findElement(By.name("option1")).isSelected()));
		driver.close();
	}

}
