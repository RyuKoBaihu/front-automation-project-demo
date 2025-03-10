package Utils;
import BrowserFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static BrowserFactory.DriverFactory.getDriver;
import static Utils.SendKeys.wait;

public class ClickElements {

    public static void clickByName(String name){
        DriverFactory.getWebDriverWait().until(ExpectedConditions.elementToBeClickable((By.name(name))));
        WebElement element = getDriver().findElement(By.name(name));
        element.click();
    }

}
