package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.FramesPage;

public class FramesPageSteps extends BasicPage {
    FramesPage framesPage = initPage(FramesPage.class);

    @Step
    public FramesPageSteps openFrameTab(){
        framesPage.openFrameTab();
        return initPage(FramesPageSteps.class);
    }

    @Step
    public FramesPageSteps switchToFrame(String frameName){
        framesPage.switchToParentFrame(frameName);
        return this;
    }
}
