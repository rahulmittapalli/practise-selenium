package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.safari.SafariDriver;

public class kill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
				driver.get("https://www.google.com");
				
				WindowsUtils.killByName("");
				
	}

}
