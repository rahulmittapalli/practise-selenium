package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//*[@value='Milk']")).click();
		int size=driver.findElements(By.name("group1")).size();
		for(int i=0;i<size;i++)
		{
			String s=driver.findElements(By.name("group1")).get(i).getAttribute("value");
			if(s.equals("Cheese"))
			{
				driver.findElements(By.name("group1")).get(i).click();
				System.out.println(s);
			}
			
		}
		driver.close();
	}

}
