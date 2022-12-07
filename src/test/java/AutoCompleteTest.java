import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutocompleteNewPage;
import pages.BasicPage;
import steps.AutocompleteSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class AutoCompleteTest extends BaseTest {
    AutocompleteNewPage autoCompletePage;
    AutocompleteSteps autocompleteSteps;
    BasicPage basicPage;
    String oneColorName = "Yellow";
    String anotherColorName = "Red";

    @BeforeMethod
    public void preConditions() throws InterruptedException {
        basicPage =  initPage(BasicPage.class);
        basicPage.goToWidgetsSection();
        Thread.sleep(1000);
        autocompleteSteps = initPage(AutocompleteSteps.class).goToAutoCompleteSection();
        autoCompletePage = initPage(AutocompleteNewPage.class);
    }

    @Test
    public void verifySingleAutoComplete() {
        autocompleteSteps.colorNameClick()
                .setSingleColor(oneColorName);
        assertThat(autoCompletePage.getSingleColorName()).isEqualTo(oneColorName);
    }

    @Test
    public void verifyMultipleAutoComplete() {
        autocompleteSteps.multipleColorClickInField().setMultipleColor(oneColorName)
                        .setMultipleColor(anotherColorName)
                .removeIconClick();
       assertThat(autoCompletePage.getColorName()).isEqualTo(oneColorName);
    }

    @Test
    public void verifyClearMultipleAutoCompleteField() {
        autocompleteSteps.multipleColorClickInField().setMultipleColor(oneColorName)
                .setMultipleColor(anotherColorName);
      assertTrue(autoCompletePage.multipleFieldIsEmpty());
    }

}
