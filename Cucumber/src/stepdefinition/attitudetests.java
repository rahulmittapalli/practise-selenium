package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class attitudetests {
	@Given ("^I work in ([^\"]*)$")
	public void ln(String str)
	{
		if(str.equals("latenight"))
		{
			System.out.println("Latenight automation");
		}
		if(str.equals("morning"))
		{
			System.out.println("morning automation");
		}
	}
	@When ("^I met ([^\"]*)$")
	
	public void person(String str)
	{
		if(str.equals("nightwatchmen"))
		{
			System.out.println("Good noght");
		}
		if(str.equals("watchmen"))
		{
			System.out.println("Good morning");
		}
	}
	@Given ("^ we work in \"([^\"]*)\"$")
	public void we_work_in(String str) throws Throwable
	{
		System.out.println("Helloworld");
	}
	@When ("^ we meet \"([^\"]*)\"$")
	public void we_meet(String str) throws Throwable
	{
		System.out.println("Heloworld1");
	}
	@Then ("^I ([^\"]*) him wishes$")
	public void wishes(String str)
	{
		if(str.equals("greet"))
		{
			System.out.println("Wished him");
		}
		if(str.equals("greet not"))
		{
			System.out.println("Didn'tt Wish him");
		}
	}

}
