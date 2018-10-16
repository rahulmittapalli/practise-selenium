package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class linkcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("https://www.ebay.in");
		WebElement footer =driver.findElement(By.id("glbfooter"));
		int count =footer.findElements(By.tagName("a")).size();	
		System.out.println(count);
		Thread.sleep(3000);
		WebElement column=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
		int count1=column.findElements(By.tagName("a")).size();
		System.out.println(count1);
		System.out.println(driver.getTitle());
		String beforeclicking;
		String Afterclicking;
		beforeclicking=driver.getTitle();
		for (int i=0;i<count1;i++)
		{
			System.out.println(column.findElements(By.tagName("a")).get(i).getText());
			if(column.findElements(By.tagName("a")).get(i).getText().contains("eBay Seller Protection"))
			{
				column.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
	System.out.println(driver.getTitle());
	Afterclicking=driver.getTitle();
	Thread.sleep(3000);
if(beforeclicking!=Afterclicking)
	System.out.println("PASS");
	driver.close();
	}	

}
