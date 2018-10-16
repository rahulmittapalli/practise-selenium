package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepositories.HOmepage;
import objectRepositories.HOmepageLogin;

public class login {
	@Test(dataProvider="login1")

	public void loginapplication(String Username,String password,String text){
		WebDriver driver =new SafariDriver();
		driver.get("https://gmail.com:2096/");
		HOmepageLogin hp=new HOmepageLogin(driver);
		hp.emailid().sendKeys("Username");
		hp.password().sendKeys("password");
		System.out.println(text);
		hp.submit().click();
	}
	
	@DataProvider
	public Object[][] login1()
	{
		Object[ ][ ] newdata=new Object[1][2];
		newdata[0][0]="rahul.mittapalli@gmail.com";
		newdata[0][1]="Rahul123";
		newdata[0][2]="Restricted User";
		newdata[0][0]="rahul2.mittapalli@gmail.com";
		newdata[0][1]="Rahul1234";
		newdata[0][2]="Restricted Another User";
		
		return newdata;
	}
}
