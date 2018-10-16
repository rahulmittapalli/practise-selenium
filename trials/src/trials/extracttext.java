package trials;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import com.asprise.ocr.Ocr;


public class extracttext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Text in the URL
//		WebDriver driver = new SafariDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.mythoughts.co.in/2013/10/extract-and-verify-text-from-image.html");
//		String imageUrl = driver
//				.findElement(By.xpath("//*[@id='post-body-5614451749129773593']/div[1]/div[1]/div/a/img"))
//				.getAttribute("src");
//		URL url = new URL(imageUrl);
//		Ocr ocr = new Ocr(); // create a new OCR engine
//		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
//		String s = ocr.recognize(new URL[] { (url) }, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
//		System.out.println(s);
//		ocr.stopEngine();
//		driver.close();

		//Text in the local system
		 Ocr ocr = new Ocr(); // create a new OCR engine
		 ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
		
		 String s = ocr.recognize(new File[] { new
		 File("/Users/rahulmittapalli/Downloads/draw.jpeg")},	 
		 Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		 
		 System.out.println(s);
		 ocr.stopEngine();
		
		
		//ANother URL
		
//		WebDriver driver = new SafariDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.snaphost.com/captcha/");
//		String imageUrl = driver
//				.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[3]/div/p[7]/img[1]"))
//				.getAttribute("src");
//		URL url = new URL(imageUrl);
//		Ocr ocr = new Ocr(); // create a new OCR engine
//		ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
//		String s = ocr.recognize(new URL[] { (url) }, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
//		System.out.println("s value is "+s);
//		ocr.stopEngine();
//		driver.close();
		
	}

}
