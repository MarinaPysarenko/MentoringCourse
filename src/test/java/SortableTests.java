import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.SortablePage;
import steps.SortablePageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class SortableTests extends BaseTest{
    SortablePage sortablePage;
    BasicPage basicPage;
    SortablePageSteps sortablePageSteps;
    String nameOfTab = "Sortable";
    String firstValue = "One";
    String secondValue = "Five";
    int firstPosition;
    int secondPosition;


    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getSortablePath());
        sortablePage = initPage(SortablePage.class);
        sortablePageSteps = initPage(SortablePageSteps.class);
    }

    @Test
    public void verifyTab(){
        assertThat(basicPage.getHeaderName().equals(nameOfTab));
    }

    @Test
    public void verifyChangingPositionOfElementInTheList(){
        firstPosition = sortablePage.getLocationElement(firstValue);
        sortablePageSteps.moveElementInList(firstValue, secondValue);
        secondPosition = sortablePage.getLocationElement(firstValue);
        assertThat(sortablePage.differenceBetweenElements(firstPosition, secondPosition)).isNegative();
    }

    @Test
    public void verifyChangingPositionOfElementInTheGrid(){
        sortablePageSteps.goToGridTab();
        firstPosition = sortablePage.getLocationElementInGrid(firstValue);
        sortablePage.moveElementInGrid(firstValue, secondValue);
        secondPosition = sortablePage.getLocationElementInGrid(firstValue);
        assertThat(sortablePage.differenceBetweenElements(firstPosition, secondPosition)).isNegative();
    }
}
