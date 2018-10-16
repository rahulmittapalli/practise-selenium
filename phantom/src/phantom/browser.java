package phantom;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
	
public class browser {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		File src=new File("/Users/rahulmittapalli/Downloads/phantomjs");
		System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		WebDriver driver=new PhantomJSDriver();
		driver.get("https://www.cricbuzz.com");
		System.out.println(driver.getTitle());
//		DesiredCapabilities caps = new DesiredCapabilities();
//	    ((DesiredCapabilities) caps).setJavascriptEnabled(true);
//	    ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
//	    ((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/Users/rahulmittapalli/Downloads/phantomjs");
//	    caps.setJavascriptEnabled(true);
//	    String [] phantomJsArgs = {"--web-security=no", "--ignore-ssl-errors=yes"};
//	    caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomJsArgs);
//	    WebDriver driver = new PhantomJSDriver(caps);
//	    driver.get("https://www.facebook.com/");
//	    System.out.println(driver.getTitle());
//	    driver.quit();
	}

}
