package Apartmentstep;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
	//features = "src/test/java/Features/Login.feature",
			features = "src/test/java/Features/Apartment.feature",

	
	glue = "Apartment",

plugin= {"html:target/cucumber-html-report"}
			)
public class Apartmentstepde {

}
