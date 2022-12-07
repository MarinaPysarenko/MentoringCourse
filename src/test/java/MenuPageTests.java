import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.MenuPage;
import steps.MenuPageSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class MenuPageTests extends BaseTest{
    MenuPage menuPage;
    MenuPageSteps menuPageSteps;

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        initPage(BasicPage.class).goToWidgetsSection();
        menuPage = initPage(MenuPage.class);
        menuPageSteps = initPage(MenuPageSteps.class).openMenuTab();
    }

    @Test
    public void verifyHeader(){
        assertThat(menuPage.getHeaderName().equals("Menu"));
    }


    @Test
    public void verifyHoverMenu(){
        menuPageSteps.hoverMenu().hoverSubMenu().hoverSubItem();
        assertThat(menuPage.getItemName().equals("Sub Sub Item 1"));
    }

}
