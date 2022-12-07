package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.ContainerRestrictedPage;

import java.util.Base64;

public class ContainerRestrictedPageSteps extends BasicPage {
    ContainerRestrictedPage containerRestrictedPage = initPage(ContainerRestrictedPage.class);

    @Step
    public ContainerRestrictedPageSteps openContainerRestrictedTab(){
        containerRestrictedPage.openContainerRestrictionTab();
        return initPage(ContainerRestrictedPageSteps.class);
    }
}
