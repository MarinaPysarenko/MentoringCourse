package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Settings {
    private static final String SELENIUM_BASEURL = "selenium.baseUrl";
    private static final String SELENIUM_PROPERTIES = "selenium.properties";
    private static final String SELECT_MENU_URL = "selectPath";
    private static final String PROGRESS_BAR_PATH = "progressBarPath";
    private static final String SORTABLE_PATH = "sortablePath";
    private static final String SELECTABLE_URL = "selectablePath";
    private static final String Resizable_PATH = "resizablePAth";
    private static final String Droppable_URL = "droppablePath";
    private static final String Dragabble_URL = "dragabblePath";
    private static final String Book_URL = "booksPath";


    private String baseUrl;
    private Properties properties = new Properties();
    private String selectMenuUrl;
    private String progressBarUrl;
    private String sortableUrl;
    private String selectableUrl;
    private String resizableUrl;
    private String droppableURL;
    private String dragabbleURL;
    private String bookURL;



    public Settings() {
        loadSettings();
    }

    private void loadSettings() {
        properties = loadPropertiesFile();
        baseUrl = getPropertyOrThrowException(SELENIUM_BASEURL);
        selectMenuUrl = getPropertyOrThrowException(SELECT_MENU_URL);
        progressBarUrl = getPropertyOrThrowException(PROGRESS_BAR_PATH);
        sortableUrl  = getPropertyOrThrowException(SORTABLE_PATH);
        selectableUrl = getPropertyOrThrowException(SELECTABLE_URL);
        resizableUrl =  getPropertyOrThrowException(Resizable_PATH);
        droppableURL =  getPropertyOrThrowException(Droppable_URL);
        dragabbleURL  =  getPropertyOrThrowException(Dragabble_URL);
        bookURL =  getPropertyOrThrowException(Book_URL);
    }

    private Properties loadPropertiesFile() {
        try {
            // get specified property file
            String filename = getPropertyOrNull(SELENIUM_PROPERTIES);
            if (filename == null) {
                filename = SELENIUM_PROPERTIES;
            }
            InputStream stream = getClass().getClassLoader().getResourceAsStream(filename);

            if (stream == null) {
                stream = new FileInputStream(new File(filename));
            }
            Properties result = new Properties();
            result.load(stream);
            return result;
        } catch (IOException e) {
            throw new UnknownPropertyException("Property file is not found");
        }
    }

    public String getPropertyOrNull(String name) {
        return getProperty(name, false);
    }

    public String getPropertyOrThrowException(String name) {
        return getProperty(name, true);
    }

    private String getProperty(String name, boolean forceExceptionIfNotDefined) {
        String result;
        if ((result = System.getProperty(name, null)) != null && result.length() > 0) {
            return result;
        } else if ((result = getPropertyFromPropertiesFile(name)) != null && result.length() > 0) {
            return result;
        } else if (forceExceptionIfNotDefined) {
            throw new UnknownPropertyException("Unknown property: [" + name + "]");
        }
        return result;
    }

    private String getPropertyFromPropertiesFile(String name) {
        Object result = properties.get(name);
        if (result == null) {
            return null;
        } else {
            return result.toString();
        }
    }

    public WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("disable-notifications");
        options.addArguments("--disable-extensions");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }
    public String getBaseUrl() {
        return  baseUrl;
    }

    public String getSeleniumBaseurl() {
        return baseUrl;
    }

    public String getSelectMenuUrl(){
        return selectMenuUrl;
    }

    public String getProgressBarUrl(){
        return progressBarUrl;
    }

    public String getSortablePath(){
        return sortableUrl;
    }

    public String getSelectablePath(){
        return selectableUrl;
    }

    public String getResizablePath(){
        return resizableUrl;
    }

    public String getDroppablePath(){
        return droppableURL;
    }
    public String getDragabblePath(){
        return dragabbleURL;
    }

    public String getBookPath(){
        return bookURL;
    }

}
