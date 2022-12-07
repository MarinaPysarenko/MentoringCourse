import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.ResizablePage;
import pages.SelectablePage;
import steps.SelectablePageSteps;

import static framework.BasePage.driver;
import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class ResizablePath extends BaseTest {
    BasicPage basicPage;
    ResizablePage resizablePage;

    String nameOfTab = "Resizable";


    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        basicPage = initPage(BasicPage.class);
        driver.get(settings.getResizablePath());
        resizablePage = initPage(ResizablePage.class);
    }

    @Test
    public void verifyTab(){
        assertThat(basicPage.getHeaderName().equals(nameOfTab));
    }

    @Test
    public void resizeWindow(){
        resizablePage.resizeWindow();
    }


}