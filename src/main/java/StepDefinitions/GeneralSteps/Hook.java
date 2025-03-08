package StepDefinitions.GeneralSteps;

import BrowserFactory.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;


public class Hook {
    // WebDriver compartilhado entre os testes
    protected static WebDriver driver;

    @BeforeAll
    public static void setup() {
        // Cria o WebDriver antes de todos os testes, usando a DriverFactory
        driver = DriverFactory.getDriver();
    }

    @AfterAll
    public static void tearDown() {
        // Fecha o WebDriver após todos os testes
        DriverFactory.quitDriver();
    }
}