import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.DraggablePage;
import steps.DragabblePageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class DragabblePageTest extends BaseTest {
    BasicPage basicPage;
    DragabblePageSteps dragabblePageSteps;
    DraggablePage draggablePage;

    String nameOfTab = "Dragabble";
    String position = "0px";


    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getDragabblePath());
        dragabblePageSteps = initPage(DragabblePageSteps.class);
        draggablePage = initPage(DraggablePage.class);
    }

    @Test
    public void verifyTab() {
        assertThat(basicPage.getHeaderName().equals(nameOfTab));
    }

    @Test
    public void verifySimpleDragAndDrop() {
        assertThat(dragabblePageSteps.dragAndDropInSimpleTab());
    }

    @Test
    public void verifyAxisRestriction() {
        dragabblePageSteps.goToAxisTab().dragAndDropXAxis();
        assertThat(draggablePage.getYPosition().equals(position));
    }

    @Test
    public void verifyAxisYRestriction() {
        dragabblePageSteps.goToAxisTab().dragAndDropYAxis();
        assertThat(draggablePage.getYPosition().equals(position));
    }


}
