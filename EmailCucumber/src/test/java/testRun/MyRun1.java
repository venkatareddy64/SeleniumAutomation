package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/sign.feature",
		glue="stepDefinitins",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)

public class MyRun1 {

}
