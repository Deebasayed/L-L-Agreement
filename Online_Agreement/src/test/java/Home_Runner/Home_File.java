package Home_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
	features = "src/test/java/Features/Home.feature",
			//features = "src/test/java/Features/Contact_US.feature",

	
	glue = "Home_Page",
			plugin= {"html:target/cucumber-html-report"}

	)

public class Home_File {

}
