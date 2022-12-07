package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.CursorStylePage;

public class CursorStylePageSteps extends BasicPage {
    CursorStylePage cursorStylePage = initPage(CursorStylePage.class);

    @Step
    public CursorStylePageSteps openCursorTab(){
        cursorStylePage.goToCursorTab();
        return initPage(CursorStylePageSteps.class);
    }

    @Step
    public CursorStylePageSteps dragAndDropCenterClick(){
        cursorStylePage.dragAndDropCenterClick();
        return this;
    }

    @Step
    public CursorStylePageSteps dragAndDropLeftClick(){
        cursorStylePage.dragAndDropLeftClick();
        return this;
    }


}
