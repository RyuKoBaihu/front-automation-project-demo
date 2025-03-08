package StepDefinitions.GeneralSteps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {

    private static final Properties applicationproperties = new Properties();

    public static void setProperties() {

        try (FileInputStream fis = new FileInputStream("src/test/resources/application.properties")) {
            applicationproperties.load(fis);
        } catch (IOException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }

    }

    public static String getUrl () {
        return applicationproperties.getProperty("systemundertest.url");
    }
}
