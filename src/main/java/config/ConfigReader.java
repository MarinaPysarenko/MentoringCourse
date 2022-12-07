package config;

import java.util.ResourceBundle;
import java.util.logging.Logger;


public class ConfigReader {

   // private static final Logger LOGGER = Logger.getLogger(ConfigReader.class);
    private static ConfigReader CLASS_INSTANCE = null;
    private static ResourceBundle rb;
    private ConfigReader() {
    }

    public static synchronized  ConfigReader getInstance() {
        if (CLASS_INSTANCE == null) {
            CLASS_INSTANCE = new ConfigReader();
            readProperties();
        }
        return CLASS_INSTANCE;
    }

    public synchronized String getProperty(String key) {
        return rb.getString(key);
    }

    private static void readProperties() {
        String path = System.getProperty("configPath");
      //  LOGGER.info("CONFIG FILE: " + path);
        if (path == null) {
            throw new RuntimeException("Config path not found!");
        }
        rb = ResourceBundle.getBundle(path);
    }
}
