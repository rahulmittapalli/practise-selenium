package trials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.safari.SafariDriver;

public class killprocess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("http://www.google.com");
		System.out.println("NO command to kill MAC process");
		driver.close();
	}

}
