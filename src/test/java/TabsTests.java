import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.TabsPage;
import steps.TabsPageSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class TabsTests extends BaseTest{
    TabsPage tabsPage;
    TabsPageSteps tabsPageSteps;

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        initPage(BasicPage.class).goToWidgetsSection();
        tabsPage = initPage(TabsPage.class);
        tabsPageSteps = initPage(TabsPageSteps.class).proceedToTabsPage();
    }

    @Test
    public void verifyTabsHeader(){
        assertThat(tabsPage.getHeaderText().equals("Tabs"));
    }

    @Test
    public void verifyOriginTab(){
        tabsPageSteps.openOriginTab();
        assertThat(tabsPage.getTextFromOriginTab().contains("Lorem Ipsum"));
    }

    @Test
    public void verifyUseTab(){
        tabsPageSteps.openUseTab();
        assertThat(tabsPage.getNameUseTab().equals("Use"));
    }
}
