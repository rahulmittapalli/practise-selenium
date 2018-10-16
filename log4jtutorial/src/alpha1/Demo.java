package alpha1;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo {
	
private static Logger log=	LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		log.debug("I am debugger");
		log.error("I am error");
		log.info("I am info");
		log.fatal("I am fatal");
		
	}

}
