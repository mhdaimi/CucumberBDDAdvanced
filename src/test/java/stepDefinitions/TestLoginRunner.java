package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src\\test\\resources\\features\\",
		glue = "stepDefinitions",
		//plugin = { "pretty", "html:target/cucumber-reports" }
		//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
//		tags = {"@Sanity,@Login"} //Logical OR for tags
		tags = {} //Logical AND for tags\\
		)
public class TestLoginRunner {

}
