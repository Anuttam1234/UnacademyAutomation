package unacademy.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/DataDrivenFeature/unacademySearch.feature",
				 glue = {"unacademy.step.definition.search"},
				 dryRun = false,
				 monochrome = true,
				 plugin= {"pretty",
					        "json:target/testreport/report.json",
					        "junit:target/testreport/report.xml"})

public class TestRunner {
	
}
