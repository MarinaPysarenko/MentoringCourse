package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFrames extends BasicPage {
    public final String nested_Tab = "(//li[@id='item-3'])[2]";
    public final String parent_Iframe = "body";

    @FindBy(xpath = nested_Tab)
    WebElement nestedTab;

    @FindBy(css = parent_Iframe)
    WebElement parentIframe;

    public void openNestedTab() {
        nestedTab.click();
    }

    public void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }

    public void switchToFrameWithIndex(Integer idFrame) {
        driver.switchTo().frame(idFrame);
    }

    public String getFrame() {
        return parentIframe.getText();
    }


    public String getChildrenFrame() {
        return parentIframe.getText();
    }


}
