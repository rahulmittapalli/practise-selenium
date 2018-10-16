package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("https://dev-pim.dermalogica.com");
		Thread.sleep(3000);
		String s="Invalid user/password";
		driver.findElement(By.xpath("//*[@id=\"Loginscss\"]/div[1]/form/div[1]/input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Loginscss\"]/div[1]/form/div[2]/input")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"Loginscss\"]/div[1]/form/div[3]/button")).click();
		Thread.sleep(8000);
		String sas =driver.findElement(By.xpath("//*[@id=\"Loginscss\"]/div[1]/p")).getText();
		int d=driver.findElements(By.tagName("iframe")).size();
		System.out.println(d);
		System.out.println(sas);
		if(s.equals(sas))
		System.out.println("Error message is displayed");
		driver.close();
	}

}
