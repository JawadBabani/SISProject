package sis.project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "@target/failed.txt",
		
		glue = "sis.project.steps"
		
)

public class FailedRunner {

}
