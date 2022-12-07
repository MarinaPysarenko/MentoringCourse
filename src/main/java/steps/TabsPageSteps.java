package steps;

import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.TabsPage;

import static framework.Utils.scrollDown;
import static framework.Utils.scrollUp;

public class TabsPageSteps extends BasicPage {
    TabsPage tabsPage = initPage(TabsPage.class);

    @Step
    public TabsPageSteps proceedToTabsPage(){
        scrollDown();
        tabsPage.goToTabsPage();
        scrollUp();
        return initPage(TabsPageSteps.class);
    }

    @Step
    public TabsPageSteps openOriginTab(){
        tabsPage.clickOriginTab();
        return this;
    }

    @Step
    public TabsPageSteps openUseTab(){
        tabsPage.goToUseTab();
        return this;
    }


}
