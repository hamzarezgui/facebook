package Cumcuber.MonGherkinTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", 
				"html:target/cucumber"}, 
				tags="@SmokeTest",
				glue="stepDefinition",
				features = "src/test/java/Facebook")

public class RunCucumberTest {
}