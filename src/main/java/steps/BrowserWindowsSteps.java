package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.BrowserWindows;

public class BrowserWindowsSteps extends BasicPage {
    BrowserWindows browserWindows = initPage(BrowserWindows.class);

    @Step
    public BrowserWindowsSteps openBrowserWindowsTab(){
        browserWindows.openBrowserWindowsTab();
        return initPage(BrowserWindowsSteps.class);
    }

    @Step
    public BrowserWindowsSteps openNewTab(){
        browserWindows.openNewTab();
        return this;
    }

    @Step
    public BrowserWindowsSteps switchingBetweenTabs(){
        browserWindows.switchingBetweenTabs();
        return this;
    }

    @Step
    public BrowserWindowsSteps openNewWindow(){
        browserWindows.openNewWindow();
        return this;
    }
}
