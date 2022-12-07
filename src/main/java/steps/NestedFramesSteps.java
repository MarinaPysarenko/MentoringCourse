package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.NestedFrames;

public class NestedFramesSteps extends BasicPage {
    NestedFrames nestedFrames = initPage(NestedFrames.class);

    @Step
    public NestedFramesSteps openNestedTab(){
        nestedFrames.openNestedTab();
        return initPage(NestedFramesSteps.class);
    }

    @Step
    public NestedFramesSteps switchToFrame(){
        nestedFrames.switchToFrame("frame1");
        return this;
    }


    @Step
    public NestedFramesSteps switchToFrameWithIndex(){
        nestedFrames.switchToFrameWithIndex(0);
        return this;
    }
}
