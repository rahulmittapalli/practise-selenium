	package Objectrepository;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Pagefactorylogin {
		WebDriver driver;
		public Pagefactorylogin(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
		@FindBy(id="srchword")
		WebElement search;
		@FindBy(xpath="//*[@id=\\\"queryTop\\\"]/input")
		WebElement submit;
		
		public WebElement search()
		{
			return search;
		}
		public WebElement button()
		{
			return submit;
		}
	}
	
