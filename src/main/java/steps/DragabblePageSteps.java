package steps;

import framework.BasePage;
import io.qameta.allure.Step;
import pages.BasicPage;
import pages.DraggablePage;

public class DragabblePageSteps extends BasicPage {
    DraggablePage draggablePage = initPage(DraggablePage.class);

    @Step
    public DragabblePageSteps dragAndDropInSimpleTab(){
        draggablePage.dragAndDropSimple();
        return initPage(DragabblePageSteps.class);
    }

    @Step
    public DragabblePageSteps goToAxisTab(){
        draggablePage.goToAxisTab();
        return this;
    }

    @Step
    public  DragabblePageSteps dragAndDropYAxis(){
        draggablePage.dragAndDropRestrictY();
        return this;
    }

    @Step
    public  DragabblePageSteps dragAndDropXAxis(){
        draggablePage.dragAndDropRestrictX();
        return this;
    }

}
