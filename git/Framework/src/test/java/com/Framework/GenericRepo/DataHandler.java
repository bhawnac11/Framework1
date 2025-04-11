package com.provar.utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class DataHandler {
    private static Properties prop;
    
    // Declare the config file path here
    String CONFIG_FILE_PATH = AutomationConstant .CONFIG_FILE_PATH ; 
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
