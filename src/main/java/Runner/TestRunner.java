package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@SuppressWarnings("DefaultAnnotationParam")
@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = {"src/test/resources/features"},
        glue = {"StepDefinitions"},
        monochrome = false,
        stepNotifications = true,
        tags ="@first_test"
)
public class TestRunner {

}
