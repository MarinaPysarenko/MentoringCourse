import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.SelectMenuPage;
import pages.StandardMultiSelect;
import steps.SelectMenuPageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class StandardMultiSelectTests extends BaseTest{
    StandardMultiSelect standardMultiSelect;
    BasicPage basicPage;

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        basicPage.goToWidgetsSection();
        standardMultiSelect = initPage(StandardMultiSelect.class);
        initPage(SelectMenuPageSteps.class).goToSelectMenuTab();
        standardMultiSelect.selectValueFromStandardMultiSelect("Opel");
        standardMultiSelect.selectValueFromStandardMultiSelect("Volvo");
    }

    @Test
    public void verifyMultipleValues(){
        assertTrue(standardMultiSelect.getSelectedOptions());
    }


    @Test
    public void deselectAll(){
        assertThat(standardMultiSelect.deselectValue());
    }


}
