package StepDefinitions.GeneralSteps;

import org.junit.jupiter.api.BeforeAll;
import static BrowserFactory.DriverFactory.getDriver;


public class Hook {
    /**
     * Method responsible to initiate the InputExecutionParameters class and get files properties
     *
     *
     */
    @BeforeAll
    public static void setup() {
        InputExecutionParameters.setTags();
        ApplicationProperties.setProperties();
    }
    /**
     *  Method that closes the browser after test execution
     *
     */
    public static void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }


}