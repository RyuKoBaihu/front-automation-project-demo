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
        tags ="@Elite_Individual_Numeric_Fields_Filled_In_With_Letters_In_W9_And_Instructions"
)
public class TestRunner {

}
