package steps;

import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.DroppablePage;

public class DroppablePageSteps extends BasicPage {
    DroppablePage droppablePage = initPage(DroppablePage.class);

    @Step
    public DroppablePageSteps goToAcceptTab(){
        droppablePage.goToAcceptTab();
        return initPage(DroppablePageSteps.class);
    }

    @Step
    public DroppablePageSteps goToPreventTab(){
        droppablePage.goToPreventTab();
        return this;
    }

    @Step
    public DroppablePageSteps goToRevertTab(){
        droppablePage.goToRevertTab();
        return this;
    }

    @Step
    public DroppablePageSteps dragAndDropWillRevertElement(){
        droppablePage.dragAndDropWillRevertBox();
        return  this;
    }

    @Step
    public DroppablePageSteps dragAndDropNotRevertElement(){
        droppablePage.dragAndDropNotRevertElement();
        return this;
    }
}
