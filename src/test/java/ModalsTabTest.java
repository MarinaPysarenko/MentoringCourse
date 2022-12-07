import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.BasicPage;
import pages.ModalsDialogPage;
import steps.ModalsDialogPageSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class ModalsTabTest extends BaseTest{
    ModalsDialogPage modalsDialogPage;
    ModalsDialogPageSteps modalsDialogPageSteps;
    String expectedText = "This is a small modal. It has very less content";
    String expectedTextLargeModal = "Large Modal";


    @BeforeMethod(alwaysRun = true)
    public void preconditions() throws InterruptedException {
        initPage(BasicPage.class).goToAlertWindowsTab();
        modalsDialogPage =   initPage(ModalsDialogPage.class);
        modalsDialogPageSteps = initPage(ModalsDialogPageSteps.class).openModalsTab();
    }

    @Test
    public void openSmallModal(){
        modalsDialogPageSteps.clickSmallModal();
        assertThat(modalsDialogPage.getTextFromSmallModal().equals(expectedText));
    }

    @Test
    public void openLargeModal(){
        modalsDialogPageSteps.clickLargeModal();
        assertThat(modalsDialogPage.getNameOfLargeModal().equals(expectedTextLargeModal));
    }

}
