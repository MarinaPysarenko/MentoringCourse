import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.FramesPage;
import steps.FramesPageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class FramesPageTest extends BaseTest{
    FramesPage framesPage ;
    FramesPageSteps framesPageSteps;
    String headerText = "This is a sample page";

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        initPage(BasicPage.class).goToAlertWindowsTab();
        framesPage = initPage(FramesPage.class);
        framesPageSteps =  initPage(FramesPageSteps.class).openFrameTab();
    }

    @Test
    public void verifyParentFrame() {
        framesPageSteps.switchToFrame("frame1");
        assertThat(framesPage.getFrameHeader()).isEqualTo(headerText);
    }

    @Test
    public void verifyFrame2() {
        framesPageSteps.switchToFrame("frame2");
        assertThat(framesPage.getFrameHeader()).isEqualTo(headerText);
    }
}
