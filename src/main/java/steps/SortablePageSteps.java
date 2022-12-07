package steps;

import framework.BasePage;
import io.qameta.allure.Step;
import pages.BasicPage;
import pages.SortablePage;

public class SortablePageSteps extends BasicPage {
    SortablePage sortablePage = initPage(SortablePage.class);

    @Step
    public SortablePageSteps moveElementInList(String valueOne, String valueTwo){
        sortablePage.moveElementInList(valueOne,valueTwo);
        return initPage(SortablePageSteps.class);
    }

    @Step
    public SortablePageSteps goToGridTab(){
        sortablePage.goToGridTab();
        return this;
    }

}
