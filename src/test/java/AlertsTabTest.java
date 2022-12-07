import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.BasicPage;
import steps.AlertsSteps;


import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class AlertsTabTest extends BaseTest {
    AlertsPage alertsPage;
    AlertsSteps alertsSteps;
    BasicPage basicPage;
    public String getTextExpectedText = "You clicked a button";
    public String textAppearAfter5Sec = "This alert appeared after 5 seconds";
    public String confirmResultText = "You selected Ok";
    public String expectedTextKey = "You entered Test User";

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        basicPage.goToAlertWindowsTab();
        alertsSteps = initPage(AlertsSteps.class).goToAlertsTab();
        alertsPage = initPage(AlertsPage.class);
    }

    @Test
    public void openAlertWindowsPage() {
        alertsSteps.clickButtonToSeeAlert()
                    .switchToAlert();
        assertThat(alertsPage.switchToAlertAndGetText()).isEqualTo(getTextExpectedText);
    }

    @Test
    public void openAlertTimerWindowsPage() {
        alertsSteps.timerAlertButtonClick()
                  .switchToAlert();
        assertThat(alertsPage.timerAlertButton()).isEqualTo(textAppearAfter5Sec);
    }

    @Test
    public void confirmResultWindowsPage() {
        alertsSteps.clickConfirmButton()
                    .acceptAlert();
        assertThat(alertsPage.getConfirmButton()).isEqualTo(confirmResultText);
    }

    @Test
    public void promtResultWindowsPage() {
        alertsSteps.promtButtonClick();
        alertsSteps.switchToAlert();
        alertsPage.promptResult("Test User");
      //  assertThat(alertsPage.promptResult("Test USer")).isEqualTo(expectedTextKey);
    }


}
