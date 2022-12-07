package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.waitAlertIsPresent;

public class AlertsPage extends BasicPage {
    public final static String alerts_tab = "(//li[@id='item-1'])[2]";
    public final static String alert_button = "//button[@id='alertButton']";
    public final static String timer_Alert_Button = "#timerAlertButton";
    public final static String confirm_Button = "confirmButton";
    public final static String confirm_Result = "confirmResult";
    public final static String promt_Button = "promtButton";
    public final static String promt_Result = "promptResult";


    public String alertMessage;
    public String textKey = "Test User";


    @FindBy(xpath = alerts_tab)
    WebElement alertsTab;

    @FindBy(xpath = alert_button)
    WebElement alertButton;

    @FindBy(css = timer_Alert_Button)
    WebElement timerAlertButton;

    @FindBy(id = confirm_Button)
    WebElement confirmButton;

    @FindBy(id = confirm_Result)
    WebElement confirmResult;

    @FindBy(id = promt_Button)
    WebElement promtButton;

    @FindBy(id = promt_Result)
    WebElement promtResult;


    public void openAlertsTab() {
        alertsTab.click();
    }

    public void clickButtonToSeeAlert() {
        alertButton.click();
    }

    public String switchToAlertAndGetText() {
        alertMessage = driver.switchTo().alert().getText();
        return alertMessage;
    }


    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }


    public void switchToAlert() {
        driver.switchTo().alert();
    }


    public void timerAlertButtonClick() {
        timerAlertButton.click();
        waitAlertIsPresent();
    }


    public String timerAlertButton() {
        alertMessage = driver.switchTo().alert().getText();
        return alertMessage;
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public String getConfirmButton() {
        alertMessage = confirmResult.getText();
        return alertMessage;
    }

    public void promtButtonClick() {
        promtButton.click();
    }

    public String promptResult(String textKey) {
        driver.switchTo().alert().sendKeys(textKey);
        return promtResult.getText();
    }

}
