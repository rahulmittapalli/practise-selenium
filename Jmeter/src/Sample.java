import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Sample {

	@Test
	public void Testing()
	{
		WebDriver driver =new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}
