package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.*;

public class ProgressBarPage extends BasicPage {
    public final static String progress_Bar_Tab = "(//li[@id='item-4'])[3]";
    public final static String start_button = "#startStopButton";
    public final static String progress_bar = "//div[@role='progressbar']";
    public final static String progress_bar_success = "//div[@role='progressbar' and text()='100%']";
    public final static String progress_Bar_Header = ".pattern-backgound.playgound-header";
    public final static String reset_Button = "#resetButton";
    public final static String stop_Button = "startStopButton";


    @FindBy(xpath = progress_Bar_Tab)
    WebElement progressBarTab;

    @FindBy(css = start_button)
    WebElement startButton;

    @FindBy(xpath = progress_bar)
    WebElement progressBar;

    @FindBy(xpath = progress_bar_success)
    WebElement progressBarSuccess;

    @FindBy(css = progress_Bar_Header)
    WebElement progressBarHeader;

    @FindBy(css = reset_Button)
    WebElement resetButton;

    @FindBy(id = stop_Button)
    WebElement stopButton;

    public void goToProgressBarTab() {
        waitForElementToBeClickable(progressBarTab);
        progressBarTab.click();
    }

    public void clickStartButton() {
        startButton.click();
    }

    public String getProgressBar() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(progressBar.getAttribute("aria-valuenow"));
        return progressBar.getAttribute("aria-valuenow");
    }

    public String getHeaderProgressBarPage() {
        return progressBarHeader.getText();
    }

    public void clickResetButton() {
        resetButton.click();
    }

    public void clickStopButton() {
        stopButton.click();
    }

    public void waitingForProgressBar() {
        waitPresenceOfElementLocated(By.xpath(progress_bar_success));
    }

    public String getTextButton() {
        return startButton.getText();
    }


}
