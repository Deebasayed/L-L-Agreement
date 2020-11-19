package Agreement;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
	features = "src/test/java/Features/Login.feature",
			//features = "src/test/java/Features/Contact_US.feature",

	
	glue = "StepDefinations",
plugin= {"html:target/cucumber-html-report"}

	)
public class TestRunner {
	
	
	
	

}
