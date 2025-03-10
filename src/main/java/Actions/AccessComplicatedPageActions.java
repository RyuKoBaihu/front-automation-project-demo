package Actions;

import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.getUrl;


public class AccessComplicatedPageActions {

    WebDriver driver = getDriver();
    String url = getUrl();

    public void accessComplicatedPage() {
        driver.get(url);
        System.out.println("A URL obtida é: " + url);
    }




}
