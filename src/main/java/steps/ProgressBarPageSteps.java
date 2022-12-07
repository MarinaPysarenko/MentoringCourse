package steps;


import io.qameta.allure.Step;
import pages.BasicPage;
import pages.ProgressBarPage;

import static framework.Utils.scrollDown;
import static framework.Utils.scrollUp;

public class ProgressBarPageSteps extends BasicPage {
    ProgressBarPage progressBarPage = initPage(ProgressBarPage.class);

    @Step
    public ProgressBarPageSteps goToProgressBarTab() throws InterruptedException {
        Thread.sleep(300);
        scrollDown();
        progressBarPage.goToProgressBarTab();
        scrollUp();
        return initPage(ProgressBarPageSteps.class);
    }
    @Step
    public ProgressBarPageSteps clickStartButton(){
        progressBarPage.clickStartButton();
        return this;
    }

    @Step
    public ProgressBarPageSteps clickResetButton(){
        progressBarPage.clickResetButton();
        return this;
    }

    @Step
    public ProgressBarPageSteps clickStopButton() throws InterruptedException {
        Thread.sleep(300);
        progressBarPage.clickStopButton();
        return this;
    }
}
