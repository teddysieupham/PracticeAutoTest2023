package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Feature", glue = { "src/main/stepDefinition" },
		format = {"json:target/cucumber.json"},plugin = {
		"html:target/cucumber-reports/TestRunnerHomePage.html",
		"json:target/cucumber-reports/TestRunnerHomePage.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"pretty"
})
public class TestRunnerHomePage {

}
