package steps;

import io.qameta.allure.Step;
import pages.BasicPage;
import pages.ToolTipsPage;

import static framework.Utils.scrollDown;
import static framework.Utils.scrollUp;

public class ToolTipsPageSteps extends BasicPage {
    ToolTipsPage toolTipsPage = initPage(ToolTipsPage.class);

    @Step
    public ToolTipsPageSteps openToolTipsPage(){
        scrollDown();
        toolTipsPage.goToToolTipsPage();
        scrollUp();
        return initPage(ToolTipsPageSteps.class);
    }

    @Step
    public ToolTipsPageSteps hoverToElement(){
        toolTipsPage.hoverToButtonElement();
        return this;
    }

    @Step
    public ToolTipsPageSteps hoverTextFieldElement(){
        toolTipsPage.hoverTextFieldElement();
        return this;
    }

    @Step
    public ToolTipsPageSteps hoverContraryElement(){
        toolTipsPage.hoverToContraryElement();
        return this;
    }

    @Step
    public ToolTipsPageSteps hoverToTextElement(){
        toolTipsPage.hoverToTextElement();
        return this;
    }


}
