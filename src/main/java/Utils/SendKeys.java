package Utils;

import BrowserFactory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;

import static BrowserFactory.DriverFactory.getDriver;

public class SendKeys {

    public static WebDriverWait wait;

    public static void sendKeysByID(String text, String id_element){
        DriverFactory.getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated((By.id(id_element))));
        WebElement element = getDriver().findElement(By.id(id_element));
        element.sendKeys(text);
    }

}

