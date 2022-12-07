import org.testng.annotations.*;
import pages.BasicPage;
import pages.ProgressBarPage;
import steps.ProgressBarPageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static framework.Utils.scrollDown;
import org.testng.asserts.SoftAssert;
import static org.fest.assertions.Assertions.assertThat;

public class ProgressBarTests extends BaseTest{
    ProgressBarPage progressBarPage;
    ProgressBarPageSteps progressBarPageSteps;
    SoftAssert softAssert = new SoftAssert();
    String expectedNameTab = "Progress Bar";
    String expectedSuccessLoadingBar = "100";
    String expectedNameButton = "Start";
    String expectedResetValue = "0";

    @BeforeMethod(alwaysRun = true)
    public void preconditions() throws InterruptedException {
        driver.get(settings.getProgressBarUrl());
        progressBarPage = initPage(ProgressBarPage.class);
        progressBarPageSteps = initPage(ProgressBarPageSteps.class);
    }

    @Test
    public void verifyHeaderProgressBarTab(){
        softAssert.assertTrue(progressBarPage.getHeaderProgressBarPage().equals(expectedNameTab));

    }

    @Test
    public void verifySuccessOfProgressBar() throws InterruptedException {
        progressBarPageSteps.clickStartButton();
        progressBarPage.waitingForProgressBar();
        softAssert.assertTrue(progressBarPage.getProgressBar().contains(expectedSuccessLoadingBar));
    }

    @Test
    public void verifyStopAndStartButtonProgressBar() throws InterruptedException {
        progressBarPageSteps.clickStartButton().clickStopButton();
        softAssert.assertTrue(progressBarPage.getTextButton().equals(expectedNameButton));

    }

    @Test
    public void verifyResetButton() throws InterruptedException {
        progressBarPageSteps.clickStartButton();
        progressBarPage.waitingForProgressBar();
        progressBarPage.getProgressBar();
        progressBarPageSteps.clickResetButton();
        softAssert.assertTrue( progressBarPage.getProgressBar().equals(expectedResetValue));
    }

}
