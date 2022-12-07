import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.ContainerRestrictedPage;
import pages.DraggablePage;
import steps.ContainerRestrictedPageSteps;
import steps.DragabblePageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;

public class ContainerRestrictedTests extends BaseTest{
    BasicPage basicPage;
    ContainerRestrictedPage containerRestrictedPage;
    ContainerRestrictedPageSteps containerRestrictedPageSteps;

    String nameOfTab = "Dragabble";
    String position = "0px";


    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getDragabblePath());
        containerRestrictedPage = initPage(ContainerRestrictedPage.class);
        containerRestrictedPageSteps = initPage(ContainerRestrictedPageSteps.class);
    }

    @Test
    public void verifyContainerWithinTheBox(){

    }

}
