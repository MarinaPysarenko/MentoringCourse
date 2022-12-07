
import framework.BasePage;
import framework.Settings;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import pages.BasicPage;

import java.util.concurrent.TimeUnit;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;


public class BaseTest{
    public static Settings settings = new Settings();

    @BeforeMethod(alwaysRun = true)
    public static void beforeSuite() {
            driver = settings.getDriver();
            BasePage.settings = settings;
            driver.get(settings.getBaseUrl());
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void logout() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

    @AfterSuite(alwaysRun = true)
    public static void afterClass() {
            if(driver != null){
                driver.quit();
            }
        }
}
