package trials;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class saucelabs {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities().firefox();
		dc.setCapability("version","45");
		dc.setCapability("platform","windows");
		WebDriver driver = new RemoteWebDriver(new URL("http://mrahul489:b5ba4f9c-1989-4dcb-9462-9c985bfbbbee@ondemand.saucelabs.com:80/wd/hub"), dc);
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
