package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class emailtabledata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/gmail/Documents/Chetan/Automation_Softwares/chromedriver");
		//WebDriver obj=new ChromeDriver();
		WebDriver obj=new SafariDriver();
		obj.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		obj.findElement(By.name("identifier")).sendKeys("rahulmittapalli89");
		obj.findElement(By.id("identifierNext")).click();
		Thread.sleep(10000);
		obj.findElement(By.name("password")).sendKeys("sumanthrahul");
		obj.findElement(By.id("passwordNext")).click();
		Thread.sleep(15000);
		WebElement table = obj.findElement(By.id(":34"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		//Integer noofrows= rows.size();
		String email = "Freelancer.com";
		//obj.findElement(By.id(":ha")).click();
		System.out.println("Hello");

		for (WebElement rowelement:rows)
		{
			List<WebElement> colums= rowelement.findElements(By.tagName("td"));
			/*for(WebElement columnelement:colums)
			{
				System.out.println(columnelement.getText());
			}*/
			//Thread.sleep(2000);
			System.out.println("Hello1");
			System.out.println(colums.get(4).getText());
			if (colums.get(4).getText().contains(email))
			{
				System.out.println("Clicking "+email+"....");
				colums.get(4).click();
				break;
			}
			/*else if (obj.findElement(By.id(":ha")).isEnabled())
			{
				obj.findElement(By.id(":ha")).click();
				Thread.sleep(5000);
			}

			else
				System.out.println("Requested Mail Not found");
*/
			}

		//obj.close();
	}

}
