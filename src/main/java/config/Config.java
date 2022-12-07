package config;

public class Config {
    private Config() {
    }

    public static String get(String propertyKey) {
        return ConfigReader.getInstance().getProperty(propertyKey);
    }
}
