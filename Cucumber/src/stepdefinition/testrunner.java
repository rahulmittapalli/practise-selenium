package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
//@Cucumber.Options(
//	    format = {
//	        "pretty",
//	        "html:target/cucumber-html-report",
//	        "json-pretty:target/cucumber- report.json"
//	    },
//	    features="features/"
//	)
@CucumberOptions(monochrome=true,features="src/feature/",glue={"/src/StepDefinition"},format={"pretty","html:cucumber-html-report","json:cucumber-json-reports/cucumber.json"})
public class testrunner {
	
}
