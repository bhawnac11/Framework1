package com.provar.utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class DataHandler {
    private static Properties prop;
    
    // Declare the config file path here
    private static final String CONFIG_FILE_PATH = "./src/test/resources/config.properties";
    public static String getProperty(String key) {
        try (FileInputStream fis = new FileInputStream(CONFIG_FILE_PATH)) {
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
