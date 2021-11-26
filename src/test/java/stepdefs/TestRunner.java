package stepdefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		plugin = { "json:target/cucumber.json", "pretty", "html:target/cucumber-reports"},
		//tags= {"@LoginFeature"},
		tags= {"@ProductSelection"},
		
		glue= {"stepdefs"})

public class TestRunner {
}