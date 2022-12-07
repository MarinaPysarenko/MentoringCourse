package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static framework.Utils.moveElement;

public class SlidersPage extends BasicPage {
    public final String slider_Tab = "(//li[@id='item-3'])[3]";
    public final String slider_Tab_Header = "//div[@class='pattern-backgound playgound-header']";
    public final String slider_Element = "(//input[@type='range'])[1]";
    public final String slider_Input = "sliderValue";


    @FindBy(xpath = slider_Tab)
    WebElement sliderTab;

    @FindBy(xpath = slider_Tab_Header)
    WebElement sliderTabHeader;

    @FindBy(xpath = slider_Element)
    WebElement sliderElement;

    @FindBy(id = slider_Input)
    WebElement sliderInput;


    public void goToSliderTab() {
        sliderTab.click();
    }

    public String getHeaderText() {
        System.out.println(sliderTabHeader.getText());
        return sliderTabHeader.getText();
    }


    public void movesSlider() {
        moveElement(sliderElement);
    }

    public String getValueSliderFromAttribute() {
        System.out.println(sliderElement.getAttribute("value"));
        return sliderElement.getAttribute("value");
    }

    public String getDataFromSliderInput() {
        System.out.println(sliderInput.getAttribute("value"));
        return sliderInput.getText();
    }
}
