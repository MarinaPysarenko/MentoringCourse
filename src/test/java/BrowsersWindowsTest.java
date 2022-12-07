import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BrowserWindows;
import pages.BasicPage;
import steps.BrowserWindowsSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class BrowsersWindowsTest extends BaseTest {
    BrowserWindows browserWindows;
    BrowserWindowsSteps browserWindowsSteps;
    BasicPage basicPage;
    private String expectedResult = "This is a sample page";

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage =  initPage(BasicPage.class);
        basicPage.goToAlertWindowsTab();
        browserWindows =  initPage(BrowserWindows.class);
        browserWindowsSteps = initPage(BrowserWindowsSteps.class).openBrowserWindowsTab();
    }


    @Test
    public void openAlertWindowsPage() {
        browserWindowsSteps.openNewTab()
                        .switchingBetweenTabs();
        assertThat(browserWindows.getTextFromPage()).isEqualTo(expectedResult);
    }

    @Test
    public void openNewWindowPage() {
        browserWindowsSteps.openNewWindow().switchingBetweenTabs();
        assertThat(browserWindows.getTextFromPage()).isEqualTo(expectedResult);
    }

    @Test
    public void openNewWindowMessagePage() {
        browserWindows.openNewWindowMessage();
        browserWindows.getChildWindow();
      //  assertThat(alertsWindows.getTextFromPage()).isEqualTo(expectedResult);
    }

      /*@AfterMethod
       public void logout() {
       driver.close();
     }*/
}
