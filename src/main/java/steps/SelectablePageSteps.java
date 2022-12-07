package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.SelectMenuPage;
import pages.SelectablePage;

public class SelectablePageSteps extends BasicPage {
    SelectablePage selectablePage = initPage(SelectablePage.class);

    @Step
    public SelectablePageSteps selectElement(String value){
        selectablePage.clickOnElement(value);
        return initPage(SelectablePageSteps.class);
    }

    @Step
    public SelectablePageSteps openGridTab(){
        selectablePage.goToGridTab();
        return this;
    }

}
