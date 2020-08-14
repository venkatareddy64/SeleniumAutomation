package utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/search.feature",
		glue="stepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)

public class MyRun1 {

}
