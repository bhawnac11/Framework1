package com.Framework.GenericRepo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataHandler{
    private static Properties prop;

    public static Properties loadProperties(String filePath) {
        try (FileInputStream fis = new FileInputStream(AutomationConstant.CONFIG_FILE_PATH)) {
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}