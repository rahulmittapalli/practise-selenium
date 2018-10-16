package trials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class cricibuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new SafariDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17689/aus-vs-eng-2nd-test-the-ashes-2017-18");
		int count=driver.findElements(By.className("cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope")).size();
		System.out.println(count);
		int sum=0;
		int tablerow=driver.findElements(By.className("cb-col cb-col-100 cb-scrd-itms")).size();
		System.out.println(tablerow);
		WebElement table=driver.findElement(By.className("cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope"));	
		int count1=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<10;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();	
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		int count2=Integer.parseInt(value);
		sum=sum+count2;
		}
		String Extras=table.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[13]/div[1]/following-sibling::div")).getText();
		System.out.println(Extras);
		String Extras1=Extras.replaceAll("[^a-zA-Z0-9]", "");
		int extras=Integer.parseInt(Extras1);
		System.out.println(extras);
		String Total=table.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[1]/following-sibling::div")).getText();
		String total1=Total.replaceAll("[^a-zA-Z0-9]", "");
		int total=Integer.parseInt(total1);
		System.out.println(total1);
		int finalsum=sum+extras;
		System.out.println(finalsum);
		driver.close();
	}

}
