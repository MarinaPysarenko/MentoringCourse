import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicPage;
import pages.ToolTipsPage;
import steps.ToolTipsPageSteps;

import static framework.BasePage.initPage;
import static org.fest.assertions.Assertions.assertThat;

public class ToolTipsTests extends BaseTest{
    ToolTipsPage toolTipsPage;
    ToolTipsPageSteps toolTipsPageSteps;

    @BeforeMethod(alwaysRun = true)
    public void preconditions() {
        initPage(BasicPage.class).goToWidgetsSection();
        toolTipsPageSteps = initPage(ToolTipsPageSteps.class).openToolTipsPage();
        toolTipsPage = initPage(ToolTipsPage.class);
    }

    @Test
    public void verifyHeader(){
        assertThat(toolTipsPage.getHeaderText().equals("Tool Tips"));
    }

    @Test
    public void hoverMeToSee(){
        toolTipsPageSteps.hoverToElement();
        assertThat(toolTipsPage.hoverOverTheButton().equals("You hovered over the Button"));
    }

    @Test
    public void verifyToolTipTextFieldInput(){
        toolTipsPageSteps.hoverTextFieldElement();
        assertThat(toolTipsPage.getToolTipHoverTextFieldElement().equals("You hovered over the text field"));
    }

    @Test
    public void verifyToolTipContrary(){
        toolTipsPageSteps.hoverContraryElement();
        assertThat(toolTipsPage.getToolTipHoverContraryElement().equals("You hovered over the Contrary"));
    }

    @Test
    public void verifyToolTipInSection(){
        toolTipsPageSteps.hoverToTextElement();
        assertThat(  toolTipsPage.getToolTipSectionElement().equals("You hovered over the 1.10.32"));
    }
}
