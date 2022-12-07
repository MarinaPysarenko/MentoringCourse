import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.DroppablePage;
import steps.DroppablePageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class DroppablePageTests extends BaseTest{
    BasicPage basicPage;
    DroppablePage droppablePage;
    DroppablePageSteps droppablePageSteps;

    String nameOfTab = "Droppable";
    String hexNameDroppableBox = "#4682b4";
    String hexNameNotDroppableBox = "#000000";
    String getTextNotGreedyInnerDropBox = "Dropped!";
    String position = "0px";
    String notRevertElementPosition = "336px";


    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getDroppablePath());
        droppablePage = initPage(DroppablePage.class);
        droppablePageSteps = initPage(DroppablePageSteps.class);
    }

    @Test
    public void verifyTab(){
        assertThat(basicPage.getHeaderName().equals(nameOfTab));
    }

    @Test
    public void verifyDragAndDrop(){
        droppablePage.dragAndDrop();
        assertThat(droppablePage.getAttributeOfElementAndConvertToHex().equals(hexNameDroppableBox));
    }

    @Test
    public void verifyAcceptTab(){
        droppablePageSteps.goToAcceptTab();
        droppablePage.dragAndDropAcceptableElement();
        assertThat( droppablePage.getAcceptableDroppableElementColorHex().equals(hexNameDroppableBox));
    }

    @Test
    public void verifyNotAcceptableDropBox(){
        droppablePageSteps.goToAcceptTab();
        droppablePage.dragAndDropNotAcceptableElement();
        assertThat(droppablePage.getNotAcceptableDroppableElementColorHex().equals(hexNameNotDroppableBox));
    }

    @Test
    public void verifyPreventDroppableNotGreedy(){
        droppablePageSteps.goToPreventTab();
        droppablePage.dragAndDropPreventBox();
        assertThat(droppablePage.getTextFromInnerDrop().equals(getTextNotGreedyInnerDropBox));
    }

    @Test
    public void verifyDragAndDropGreedyDropBoxInner(){
        droppablePageSteps.goToPreventTab();
        droppablePage.dragAndDropGreedyDropBoxInner();
        assertThat(droppablePage.getTextFromOuterDroppable().equals(getTextNotGreedyInnerDropBox));
    }

    @Test
    public void verifyOuterDroppableColor(){
        droppablePageSteps.goToPreventTab();
        droppablePage.dragAndDropGreedyDropBoxInner();
        assertThat(droppablePage.getOuterDroppableColorHex().equals(hexNameNotDroppableBox));
    }

    @Test
    public void verifyWillRevert() throws InterruptedException {
        droppablePageSteps.goToRevertTab().dragAndDropWillRevertElement();
        Thread.sleep(500);
        assertThat(droppablePage.checkPositionRevertElement().contains(position));
    }

    @Test
    public void verifyNotRevert(){
        droppablePageSteps.goToRevertTab().dragAndDropNotRevertElement();
        assertThat(droppablePage.checkPositionRevertElement().equals(notRevertElementPosition));
    }

}
