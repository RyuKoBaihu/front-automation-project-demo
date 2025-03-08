package BrowserFactory;

import StepDefinitions.GeneralSteps.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverFactory {

    //The maximum timeout that the automation will wait for the element
    private static final long ELEMENT_TIMEOUT = 120;

    private static WebDriver driver;
    public static WebDriverWait wait;

    private static String zoompercentage;


    private DriverFactory(){}

    public static WebDriver getDriver()  {

        if(driver == null){
            ChromeOptions options = new ChromeOptions();
            //Allows no certificate validation
            options.setAcceptInsecureCerts(true);

            driver = new ChromeDriver(options);
            driver.navigate().to(ApplicationProperties.getUrl());
            driver.manage().window().maximize();
            //Defines the WebDriver default wait
            wait = new WebDriverWait(driver, Duration.ofSeconds(ELEMENT_TIMEOUT));

        }

        return driver;
    }


    public static void killDriver(){
        if(driver != null){
            driver.quit();
            System.out.println("Driver quit");
            driver = null;
        }
    }

    /**
     *
     * @return the WebDriver Wait pre-defined for the driver
     */
    public static WebDriverWait getWebDriverWait(){
        return wait;
    }

}





