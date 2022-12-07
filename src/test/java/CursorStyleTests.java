import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.CursorStylePage;
import pages.DraggablePage;
import steps.CursorStylePageSteps;
import steps.DragabblePageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class CursorStyleTests extends BaseTest{
    BasicPage basicPage;
    CursorStylePageSteps cursorStylePageSteps;
    CursorStylePage cursorStylePage;

    String nameOfTab = "Dragabble";
    String position = "0px";


    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getDragabblePath());
        cursorStylePageSteps = initPage(CursorStylePageSteps.class).openCursorTab();
        cursorStylePage = initPage(CursorStylePage.class);
    }

    @Test
    public void checkCenterClickingCursor(){
        assertThat(cursorStylePageSteps.dragAndDropCenterClick());
    }


    @Test
    public void checkДуаеClickingCursor(){
        assertThat(cursorStylePageSteps.dragAndDropLeftClick());
    }



}
