package steps;

import framework.BasePage;
import io.qameta.allure.Step;
import pages.AccordionPage;
import pages.BasicPage;

public class AccordionSteps extends BasicPage {

    @Step
    public AccordionSteps navigateToAccordionSection(){
        initPage(AccordionPage.class).goToAccordionSection();
        return initPage(AccordionSteps.class);
    }

    @Step
    public AccordionSteps openAccordionSection(){
        initPage(AccordionPage.class).openAccordionTab();
        return this;
    }

}
