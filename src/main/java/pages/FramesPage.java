package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasicPage {
    public final String frames_tab = "//span[normalize-space()='Frames']";
    public final String i_frame1 = "#sampleHeading";

    @FindBy(xpath = frames_tab)
    WebElement framestab;

    @FindBy(css = i_frame1)
    WebElement iframe;

    public void openFrameTab() {
        framestab.click();
    }

    public void switchToParentFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }

    public String getFrameHeader() {
        return iframe.getText();
    }

}
