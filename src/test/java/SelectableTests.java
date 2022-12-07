import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.SelectablePage;
import steps.SelectablePageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class SelectableTests extends BaseTest{
    BasicPage basicPage;
    SelectablePage selectablePage;
    SelectablePageSteps selectablePageSteps;

    String nameOfTab = "Selectable";
    String nameElement = "Morbi leo risus";
    String hexNameOfColor = "#007bff";
    String nameOfElement = "Five";

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getSelectablePath());
        selectablePage = initPage(SelectablePage.class);
        selectablePageSteps = initPage(SelectablePageSteps.class);

    }

    @Test
    public void verifyTab(){
        assertThat(basicPage.getHeaderName().equals(nameOfTab));
    }

    @Test
    public void verifySelectingElement(){
        selectablePageSteps.selectElement(nameElement);
        assertThat(selectablePage.getAttributeOfElementAndConvertToHex(nameElement).equals(hexNameOfColor));
    }

    @Test
    public void verifySelectingElementInGrid(){
        selectablePageSteps.openGridTab();
        assertThat(selectablePage.getAttributeOfElementAndConvertToHex(nameOfElement).equals(hexNameOfColor));
    }
}
