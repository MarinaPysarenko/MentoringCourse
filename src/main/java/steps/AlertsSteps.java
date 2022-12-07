package steps;

import io.qameta.allure.Step;
import pages.AlertsPage;
import pages.BasicPage;

public class AlertsSteps extends BasicPage {
    AlertsPage alertsPage = initPage(AlertsPage.class);

    @Step
    public AlertsSteps goToAlertsTab() {
        alertsPage.openAlertsTab();
        return initPage(AlertsSteps.class);
    }

    @Step
    public AlertsSteps clickButtonToSeeAlert() {
        alertsPage.clickButtonToSeeAlert();
        return this;
    }

    @Step
    public AlertsSteps acceptAlert(){
        alertsPage.acceptAlert();
        return this;
    }

    @Step
    public AlertsSteps switchToAlert(){
        alertsPage.switchToAlert();
        return this;
    }

    @Step
    public AlertsSteps timerAlertButtonClick(){
        alertsPage.timerAlertButtonClick();
        return this;
    }

    @Step
    public AlertsSteps clickConfirmButton(){
        alertsPage.clickConfirmButton();
        return this;
    }

    @Step
    public AlertsSteps promtButtonClick(){
        alertsPage.promtButtonClick();
        return this;
    }



}
