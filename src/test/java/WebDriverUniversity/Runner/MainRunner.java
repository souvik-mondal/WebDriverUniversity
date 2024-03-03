package WebDriverUniversity.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/WebDriverUniversity/featureFiles"},
		glue={"WebDriverUniversity.StepFiles"},
		monochrome=true,
		tags= "",
		plugin = {"pretty", "json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)
public class MainRunner {

	
}
