package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

import static framework.Utils.JSexecuter;

public class SwitchBetweenTab extends BasicPage {
    public String script = "window.open();";
    public static final String GET_LINK = "//a[contains(text(),'Edit account')]";

    @FindBy(xpath = GET_LINK)
    WebElement anyLink;

    public SwitchBetweenTab getNewTab() {
        JSexecuter(script);
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        driver.get(settings.getBaseUrl());
        driver.switchTo().window(tab.get(0));
        anyLink.click();
        return initPage(SwitchBetweenTab.class);
    }
}

