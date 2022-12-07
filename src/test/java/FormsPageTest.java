import org.testng.annotations.Test;
import pages.BasicPage;
import pages.FormsPage;

import static framework.BasePage.initPage;

public class FormsPageTest extends BaseTest{
    FormsPage formsPage;

    @Test
    public void openForms(){
        initPage(BasicPage.class).goToAlertWindowsTab();
    formsPage = initPage(FormsPage.class).openFormsTab();
    }
}
