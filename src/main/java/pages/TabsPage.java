package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.getText;

public class TabsPage extends BasicPage {
    public final static String tabs_link = "(//li[@id='item-5'])[2]";
    public final static String header_selector = "//div[@class='pattern-backgound playgound-header']";
    public final static String go_To_Origin_Tab = "demo-tab-origin";
    public final static String get_Origin_Text = "//div[@id='demo-tabpane-origin']";
    public final static String go_To_Use_Tab = "//a[@id='demo-tab-use']";

    @FindBy(xpath = tabs_link)
    WebElement tabslink;

    @FindBy(id = go_To_Origin_Tab)
    WebElement goToOriginTab;

    @FindBy(xpath = go_To_Use_Tab)
    WebElement goToUseTab;


    public void goToTabsPage() {
        tabslink.click();
    }

    public String getHeaderText() {
        System.out.println(getText(header_selector));
        return getText(header_selector);
    }

    public void clickOriginTab() {
        goToOriginTab.click();
    }

    public String getTextFromOriginTab() {
        System.out.println(getText(get_Origin_Text));
        return getText(get_Origin_Text);
    }

    public void goToUseTab() {
        goToUseTab.click();
    }

    public String getNameUseTab() {
        System.out.println(getText(go_To_Use_Tab));
        return getText(go_To_Use_Tab);
    }
}
