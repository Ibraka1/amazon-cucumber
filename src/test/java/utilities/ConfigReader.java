package utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
    public static String getProperty(String key) {

        Properties properties = new Properties();

        try {
            FileInputStream fis = new FileInputStream("configuration.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(key);
    }


}
