import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.NestedFrames;
import steps.NestedFramesSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class NestedFramesTest extends BaseTest {
    NestedFrames nestedFrames;
    NestedFramesSteps nestedFramesSteps;
    public String expectedResult = "Parent frame";
    public String childrenFrame = "Child Iframe";

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        initPage(BasicPage.class).goToAlertWindowsTab();
        nestedFrames = initPage(NestedFrames.class);
        nestedFramesSteps = initPage(NestedFramesSteps.class).openNestedTab().switchToFrame();
    }

    @Test
    public void verifyParentFrame(){
        assertThat(nestedFrames.getFrame()).isEqualTo(expectedResult);
    }

    @Test
    public void verifyChildFrame(){
        nestedFramesSteps.switchToFrameWithIndex();
        assertThat(nestedFrames.getChildrenFrame()).isEqualTo(childrenFrame);
    }
}
