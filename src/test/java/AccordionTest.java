import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccordionPage;
import pages.BasicPage;
import steps.AccordionSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class AccordionTest extends BaseTest{
    AccordionPage accordionPage;
    AccordionSteps accordionSteps;
    String expectedText = "Richard McClintock";

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        initPage(BasicPage.class).goToWidgetsSection();
        accordionSteps =  initPage(AccordionSteps.class).navigateToAccordionSection();
        accordionSteps.openAccordionSection();
        accordionPage = initPage(AccordionPage.class);
    }

    @Test
    public void openAccordion(){
        assertThat(accordionPage.getTextFromAccordion()).contains(expectedText);
    }

}
