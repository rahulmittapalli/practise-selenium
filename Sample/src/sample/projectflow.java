package sample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class projectflow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		int count = 0;
		driver.get("https://trade-dev.facemapping.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("gmail@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("gmail");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		// System.out.println(driver.findElement(By.xpath("//*[@placeholder='Select or
		// Search client']")).isDisplayed());
		// WebElement client = driver.findElement(By.xpath("//*[@placeholder='Select or
		// Search client']"));
		// client.click();
		// WebElement dropdown = driver.findElement(By.className("dropdown-menu"));
		// List<WebElement> clients = dropdown.findElements(By.tagName("li"));
		// System.out.println("size is " + clients.size());
		// for (int i = 0; i < clients.size(); i++) {
		// WebElement dropdown1 = driver.findElement(By.className("dropdown-menu"));
		// List<WebElement> clients1 = dropdown1.findElements(By.tagName("li"));
		// System.out.println(i);
		// Thread.sleep(1000);
		// if (clients1.get(i).getText().contains("uday")) {
		// clients1.get(i).click();
		// }
		// Thread.sleep(2000);
		// }
		// driver.findElement(By.xpath("//button[@type='button']")).click();
		// Thread.sleep(3000);
		// System.out
		// .println(driver.findElement(By.xpath("//*[@placeholder='Select or Search
		// therapist']")).isDisplayed());
		// driver.findElement(By.xpath("//*[@placeholder='Select or Search
		// therapist']")).click();
		// WebElement dropdown2 = driver.findElement(By.className("dropdown-menu"));
		// List<WebElement> therapist = dropdown2.findElements(By.tagName("li"));
		// for (int j = 0; j < therapist.size(); j++) {
		// System.out.println(j);
		// Thread.sleep(1000);
		// if (therapist.get(j).getText().contains("Rahul")) {
		// therapist.get(j).click();
		// }
		// Thread.sleep(2000);
		//
		// }
		// List<WebElement> label = driver.findElements(By.tagName("label"));
		// for (int k = 0; k < label.size(); k++) {
		// System.out.println(label.get(k).getText());
		// if (label.get(k).getText().equals("Hydrated Skin")) {
		// label.get(k).click();
		// }
		// }
		//
		// System.out.println(driver.findElement(By.className("vue-slider")).isDisplayed());
		// WebElement slider = driver.findElement(By.className("vue-slider"));
		// List<WebElement> slidercount = slider.findElements(By.tagName("li"));
		// for (int l = 0; l < slidercount.size(); l++) {
		// count++;
		// System.out.println("count is " + count);
		// if (count == 3) {
		// slider.click();
		// break;
		// }
		// }
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// WebElement Element = driver.findElement(
		// By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/form/fieldset/div[2]/div[2]/div[2]/input"));
		// System.out.println(Element.isDisplayed());
		// Element.click();
		// Thread.sleep(5000);
		// driver.findElement(
		// By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/form/fieldset/div[2]/div[2]/div[2]/input")).click();

		driver.get("https://trade-dev.facemapping.com/skintype");
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/form/fieldset/div[2]/div[2]/div[2]/input"))
				.click();
		System.out.println(driver.findElement(By.xpath("//label[@for='conform2']")).isDisplayed());
		driver.findElement(By.xpath("//label[@for='conform2']")).click();
		driver.findElement(By.xpath("//label[@for='consent']")).click();
		driver.findElement(By.xpath("//*[@placeholder='client initials']")).sendKeys("AA");
		System.out.println(driver.findElement(By.xpath("//*[@type='submit']")).isDisplayed());
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/form/fieldset/div[2]/div[2]/div[2]/input"))
		.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/form/fieldset/div[2]/div[2]/div[2]/input"))
		.click();
		WebElement From=driver.findElement(By.xpath("//img[@id='4']"));
		WebElement To=driver.findElement(By.xpath("//*[id='facemapContainer']"));
		Actions a =new Actions(driver);
		a.dragAndDrop(From, To).build().perform();
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/form/fieldset/div[2]/div[2]/div[2]/input"))
		.click();

	}
}
