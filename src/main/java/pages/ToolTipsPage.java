package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.*;

public class ToolTipsPage extends BasicPage {
    public final static String tool_tips_tab = "(//li[@id='item-6'])[2]";
    public final static String headerName = "//div[@class='pattern-backgound playgound-header']";
    public final static String hover_me_To_See_button = "#toolTipButton";
    public final static String tool_tip_role = "buttonToolTip";
    public final static String tool_tip_textField = "textFieldToolTip";
    public final static String tool_Tip_Text_Field = "#toolTipTextField";
    public final static String contrary_tool_tip_link = "//a[normalize-space()='Contrary']";
    public final static String contrary_tool_tip = "contraryTexToolTip";
    public final static String text_tool_tip_link = "//a[normalize-space()='1.10.32']";
    public final static String section_tool_tip = "sectionToolTip";


    @FindBy(xpath = tool_tips_tab)
    WebElement toolTipsTab;

    @FindBy(css = hover_me_To_See_button)
    WebElement hoverMeToSeeButton;

    @FindBy(id = tool_tip_role)
    WebElement toolTipRole;

    @FindBy(id = tool_tip_textField)
    WebElement toolTipTextField;

    @FindBy(id = contrary_tool_tip)
    WebElement contraryToolTip;

    @FindBy(id = section_tool_tip)
    WebElement sectionToolTip;

    @FindBy(css = tool_Tip_Text_Field)
    WebElement toolTipTextFieldInput;

    @FindBy(xpath = contrary_tool_tip_link)
    WebElement contraryToolTipLink;

    @FindBy(xpath = text_tool_tip_link)
    WebElement textToolTip;


    public void goToToolTipsPage() {
        toolTipsTab.click();
    }

    public String getHeaderText() {
        return getText(headerName);
    }

    public void hoverToButtonElement() {
        hoverElement(hoverMeToSeeButton);
    }

    public String hoverOverTheButton() {
        waitForElementPresent(toolTipRole);
        return toolTipRole.getText();
    }

    public void hoverTextFieldElement() {
        hoverElement(toolTipTextFieldInput);
    }

    public void hoverToContraryElement() {
        hoverElement(contraryToolTipLink);
    }

    public void hoverToTextElement() {
        hoverElement(textToolTip);
    }

    public String getToolTipHoverTextFieldElement() {
        waitForElementPresent(toolTipTextField);
        System.out.println(toolTipTextField.getText());
        return toolTipTextField.getText();
    }

    public String getToolTipHoverContraryElement() {
        waitForElementPresent(contraryToolTip);
        System.out.println(contraryToolTip.getText());
        return contraryToolTip.getText();
    }

    public String getToolTipSectionElement() {
        waitForElementPresent(sectionToolTip);
        System.out.println(sectionToolTip.getText());
        return sectionToolTip.getText();
    }


}
