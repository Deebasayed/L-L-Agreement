package Rental;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
	features = "src/test/java/Features/Rental.feature",
			//features = "src/test/java/Features/Contact_US.feature",

	
	glue = "Rental_Agreement",

plugin= {"html:target/cucumber-html-report"}
	)
public class Rental_Agreement {

}
