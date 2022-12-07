package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.ModalsDialogPage;

import static framework.Utils.scrollDown;

public class ModalsDialogPageSteps extends BasicPage {
    ModalsDialogPage modalsDialogPage = initPage(ModalsDialogPage.class);

    @Step
    public ModalsDialogPageSteps openModalsTab() throws InterruptedException {
        scrollDown();
        modalsDialogPage.openModalsTab();
        return initPage(ModalsDialogPageSteps.class);
    }

    @Step
    public ModalsDialogPageSteps clickSmallModal(){
        modalsDialogPage.clickSmallModal();
        return this;
    }

    @Step
    public ModalsDialogPageSteps clickLargeModal(){
        modalsDialogPage.clickLargeModal();
        return this;
    }
}
